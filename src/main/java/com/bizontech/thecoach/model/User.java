package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import com.codefirst.robin.model.authority.Role;
import com.codefirst.robin.types.PrivilegeType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(
    name = "robin_user",
    uniqueConstraints = {
      @UniqueConstraint(
          name = "email",
          columnNames = {"email"}),
    })
public class User extends BaseEntity {

  @Column(name = "email")
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "firstname")
  private String firstName;

  @Column(name = "lastname")
  private String lastName;

  @Column(name = "username_")
  private String userName;

  @Column(name = "phonenumber_")
  private String phoneNumber;

  private boolean emailVerified;

  @OneToMany(mappedBy = "user")
  @JsonIgnore
  private List<Profile> profileList = new ArrayList<>();

  @OneToMany(mappedBy = "user")
  private List<Address> addressList;

  @Size(max = 36)
  @Column(name = "reset_key", length = 36)
  private String resetKey;

  @ManyToMany
  @JoinTable(
      name = "user_roles",
      joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "base_id")},
      inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "base_id")})
  private List<Role> roleList = new ArrayList<>();

  @ElementCollection(targetClass = PrivilegeType.class, fetch = FetchType.EAGER)
  @Column(name = "user_extra_authorities", nullable = false)
  @Enumerated(EnumType.STRING)
  private List<PrivilegeType> extraAuthorities = new ArrayList<>();

  @Column(name = "isTeamExecutiveUser")
  private boolean isTeamExecutive;

  @Column(name = "default_team_id")
  private Long defaultTeamId;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "profile_picture_id", referencedColumnName = "base_id")
  private StoredObject profilePicture;

  @Column(name = "canTechnicalApprove")
  private Boolean canTechnicalApprove;

  public User(String name, String lastName, String email, String pass) {
    this.firstName = name;
    this.lastName = lastName;
    this.password = pass;
    this.email = email;
  }

  public User(String email, String pass) {
    this.password = pass;
    this.email = email;
  }
}
