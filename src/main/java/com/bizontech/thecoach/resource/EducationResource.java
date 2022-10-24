package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import com.codefirst.robin.types.EducationLevelType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class EducationResource extends AbstractResource {

  private EducationLevelType educationLevel;

  private String info;

  private Date startDate;

  private Date endDate;

  private String institutionName;

  private String gpa;
}
