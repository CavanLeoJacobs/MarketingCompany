package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.logic.flow.DeletePhotosFlow;

import java.text.DateFormat;
import java.util.Date;


public class DeletePhotosFlowImpl implements DeletePhotosFlow {


    public DeletePhotosFlowImpl() {

    }

    public PhotosDto DeletePhotos(PhotosDto photosDto)
    {



        photosDto.setPhotoID(null);
        photosDto.setCapturedBy(null);
        photosDto.setCapturedDate(null);
        photosDto.setCapturedBy(null);
        photosDto.setTags(null);

        // photosDto.getPhotoID();
        //delete.getCapturedBy();
        //delete.getGeolocation();
        photosDto.setTags(null);
        //delete.getCapturedDate();
        return null;
    }


    @Override
    public void DeletePhotos()
    {
        DeletePhotos(null);
    }
}




/*
  public PhotosDto DeletePhotos(PhotosDto photosDto)
    {
        return null;
    }


   // private final AccountTypeTranslator accountTypeTranslator;

  //  public  CreateAccountTypeFlowImpl (AccountTypeTranslator accountTypeTranslator)
    //{
    //    this.accountTypeTranslator=accountTypeTranslator;
    //}


@Override
    public PhotosDto DeletePhotos()
    {

       // PhotosDto photos = new PhotosDto();
      //  if (photos.==);
       // deleted

return null;
    }

 */

