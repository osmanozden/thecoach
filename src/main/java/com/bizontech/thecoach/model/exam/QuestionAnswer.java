package com.bizontech.thecoach.model.exam;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "question_answer")
public class QuestionAnswer extends BaseEntity {

  @OneToOne
  @JoinColumn(name = "question_id", referencedColumnName = "base_id")
  private Question question;

  @OneToOne
  @JoinColumn(name = "answer_id", referencedColumnName = "base_id")
  private Answer answer;
}
