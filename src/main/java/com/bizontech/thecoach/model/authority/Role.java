package com.bizontech.thecoach.model.authority;

import com.codefirst.robin.base.data.entity.BaseEntity;
import com.codefirst.robin.types.PrivilegeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Data
@Table(name = "robinrole")
public class Role extends BaseEntity {

  @Column(name = "name")
  private String name;

  @Column(name = "user_id")
  private Long userId;

  @ElementCollection(targetClass = PrivilegeType.class, fetch = FetchType.EAGER)
  @Column(name = "roles_authorities", nullable = false)
  @JoinTable()
  @Enumerated(EnumType.STRING)
  private Set<PrivilegeType> authorities;

  public Role(String name) {
    this.name = name;
  }
}
