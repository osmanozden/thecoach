package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "app_message")
public class AppMessage extends BaseEntity {}
