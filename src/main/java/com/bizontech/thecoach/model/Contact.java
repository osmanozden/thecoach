package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Data
@Entity
@Table(
    name = "contact",
    uniqueConstraints = {
      @UniqueConstraint(
          name = "mail",
          columnNames = {"mail"})
    })
public class Contact extends BaseEntity {

  @Column(name = "name_")
  private String name;

  @Column(name = "phone")
  private String phoneNumber;

  @Column(name = "mail")
  private String mail;

  @Column(name = "company_id")
  private long companyId;

  @Override
  public String toString() {
    return name + "\n" + mail;
  }
}
