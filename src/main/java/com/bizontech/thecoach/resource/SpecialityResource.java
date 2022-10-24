package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Data
public class SpecialityResource extends AbstractResource {
  @NotBlank(message = "'name' alanı doldurulmalıdır")
  private String name;

  public SpecialityResource() {
    this.name = name;
  }
}
