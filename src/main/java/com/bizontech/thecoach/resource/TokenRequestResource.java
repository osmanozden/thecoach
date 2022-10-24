package com.bizontech.thecoach.resource;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class TokenRequestResource {
  @NotBlank(message = "'email' alanı doldurulmalıdır")
  private String email;

  @NotBlank(message = "'name' alanı doldurulmalıdır")
  private String password;
}
