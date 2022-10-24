package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@SuperBuilder
@NoArgsConstructor
@Data
@Entity
@Table(name = "company")
public class Company extends BaseEntity {
  @Column(name = "name_")
  private String name;

  @Column(name = "detail")
  private String detail;

  @ManyToOne()
  @JoinColumn(name = "company_type_id")
  private Attribute type;

  @Column(name = "payment_department_number")
  private String paymentDepartmentNumber;

  @Column(name = "payment_department_name")
  private String paymentDepartmentName;

  @ManyToOne
  @JoinColumn(name = "contact_id", referencedColumnName = "base_id")
  private Contact contact;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Column(name = "mail")
  private String mail;

  @Column(name = "invoice_info")
  private String invoiceInfo;
}
