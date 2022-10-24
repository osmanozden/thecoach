package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "History")
public class History extends BaseEntity {

  @Column(name = "date")
  private Date date;

  @Column(name = "description")
  private String description;

  @Column(name = "object_id")
  private String objectId;

  @Column(name = "file_name")
  private String fileName;

  @ManyToOne
  @JoinColumn(name = "speciality_id", referencedColumnName = "base_id")
  private Speciality speciality;
}
