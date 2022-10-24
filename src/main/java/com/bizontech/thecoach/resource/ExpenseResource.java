package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpenseResource extends AbstractResource {

  private String expensesType;

  private String currencyType;

  private String paymentType;

  private String taxType;

  private UserResource robinUser;

  private AttributeResource status;

  private Double amount;

  private CompanyResource company;

  private Boolean disabled;

  private LocalDate receiptsDate;

  private StoredObjectResource receipts;

  private String project;

  private String description;

  private EmployeeResource manager;

  private String merchant;
}
