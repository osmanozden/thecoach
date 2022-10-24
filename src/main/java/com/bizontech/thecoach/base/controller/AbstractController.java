package com.bizontech.thecoach.base.controller;

import com.bizontech.thecoach.base.data.entity.BaseEntity;
import com.bizontech.thecoach.base.dto.BaseDto;
import com.bizontech.thecoach.base.mapper.Converter;
import com.bizontech.thecoach.base.resource.AbstractResource;
import com.bizontech.thecoach.base.service.AbstractEntityService;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractController<
    DTO extends BaseDto,
    Entity extends BaseEntity,
    Resource extends AbstractResource,
    PK extends Serializable> {
  protected abstract AbstractEntityService<Entity, Long> getService();

  protected abstract Converter<DTO, Entity, Resource> getConverter();

  protected List<Resource> toResource(List<Entity> all) {
    if (CollectionUtils.isNotEmpty(all)) {
      return all.stream().map(e -> getConverter().toResource(e)).collect(Collectors.toList());
    }
    return null;
  }

  protected Resource toResource(Entity entity) {
    if (entity != null) {
      return getConverter().toResource(entity);
    }
    return null;
  }

  protected Resource toResource(Optional<Entity> entity) {
    return entity.map(this::toResource).orElse(null);
  }

  protected void clearAuditing(AbstractResource resource) {
    if (resource != null) {
      resource.setUpdateDate(null);
      resource.setCreatedDate(null);
    }
  }
}
