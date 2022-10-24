package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

//@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "statistic")
public class Statistic extends BaseEntity {

}
