package com.bizontech.thecoach.base.controller;

import com.bizontech.thecoach.base.data.entity.BaseEntity;
import com.bizontech.thecoach.base.dto.BaseDto;
import com.bizontech.thecoach.base.resource.AbstractResource;
import java.io.Serializable;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public abstract class AbstractReadEntityController<
        Dto extends BaseDto,
        Entity extends BaseEntity,
        Resource extends AbstractResource,
        PK extends Serializable>
    extends AbstractController<Dto, Entity, Resource, PK> {

  @GetMapping("/all")
  public List<Resource> all() {
    List<Entity> all = getService().all();
    return toResource(all);
  }

  @GetMapping("/{id}")
  public Resource get(@PathVariable("id") PK id) {
    return getConverter().toResource(getService().getEntity((Long) id));
  }

  @GetMapping("/all/numbersOf")
  public long getNumbersOf() {
    var numberOfEntity = getService().numbersOfEntity();
    return numberOfEntity;
  }
}
