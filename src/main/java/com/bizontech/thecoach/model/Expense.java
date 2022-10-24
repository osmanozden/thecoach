package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Data
@Entity
@Table(name = "expense")
public class Expense extends BaseEntity {

  @DateTimeFormat(pattern = "dd.MM.yyyy")
  @Column(name = "receiptsDate")
  public LocalDate receiptsDate;

  @ManyToOne
  @JoinColumn(name = "company_id", referencedColumnName = "base_id")
  private Company company;

  @ManyToOne private User robinUser;

  @ManyToOne()
  @JoinColumn(name = "status_id", referencedColumnName = "base_id")
  private Attribute status;

  @Column(name = "project")
  private String project;

  @Column(name = "amount")
  private Double amount;

  @Column(name = "description")
  private String description;

  @Column(name = "tax_type")
  private String taxType;

  @Column(name = "currency_type")
  private String currencyType;

  @Column(name = "expense_type")
  private String expensesType;

  @Column(name = "payment_type")
  private String paymentType;

  @OneToMany(cascade = CascadeType.ALL)
  private List<StoredObject> storedObjects;

  @Column(name = "receipts")
  private String fileName;

  @ManyToOne
  @JoinColumn(name = "manager_id", referencedColumnName = "base_id")
  private Employee manager;

  @Column(name = "merchant")
  private String merchant;
}
