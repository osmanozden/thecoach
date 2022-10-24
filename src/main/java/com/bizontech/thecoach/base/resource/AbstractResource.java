package com.bizontech.thecoach.base.resource;

import com.bizontech.thecoach.resource.TeamResource;
import com.bizontech.thecoach.resource.UserResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class AbstractResource implements Serializable {
  protected Long id;

  protected String createdDate;

  protected String updateDate;

  protected boolean success;

  protected String message;

  protected String resultCode;

  protected TeamResource teamResource;

  protected UserResource editedBy;

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    return getClass() == obj.getClass() && Objects.equals(id, ((AbstractResource) obj).id);
  }
}
