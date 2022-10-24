package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "chat")
public class Chat extends BaseEntity {

    @Column(name = "fromName")
    private String fromName;

    @Column(name = "fromId")
    private Long fromId;

    @Column(name = "fromEmail")
    private String fromEmail;

    @Column(name = "destinationId")
    private Long destinationId;

    @Column(name = "destinationEmail")
    private String destinationEmail;

    @Column(name = "destinationName")
    private String destinationName;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "time")
    private LocalDate time;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "message_id", referencedColumnName = "base_id")
    private List<Message> messages;
}
