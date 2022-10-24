package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import com.codefirst.robin.model.StoredObject;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserSettingsResource extends AbstractResource {

  private String email;

  private String phoneNumber;

  private StoredObject profilePicture;

  private String username;

  private long userId;

  public UserSettingsResource(
      String email, String phoneNumber, StoredObject profilePicture, String userName, Long userId) {
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.profilePicture = profilePicture;
    this.username = userName;
    this.userId = userId;
  }
}
