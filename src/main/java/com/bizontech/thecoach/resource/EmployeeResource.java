package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import com.codefirst.robin.model.StoredObject;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Data
public class EmployeeResource extends AbstractResource {

  private String identityNumber;

  private String iban;

  private CompanyResource company;

  private LocalDate jobStartDate;

  private LocalDate jobQuitDate;

  private EmployeeResource manager;

  private String address;

  private ProfileResource convertedProfile;

  private List<StoredObject> employeeDocuments;

  private StoredObject picture;

  private UserResource user;

  private Boolean isManagerUser;
}
