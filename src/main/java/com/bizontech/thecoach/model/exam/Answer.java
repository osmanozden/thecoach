package com.bizontech.thecoach.model.exam;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "answer_")
public class Answer extends BaseEntity {}
