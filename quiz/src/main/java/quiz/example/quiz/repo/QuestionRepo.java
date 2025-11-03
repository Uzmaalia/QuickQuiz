package quiz.example.quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quiz.example.quiz.entitity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question,Long> {
}
