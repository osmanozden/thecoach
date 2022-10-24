package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "chat_message")
public class Message extends BaseEntity {

  @Column(name = "avatar")
  private String avatar;

  @Column(name = "text")
  private String text;

  @Column(name = "from_user")
  private String from;

  @Column(name = "time")
  private String time;

  @Column(name = "message_type")
  private String messageType;

  @Column(name = "viewed")
  private boolean viewed;
}
