package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "job")
public class Job extends BaseEntity {

  @Column(name = "title")
  private String title;

  @Column(name = "description", length = 2000)
  private String description;

  @Column(name = "detail")
  private String detail;

  @Column(name = "company")
  private String company;

  @Column(name = "startDate")
  private String startDate;

  @Column(name = "endDate")
  private String endDate;

  @Column(name = "webSite")
  private String webSite;
}
