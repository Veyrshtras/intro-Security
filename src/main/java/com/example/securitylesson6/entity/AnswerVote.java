package com.example.securitylesson6.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter

public class AnswerVote extends BaseEntity{

    @ManyToOne
    private Answer answer;
}
