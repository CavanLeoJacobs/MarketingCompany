package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.logic.flow.DeletePhotosFlow;

public class DeletePhotosFlowImpl implements DeletePhotosFlow
{
    PhotosDto delete=new PhotosDto();
    public DeletePhotosFlowImpl()
    {

    }

    public void DeletePhotos()
    {
        delete.getPhotoID();
        delete.getCapturedBy();
        delete.getGeolocation();
        delete.getTags();
    }

/*
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
}
