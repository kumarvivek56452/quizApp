package com.telusko.quizapp.dao;

import com.telusko.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDAO extends JpaRepository<Question, Integer> {


    List<Question> findByCategory(String Category);

    @Query(value="select * from question q where q.category=:category order by RANDOM() LIMIT :noq",nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int noq);
}
