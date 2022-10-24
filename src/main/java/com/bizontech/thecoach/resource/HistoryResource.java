package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

import java.util.Date;

@Data
public class HistoryResource extends AbstractResource {

  private Date date;

  private String description;

  private String objectId;

  private String fileName;

  private SpecialityResource speciality;
}
