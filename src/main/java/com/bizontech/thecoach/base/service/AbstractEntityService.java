package com.bizontech.thecoach.base.service;

import com.bizontech.thecoach.base.data.entity.BaseEntity;
import com.bizontech.thecoach.base.data.repository.BaseRepository;
import com.bizontech.thecoach.dto.FilterDto;
import com.bizontech.thecoach.model.Company;
import com.bizontech.thecoach.model.User;
import com.bizontech.thecoach.repository.UserRepository;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import com.bizontech.thecoach.respository.UserRepository;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;

public abstract class AbstractEntityService<T extends BaseEntity, PK extends Serializable> {

  public abstract BaseRepository<T, PK> getRepository();

  private static final Logger LOGGER = LoggerFactory.getLogger(AbstractEntityService.class);

  @Autowired private UserRepository userRepository;

  protected T verifySave(T entity) {
    return entity;
  }

  protected T verifyPut(T theReal, T forSave) {
    return forSave;
  }

  protected T verifyDelete(T entity) {
    return entity;
  }

  @Transactional
  public T save(T entity) {
    verifySave(entity);
    entity.setTeam(getCurrentUser().getTeam());
    return getRepository().save(entity);
  }

  public User getCurrentUser() {
    var id =
        Long.parseLong(
            SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
    var user = userRepository.findById(id).get();
    return user;
  }


  @Transactional
  public T put(PK id, T forSave) {
    T theReal = getEntity(id);
    forSave.setId(theReal.getId());
    forSave.setCreatedDate(theReal.getCreatedDate());
    verifyPut(theReal, forSave);
    forSave.setTeam(getCurrentUser().getTeam());
    return getRepository().save(forSave);
  }

  @Transactional
  public void delete(PK id) {
    T entity = getEntity(id);
    verifyDelete(entity);
    getRepository().delete(entity);
  }

  public T getEntity(PK id) {

    Optional<T> entity = getRepository().findById(id);
    if (entity.isPresent()) {
      return entity.get();
    }
    return null;
  }

  public List<T> all() {
    var id =
        Long.parseLong(
            SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
    var user = userRepository.findById(id).get();
    return getRepository().findAllByTeam(user.getTeam());
  }

  public long numbersOfEntity() {
    return getRepository().countByTeam(getCurrentUser().getTeam());
  }

  public Page<T> allByPage(int pageNo, int size) {
    Pageable pageable = PageRequest.of(pageNo, size);
    Page<T> allPage = getRepository().findAllByTeam(getCurrentUser().getTeam(), pageable);
    return allPage;
  }

  public Page<T> getAllByFilter(FilterDto filterDto, Pageable pageable)
      throws NotImplementedException {
    throw new NotImplementedException("Not implemented");
  }
}
