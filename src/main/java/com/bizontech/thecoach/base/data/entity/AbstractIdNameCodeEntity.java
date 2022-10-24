package com.bizontech.thecoach.base.data.entity;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class AbstractIdNameCodeEntity extends AbstractIdNameEntity {

  @Column(nullable = false)
  @NotNull
  public String code;
}
