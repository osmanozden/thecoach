package com.bizontech.thecoach.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class FilterDto {

  private List<Long> ids;



  private String searchText;

  private Date createDate;

  private Date updateDate;

  private Date startDate;

  private Date endDate;

  private Date createStartDate;

  private Date createEndDate;

  private Date updateStartDate;

  private Date updateEndDate;


}
