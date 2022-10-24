package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

import java.util.Date;

@Data
public class TokenResource extends AbstractResource {
  private String token;
  private Date expireDate;
}
