package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.logic.flow.CreatePhotosFlow;

public class CreatePhotosFlowImpl implements CreatePhotosFlow
{


    @Override
    public PhotosDto CreatePhotos()
    {
        return new PhotosDto();
    }
}
