package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(
    name = "team",
    uniqueConstraints = {
      @UniqueConstraint(
          name = "teamIdentityName",
          columnNames = {"teamIdentityName"})
    })
public class  Team extends BaseEntity {

  @Column(name = "teamIdentityName")
  private String teamIdentityName;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "executiveUserId")
  private Long executiveUserId;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "robin_user_id", referencedColumnName = "base_id")
  private List<User> members = new ArrayList<>();

  public Team(String email) {
    this.name = email;
  }
}
