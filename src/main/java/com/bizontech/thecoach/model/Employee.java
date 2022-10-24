package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(
    name = "employee",
    uniqueConstraints = {
      @UniqueConstraint(
          name = "user_id",
          columnNames = {"user_id"}),
    })
public class Employee extends BaseEntity {

  @Column(name = "identityNumber")
  private String identityNumber;

  @Column(name = "iban")
  private String iban;

  @Column(name = "jobStartDate")
  private LocalDate jobStartDate;

  @Column(name = "jobQuitDate")
  private LocalDate jobQuitDate;

  @ManyToOne()
  @JoinColumn(name = "manager_id")
  private Employee manager;

  @Column(name = "address")
  private String address;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "profile_id", referencedColumnName = "base_id")
  private Profile convertedProfile;

  @OneToMany(cascade = CascadeType.ALL)
  private List<StoredObject> employeeDocuments;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "picture_id", referencedColumnName = "base_id")
  private StoredObject picture;

  @Column(name = "isManager")
  private Boolean isManagerUser;

  @OneToOne
  @JoinColumn(name = "user_id", referencedColumnName = "base_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "company_id")
  private Company company;
}
