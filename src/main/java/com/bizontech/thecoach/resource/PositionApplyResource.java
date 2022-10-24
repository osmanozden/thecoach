package com.bizontech.thecoach.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionApplyResource {
  private List<PositionApplyHistoryResource> positionApplyHistories;

  private List<ExamResource> exams;
}
