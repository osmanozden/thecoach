package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import com.codefirst.robin.types.EducationLevelType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.util.Date;

@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "education")
public class Education extends BaseEntity {
  @Column(name = "education_level")
  @Enumerated
  private EducationLevelType educationLevel;

  @Column(name = "info")
  private String info;

  @Column(name = "start_education_date")
  private Date startDate;

  @Column(name = "end_education_date")
  private Date endDate;

  @Column(name = "institution_name")
  private String institutionName;

  @Column(name = "gpa")
  private String gpa;
}
