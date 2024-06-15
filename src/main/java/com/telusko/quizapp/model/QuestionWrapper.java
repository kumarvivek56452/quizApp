package com.telusko.quizapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class QuestionWrapper {

    @Id
    @Column(name = "\"Id\"") // Quoted to match the case-sensitive column name in PostgreSQL
    private Integer Id;
    @Column(name = "option1")
    private String option1;
    @Column(name = "option2")
    private String option2;
    @Column (name = "option3")
    private String option3;
    @Column(name = "option4")
    private String option4;

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    @Column(name = "question_title")
    private String questionTitle;

    public QuestionWrapper(Integer id, String option1, String option2, String option3, String option4, String questionTitle) {
        Id = id;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.questionTitle = questionTitle;
    }
}
