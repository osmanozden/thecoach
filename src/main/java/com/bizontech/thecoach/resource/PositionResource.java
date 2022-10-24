package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class PositionResource extends AbstractResource {

  private String detail;

  private Integer priority = 10;

  private String title;

  private String description;

  @NotNull(message = "'imperativeSpecialities' alanı doldurulmalıdır")
  private List<SpecialityResource> imperativeSpecialities;

  private List<SpecialityResource> niceToHaveSpecialities;

  private CompanyResource company;

  private String location;

  private Integer size = 1;

  private String experience;

  private ContactResource contact;

  private AttributeResource workStyle;

  private List<PositionApplyResource> positionApplies;

  private AttributeResource progressStatus;

  private AttributeResource closeReason;
}
