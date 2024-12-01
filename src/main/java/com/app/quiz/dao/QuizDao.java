package com.app.quiz.dao;

import com.app.quiz.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao  extends JpaRepository<Quiz,Integer> {
}
