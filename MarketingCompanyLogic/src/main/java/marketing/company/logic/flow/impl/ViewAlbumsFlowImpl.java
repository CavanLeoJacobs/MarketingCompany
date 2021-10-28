package marketing.company.logic.flow.impl;


import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.dto.PhotosDto;
import marketing.company.logic.flow.ViewAlbumsFlow;

import java.util.ArrayList;
import java.util.List;


public class ViewAlbumsFlowImpl implements ViewAlbumsFlow
{
   //@Override
   //public AlbumsDto ViewAlbums()
   //{
//return null;
 //  }
   @Override
   public List<AlbumsDto> getAllAlbums() {
      List<AlbumsDto> albums = new ArrayList<>();
      // accountTypeDto.add(new PhotosDto("MILES", "Miles", LocalDate.now()));
      return albums;
   }

   //public AlbumsDto ViewAlbums(AlbumsDto viewAlbumsDto)
   //{
    //  return ViewAlbums(viewAlbumsDto);
   //}
}
