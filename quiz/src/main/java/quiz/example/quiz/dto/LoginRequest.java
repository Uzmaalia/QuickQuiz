package quiz.example.quiz.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
public class LoginRequest {

    // Getters and Setters
    private String username;
    private String password;

}
