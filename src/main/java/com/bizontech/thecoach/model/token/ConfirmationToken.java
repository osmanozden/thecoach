package com.bizontech.thecoach.model.token;

import com.codefirst.robin.base.data.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class ConfirmationToken extends BaseEntity {

  @Column(name = "confirmation_token")
  private String confirmationToken;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdDate;

  @Column(nullable = false, name = "email")
  private String email;

  private boolean isVerified;

  public ConfirmationToken(String email) {
    this.email = email;
    this.createdDate = new Date();
    this.confirmationToken = getAlphaNumericString();
  }

  public ConfirmationToken() {}

  public String getAlphaNumericString() {

    String AlphaNumericString =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

    StringBuilder sb = new StringBuilder(6);

    for (int i = 0; i < 6; i++) {

      int index = (int) (AlphaNumericString.length() * Math.random());

      sb.append(AlphaNumericString.charAt(index));
    }
    return sb.toString();
  }

  public String getConfirmationToken() {
    return confirmationToken;
  }

  public void setConfirmationToken(String confirmationToken) {
    this.confirmationToken = confirmationToken;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public boolean isVerified() {
    return isVerified;
  }

  public void setVerified() {
    this.isVerified = true;
  }

  @Override
  public String toString() {
    return confirmationToken;
  }
}
