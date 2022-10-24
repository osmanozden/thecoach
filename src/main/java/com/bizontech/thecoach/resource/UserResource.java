package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import com.codefirst.robin.model.StoredObject;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class UserResource extends AbstractResource {

  private String email;

  private String password;

  private String firstName;

  private String lastName;

  private List<ProfileResource> profileList;

  private String resetKey;

  private List<RoleResource> roles;

  private List<AddressResource> addressList;

  private TokenResource tokenDto;

  private String phoneNumber;

  private Long teamId;

  private boolean isTeamExecutive;

  private Long defaultTeamId;

  private long companyId;

  private String address;

  private StoredObject profilePicture;

  private String userName;

  private Boolean canTechnicalApprove;

  public UserResource(String name, String surName, String email, List<RoleResource> roles) {
    this.firstName = name;
    this.lastName = surName;
    this.email = email;
    this.roles = roles;
  }

  public UserResource(String email, String pass) {
    this.email = email;
    this.password = pass;
  }
}
