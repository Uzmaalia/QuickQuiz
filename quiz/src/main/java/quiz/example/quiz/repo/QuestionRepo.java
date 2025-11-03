package quiz.example.quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quiz.example.quiz.entitity.QuizQuestion;

@Repository
public interface QuestionRepo extends JpaRepository<QuizQuestion,Long> {
}
