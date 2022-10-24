package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "experience")
public class Experience extends BaseEntity {

  @OneToOne
  @JoinColumn(name = "company_id", referencedColumnName = "base_id")
  private Company company;

  @Column(name = "startdate")
  private Date startDate;

  @Column(name = "enddate")
  private Date endDate;

  @ManyToOne(fetch = FetchType.LAZY)
  private User user;

  @Column(name = "title")
  private String title;

  @Column(name = "description", length = 2000)
  private String description;

  @Column(name = "detail")
  private String detail;
}
