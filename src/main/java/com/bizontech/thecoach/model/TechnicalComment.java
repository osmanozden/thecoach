package com.bizontech.thecoach.model;


import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@NoArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "technical_comment")
public class TechnicalComment  extends BaseEntity {

    @Column(name = "message")
    private String message;

    @OneToOne
    @JoinColumn(name = "sender_id", referencedColumnName = "base_id")
    private User sender;
}
