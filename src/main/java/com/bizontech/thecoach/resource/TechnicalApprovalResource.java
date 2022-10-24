package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

import java.util.List;

@Data
public class TechnicalApprovalResource extends AbstractResource {

    private ProfileResource candidate;

    private List<PositionResource> position;

    private AttributeResource technicalStatus;

    private List<TechnicalCommentResource> comment;

    private UserResource reviewer;

}
