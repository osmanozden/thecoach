package com.bizontech.thecoach.base.dto;

import java.io.Serializable;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseDto implements Serializable {
  protected Long id;
  protected Boolean active = true;
  protected long teamId;

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    return getClass() == obj.getClass() && Objects.equals(id, ((BaseDto) obj).id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
