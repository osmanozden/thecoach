package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name = "speciality")
public class Speciality extends BaseEntity {

  @Column(name = "_name")
  private String name;

  @URL
  @Column(name = "icon_link")
  private String iconLink;

  public Speciality(String name) {
    this.name = name;
  }
}
