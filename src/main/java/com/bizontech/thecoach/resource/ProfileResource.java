package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import com.codefirst.robin.types.ApplicantWorkLocationType;
import com.codefirst.robin.types.ApplicantWorkTimeType;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ProfileResource extends AbstractResource {

  private PositionResource positionApplied;

  private String email;

  private String education;

  private String comment;

  private String name;

  private String surname;

  private String linkedinUrl;

  private String salaryExpectation;

  private String salaryExpectationCurrency;

  private String noticeTime;

  private List<SpecialityResource> specialityList;

  private AttributeResource statusType;

  private String phone;

  private UserResource hrStuff;

  private List<EducationResource> educationHistory;

  private List<JobResource> jobHistories;

  private List<StoredObjectResource> storedObjects;

  private String fileName;

  private Date startWorkDate;

  private ApplicantWorkTimeType workTime;

  private ApplicantWorkLocationType workLocation;

  private List<AppMessageResource> appMessageList;

  private List<AddressResource> addressList;

  private List<PositionResource> appliedPositions;
}
