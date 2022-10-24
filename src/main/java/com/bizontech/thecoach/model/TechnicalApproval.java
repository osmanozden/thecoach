package com.bizontech.thecoach.model;


import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "technical_approval")
public class TechnicalApproval extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "base_id")
    private Profile candidate;

    @ManyToMany
    @JoinTable(
            name = "technical_approval_positions",
            joinColumns = {@JoinColumn(name = "technical_approval_id", referencedColumnName = "base_id")},
            inverseJoinColumns = {@JoinColumn(name = "position_id", referencedColumnName = "base_id")}
    )
    private List<Position> position;

    @OneToOne
    @JoinColumn(name = "technical_status_id")
    private Attribute technicalStatus;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "profile_technical_aproval_comment",
            joinColumns = {@JoinColumn(name = "technical_approval_id", referencedColumnName = "base_id")},
            inverseJoinColumns = {@JoinColumn(name = "comment_id", referencedColumnName = "base_id")}
    )
    private List<TechnicalComment> comment = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "reviewer_id", referencedColumnName = "base_id")
    private  User reviewer;
}
