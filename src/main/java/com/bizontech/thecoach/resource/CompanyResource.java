package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

import java.util.List;

@Data
public class CompanyResource extends AbstractResource {

  private String name;

  private String detail;

  private List<UserResource> robinUserList;

  private AttributeResource type;

  private String paymentDepartmentNumber;

  private String paymentDepartmentName;

  private ContactResource contact;

  private String phoneNumber;

  private String mail;

  private String invoiceInfo;
}
