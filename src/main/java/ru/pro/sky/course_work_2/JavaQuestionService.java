package ru.pro.sky.course_work_2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Service
public class JavaQuestionService implements QuestionService {

    List<Question> questions = new ArrayList<>(List.of(
            new Question("Самая длинная река в мире?", "Нил"),
            new Question("Год основания Netflix?", "1997"),
            new Question("Что если акуле почесать нос?", "Впадет в транс"),
            new Question("Сколько часовых поясов в России?", "11"),
            new Question("Java - ...", "Кофе:)")
    ));


    @Override
    public Question add(String question, String answer) {
        Question quest = new Question(question, answer);
        questions.add(quest);
        return quest;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> gelAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        Random rand = new Random();
        int collect = questions.size();
        int randomIndex = rand.nextInt(collect);
        return questions.get(randomIndex);
    }
}
