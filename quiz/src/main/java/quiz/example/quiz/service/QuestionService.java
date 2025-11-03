package quiz.example.quiz.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quiz.example.quiz.entitity.Question;
import quiz.example.quiz.repo.QuestionRepo;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public List<Question> getAllQuestions()
    {
        return questionRepo.findAll();
    }

    public Question saveQuestion(Question question){
        return questionRepo.save(question);
    }
}
