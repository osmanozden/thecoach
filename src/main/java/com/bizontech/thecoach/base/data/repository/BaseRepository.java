package com.bizontech.thecoach.base.data.repository;

import com.bizontech.thecoach.base.data.entity.BaseEntity;
import com.bizontech.thecoach.model.Team;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity, PK extends Serializable>
    extends PagingAndSortingRepository<T, PK>,
        JpaRepository<T, PK>,
        JpaSpecificationExecutor<T>,
        CrudRepository<T, PK> {

  List<T> findAllByTeam(Team team);

  Page<T> findAllByTeam(Team team, Pageable pageable);

  long countByTeam(Team team);
}
