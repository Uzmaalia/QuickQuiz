package quiz.example.quiz.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quiz.example.quiz.entitity.QuizQuestion;
import quiz.example.quiz.repo.QuestionRepo;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public List<QuizQuestion> getAllQuestions()
    {
        List<QuizQuestion> questionRepoAll = questionRepo.findAll();
        return questionRepoAll;
    }

    public QuizQuestion saveQuestion(QuizQuestion question){
        QuizQuestion save = questionRepo.save(question);
        return save;
    }
}
