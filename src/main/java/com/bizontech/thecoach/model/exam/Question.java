package com.bizontech.thecoach.model.exam;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "question")
public class Question extends BaseEntity {

  private QuestionType type;
}
