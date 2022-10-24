package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "employee_vacation")
public class EmployeeVacation extends BaseEntity {

  @Column(name = "start_date")
  private Date startDate;

  @Column(name = "end_date")
  private Date endDate;

  @ManyToOne
  @JoinColumn(name = "manager_id", referencedColumnName = "base_id")
  private Employee manager;

  @Column(name = "comment")
  private String comment;

  private Long requesterID;

  @ManyToOne()
  @JoinColumn(name = "status_id", referencedColumnName = "base_id")
  private Attribute status;

  @ManyToOne
  @JoinColumn(name = "company_id", referencedColumnName = "base_id")
  private Company company;
}
