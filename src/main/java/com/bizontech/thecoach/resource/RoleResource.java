package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import com.codefirst.robin.types.PrivilegeType;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
public class RoleResource extends AbstractResource {

  @NotBlank(message = "'name' alanı doldurulmalıdır")
  private String name;

  private Set<PrivilegeType> privileges;
}
