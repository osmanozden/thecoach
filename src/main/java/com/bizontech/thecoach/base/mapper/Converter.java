package com.bizontech.thecoach.base.mapper;

import com.codefirst.robin.base.dto.IdDto;
import com.codefirst.robin.base.resource.IdResource;
import java.util.List;

public interface Converter<DTO, Entity, Resource> {

  Resource toResource(Entity entity);

  List<Resource> toResource(List<Entity> entityList);

  List<DTO> toDto(List<Entity> entityList);

  Entity toEntity(DTO dto);

  IdResource toIdResource(Entity entity);

  Entity toEntity(IdDto idDto);

  DTO toDto(Entity entity);
}
