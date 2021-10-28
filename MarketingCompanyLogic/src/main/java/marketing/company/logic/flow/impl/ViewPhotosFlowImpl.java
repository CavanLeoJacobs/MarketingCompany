package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.logic.flow.ViewPhotosFlow;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ViewPhotosFlowImpl implements ViewPhotosFlow
 {
    // @Override
  //public PhotosDto ViewPhotos()
  //{
   // return null;
  //}
     @Override
     public List<PhotosDto> getAllPhotos() {
         List<PhotosDto> photos = new ArrayList<>();
        // accountTypeDto.add(new PhotosDto("MILES", "Miles", LocalDate.now()));
         return photos;
     }

}
