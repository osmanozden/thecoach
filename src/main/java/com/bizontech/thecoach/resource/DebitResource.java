package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

@Data
public class DebitResource extends AbstractResource {

  private String debitCode;

  private String brand;

  private String model;

  private String description;

  private String debitType;

  private EmployeeResource manager;

  private UserResource robinUser;

  private AttributeResource status;

  private CompanyResource company;
}
