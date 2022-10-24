package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import com.codefirst.robin.types.ApplicantStatusType;
import com.codefirst.robin.types.ApplicantWorkLocationType;
import com.codefirst.robin.types.ApplicantWorkTimeType;
import com.codefirst.robin.types.TechnicalStatusType;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Data
public class ApplicantResource extends AbstractResource {

  List<PositionResource> positions;
  private String name;
  private String surname;

  @NotBlank(message = "'linkedinUrl' alanı doldurulmalıdır")
  private String linkedinUrl;

  private Double priceExpectation;
  private String noticeTime;
  private SpecialityResource speciality;

  private ApplicantStatusType statusType;

  private TechnicalStatusType technicalStatus = TechnicalStatusType.NONE;

  private String technicalCommend;

  private String phoneNumber;

  private String address;

  private UserResource hrStuff;

  private String objectId;

  private String fileName;

  private Date startWorkDate;

  private ApplicantWorkLocationType workLocation;

  private ApplicantWorkTimeType workTime;

  private List<HistoryResource> history;
}
