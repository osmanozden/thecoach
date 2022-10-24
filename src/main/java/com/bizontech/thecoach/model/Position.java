package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "position")
public class Position extends BaseEntity {

  @Column(name = "priority")
  private Integer priority = 10;

  @Column(name = "title")
  private String title;

  @Column(name = "description", length = 2000)
  private String description;

  @Column(name = "detail")
  private String detail;

  @ManyToMany
  @JoinTable(
      name = "position_imperativeSpeciality",
      joinColumns = {@JoinColumn(name = "position_id", referencedColumnName = "base_id")},
      inverseJoinColumns = {@JoinColumn(name = "speciality_id", referencedColumnName = "base_id")})
  private List<Speciality> imperativeSpecialities;

  @ManyToMany
  @JoinTable(
      name = "position_speciality",
      joinColumns = {@JoinColumn(name = "position_id", referencedColumnName = "base_id")},
      inverseJoinColumns = {@JoinColumn(name = "speciality_id", referencedColumnName = "base_id")})
  private List<Speciality> niceToHaveSpecialities;

  @ManyToOne
  @JoinColumn(name = "company_id", referencedColumnName = "base_id")
  private Company company;

  @Column(name = "location")
  private String location;

  @Column(name = "size")
  private Integer size = 1;

  @Column(name = "experience")
  private String experience;

  @ManyToOne
  @JoinColumn(name = "contact_id", referencedColumnName = "base_id")
  private Contact contact;

  @OneToMany
  @JoinColumn(name = "position_apply_id", referencedColumnName = "base_id")
  private List<PositionApply> positionApplies;

  @OneToOne
  @JoinColumn(name = "pipeline_id", referencedColumnName = "base_id")
  private Pipeline pipeline;

  @ManyToOne()
  @JoinColumn(name = "workstyle_type_id")
  private Attribute workStyle;

  @ManyToOne()
  @JoinColumn(name = "progress_status_id")
  private Attribute progressStatus;

  @OneToOne
  @JoinColumn(name = "position_close_reason")
  private Attribute closeReason;
}
