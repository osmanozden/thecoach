package com.bizontech.thecoach.base.data.entity;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractIdNameEntity extends BaseEntity {
  @Column(nullable = false)
  @NotNull
  public String name;
}
