package com.bizontech.thecoach.base.controller;

import com.bizontech.thecoach.base.data.entity.BaseEntity;
import com.bizontech.thecoach.base.dto.BaseDto;
import com.bizontech.thecoach.base.resource.AbstractResource;

import java.io.Serializable;
import javax.validation.Valid;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public abstract class AbstractEntityController<
        DTO extends BaseDto,
        Entity extends BaseEntity,
        Resource extends AbstractResource,
        PK extends Serializable>
    extends AbstractReadEntityController<DTO, Entity, Resource, PK> {

  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") PK id) {
    getService().delete((Long) id);
  }

  @PostMapping
  public Resource save(@RequestBody @Valid DTO dto) {

    Entity entity = getService().save(getConverter().toEntity(dto));
    Resource resource = getConverter().toResource(entity);
    return resource;
  }

  @PutMapping("/{id}")
  public Resource put(@PathVariable("id") PK id, @RequestBody @Valid DTO dto) {
    Entity forSave = getConverter().toEntity(dto);
    Entity entity = getService().put((Long) id, forSave);
    Resource resource = getConverter().toResource(entity);
    return resource;
  }
}
