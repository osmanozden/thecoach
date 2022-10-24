package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "storedobject")
public class StoredObject extends BaseEntity {

  @Column()
  public String uid;

  @Column()
  public String name;

  public String fileName;

  @Column()
  public String storageType;
}
