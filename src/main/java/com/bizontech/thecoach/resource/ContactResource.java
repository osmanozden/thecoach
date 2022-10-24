package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ContactResource extends AbstractResource {

  private String name;

  private String phoneNumber;

  @NotBlank(message = "'mail' alanı doldurulmalıdır")
  private String mail;

  private String commend;

  private long companyId;
}
