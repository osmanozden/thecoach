package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

import java.util.Date;

@Data
public class EmployeeVacationResource extends AbstractResource {

  private Date startDate;

  private Date endDate;

  private EmployeeResource manager;

  private String comment;

  private long requesterID;

  private AttributeResource status;

  private CompanyResource company;
}
