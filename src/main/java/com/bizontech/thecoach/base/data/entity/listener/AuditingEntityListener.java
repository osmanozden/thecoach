package com.bizontech.thecoach.base.data.entity.listener;

import com.bizontech.thecoach.base.data.entity.BaseEntity;
import java.util.Date;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import org.springframework.stereotype.Component;

@Component
public class AuditingEntityListener {
  @PrePersist
  @PreUpdate
  public void setLastModifiedDate(BaseEntity entity) {
    if (entity.getId() == null) {
      entity.setCreatedDate(new Date());
    }
    entity.setUpdateDate(new Date());
  }
}
