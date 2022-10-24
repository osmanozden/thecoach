package com.bizontech.thecoach.model.token;

import com.codefirst.robin.base.data.entity.BaseEntity;
import com.codefirst.robin.model.Team;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@NoArgsConstructor
@Data
@Entity
public class Invitation extends BaseEntity {

  @Column(name = "invitation_token")
  private String invitationToken;

  @Column(nullable = false, name = "email")
  private String email;

  private boolean isAccepted;

  private boolean isExist;

  @ManyToOne(cascade = {CascadeType.MERGE})
  @JoinColumn(name = "team_id", referencedColumnName = "base_id")
  private Team team;

  public Invitation(String email, Team team) {
    this.email = email;
    this.team = team;
    this.invitationToken = UUID.randomUUID().toString();
  }
}
