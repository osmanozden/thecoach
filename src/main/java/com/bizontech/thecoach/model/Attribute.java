package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import com.codefirst.robin.types.AttributeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "attribute")
public class Attribute extends BaseEntity {

  @Enumerated(EnumType.STRING)
  @Column(name = "attribute_type")
  private AttributeType attributeType;

  @Column(name = "name")
  private String name;

  @Column(name = "translate_key")
  private String translateKey;
}
