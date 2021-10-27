package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.logic.flow.ViewPhotosFlow;

public class ViewPhotosFlowImpl implements ViewPhotosFlow
 {
     @Override
  public PhotosDto ViewPhotos(PhotosDto photos)
  {
    return photos;
  }

}
