package quiz.example.quiz.entitity;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

import java.util.List;

@Setter
@Getter
@Entity
public class Options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long optionId;

    private String optionText;

    @ManyToOne
    @JoinColumn(name = "question_id" , nullable = false)
    private Question question;


}
