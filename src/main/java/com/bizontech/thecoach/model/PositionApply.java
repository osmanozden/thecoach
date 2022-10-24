package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import com.codefirst.robin.model.exam.Exam;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "position_apply")
public class PositionApply extends BaseEntity {

  @OneToMany
  @JoinColumn(name = "position_apply_history", referencedColumnName = "base_id")
  private List<PositionApplyHistory> positionApplyHistories;

  @OneToMany
  @JoinColumn(name = "exam_id", referencedColumnName = "base_id")
  private List<Exam> exams;
}
