package ru.pro.sky.course_work_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {
    QuestionService out = new JavaQuestionService();

    @Test
    void add() {
        Question result = new Question("Question1", "Answer1");
        assertEquals (result, out.add("Question1", "Answer1"));
    }

    @Test
    void testAdd() {
        Question result = new Question("1+1", "2");
        assertEquals(result, out.add(result));
    }

    @Test
    void remove() {
    }

    @Test
    void gelAll() {
    }

    @Test
    void getRandomQuestion() {
    }
}