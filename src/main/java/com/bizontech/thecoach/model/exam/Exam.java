package com.bizontech.thecoach.model.exam;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "exam")
public class Exam extends BaseEntity {

  @OneToMany
  @JoinTable(
      name = "exam_question_answer",
      joinColumns = {@JoinColumn(name = "exam_id", referencedColumnName = "base_id")},
      inverseJoinColumns = {
        @JoinColumn(name = "question_answer_id", referencedColumnName = "base_id")
      })
  private List<QuestionAnswer> questionAnswers;
}
