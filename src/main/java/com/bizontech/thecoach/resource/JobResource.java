package com.bizontech.thecoach.resource;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JobResource {
  private String title;

  private String description;

  private String detail;

  private String company;

  private String startDate;

  private String endDate;

  private String webSite;
}
