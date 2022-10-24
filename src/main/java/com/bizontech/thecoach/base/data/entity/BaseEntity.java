package com.bizontech.thecoach.base.data.entity;

import com.codefirst.robin.base.data.entity.listener.AuditingEntityListener;
import com.codefirst.robin.model.Team;
import com.codefirst.robin.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Where;
import org.springframework.core.style.ToStringCreator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@MappedSuperclass
@NoArgsConstructor
@Data
@SuperBuilder
@EntityListeners(AuditingEntityListener.class)
@Where(clause = "active = true")
public abstract class BaseEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "base_id")
  public Long id;

  @CreatedDate
  @Column(name = "createdate", nullable = false)
  public Date createdDate = new Date();

  @ManyToOne
  @JoinColumn(name = "team_id", referencedColumnName = "base_id")
  private Team team;

  @LastModifiedDate
  @Column(name = "updatedate")
  @JsonIgnore
  public Date updateDate = new Date();

  @Column(name = "active")
  public Boolean active = true;

  @ManyToOne
  @JoinColumn(name = "edited_by", referencedColumnName = "base_id")
  private User editedBy;

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    return obj != null && getClass() == obj.getClass() && Objects.equals(id, ((BaseEntity) obj).id);
  }

  @Override
  public String toString() {
    return toString(new ToStringCreator(this)).toString();
  }

  protected ToStringCreator toString(ToStringCreator creator) {
    return creator.append("id", getId());
  }
}
