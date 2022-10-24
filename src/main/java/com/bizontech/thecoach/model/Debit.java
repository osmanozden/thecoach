package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Data
@Entity
@Table(name = "debit")
public class Debit extends BaseEntity {

  @Column(name = "debit_code")
  private String debitCode;

  @Column(name = "brand")
  private String brand;

  @Column(name = "model")
  private String model;

  @ManyToOne
  @JoinColumn(name = "company_id", referencedColumnName = "base_id")
  private Company company;

  @ManyToOne private User robinUser;

  @ManyToOne()
  @JoinColumn(name = "status_id", referencedColumnName = "base_id")
  private Attribute status;

  @Column(name = "description")
  private String description;

  @ManyToOne
  @JoinColumn(name = "manager_id", referencedColumnName = "base_id")
  private Employee manager;

  @Column(name = "debit_type")
  private String debitType;
}
