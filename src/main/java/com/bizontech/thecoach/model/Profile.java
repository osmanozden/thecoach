package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import com.codefirst.robin.types.ApplicantWorkLocationType;
import com.codefirst.robin.types.ApplicantWorkTimeType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.persistence.CascadeType.MERGE;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "profile_")
public class Profile extends BaseEntity {

  @Column(name = "email")
  private String email;

  @Column(name = "education")
  private String education;

  @Column(name = "comment")
  private String comment;

  @Column(name = "name_")
  private String name;

  @Column(name = "surname")
  private String surname;

  @Column(name = "linkedin_url")
  private String linkedinUrl;

  @Column(name = "salary_expectation")
  private String salaryExpectation;

  @Column(name = "salary_expectation_currency")
  private String salaryExpectationCurrency;

  @Column(name = "ihbar_time")
  private String noticeTime;

  @ManyToMany(cascade = {MERGE})
  @JoinTable(
      name = "Applied_Positions",
      joinColumns = {@JoinColumn(name = "profile_id", referencedColumnName = "base_id")},
      inverseJoinColumns = {@JoinColumn(name = "position_id", referencedColumnName = "base_id")})
  private List<Position> appliedPositions;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
      name = "Profile_Speciality",
      joinColumns = {@JoinColumn(name = "profile_id", referencedColumnName = "base_id")},
      inverseJoinColumns = {@JoinColumn(name = "speciality_id", referencedColumnName = "base_id")})
  private List<Speciality> specialityList;

  @ManyToOne()
  @JoinColumn(name = "status_type_id")
  private Attribute statusType;

  @Column(name = "phone")
  private String phone;

  @OneToMany
  @JoinColumn(name = "address", referencedColumnName = "base_id")
  private List<Address> addressList;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "hr_stuff_id", referencedColumnName = "base_id")
  private User hrStuff;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "applicant_education_history",
      joinColumns = {@JoinColumn(name = "applicant_id", referencedColumnName = "base_id")},
      inverseJoinColumns = {
        @JoinColumn(name = "education_history_id", referencedColumnName = "base_id")
      })
  private List<Education> educationHistory = new ArrayList<>();

  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "applicant_job_history",
      joinColumns = {@JoinColumn(name = "applicant_id", referencedColumnName = "base_id")},
      inverseJoinColumns = {@JoinColumn(name = "job_history_id", referencedColumnName = "base_id")})
  private List<Job> jobHistories = new ArrayList<>();

  @OneToMany(cascade = CascadeType.ALL)
  private List<StoredObject> storedObjects;

  @Column(name = "file_name")
  private String fileName;

  @Column(name = "start_work_date")
  private Date startWorkDate;

  @Column(name = "work_time")
  @Enumerated
  private ApplicantWorkTimeType workTime;

  @Column(name = "work_location")
  @Enumerated
  private ApplicantWorkLocationType workLocation;

  @OneToMany
  @JoinColumn(name = "app_message", referencedColumnName = "base_id")
  private List<AppMessage> appMessageList;

  @ManyToOne private User user;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "profile_publication",
      joinColumns = {@JoinColumn(name = "profile_id", referencedColumnName = "base_id")},
      inverseJoinColumns = {
        @JoinColumn(name = "publicationName_id", referencedColumnName = "base_id")
      })
  private List<Publication> publicationName = new ArrayList<>();

  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "profile_awards",
      joinColumns = {@JoinColumn(name = "profile_id", referencedColumnName = "base_id")},
      inverseJoinColumns = {@JoinColumn(name = "awardsName_id", referencedColumnName = "base_id")})
  private List<Awards> awardsName = new ArrayList<>();

  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "profile_course",
      joinColumns = {@JoinColumn(name = "profile_id", referencedColumnName = "base_id")},
      inverseJoinColumns = {@JoinColumn(name = "courseName_id", referencedColumnName = "base_id")})
  private List<Course> courseName = new ArrayList<>();

  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "profile_interest",
      joinColumns = {@JoinColumn(name = "profile_id", referencedColumnName = "base_id")},
      inverseJoinColumns = {
        @JoinColumn(name = "publicationName_id", referencedColumnName = "base_id")
      })
  private List<Interest> interestName = new ArrayList<>();

  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "profile_reference",
      joinColumns = {@JoinColumn(name = "profile_id", referencedColumnName = "base_id")},
      inverseJoinColumns = {
        @JoinColumn(name = "referenceName_id", referencedColumnName = "base_id")
      })
  private List<Reference> referenceName = new ArrayList<>();
}
