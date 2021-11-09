package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

import static org.junit.Assert.*;

public class PhotosLogicTest {

    PhotosDto photosDto = new PhotosDto();

    @Before
    public void setUp() throws Exception
    {
        System.out.println("\n"+"Photo"+"\n");

        Random IDgenarator =new Random();
        LocalDate Date= LocalDate.now();
        photosDto.setPhotoID(IDgenarator.nextLong());
        photosDto.setTags("chess crown");
        photosDto.setCapturedDate(Date);
        photosDto.setCapturedBy(Date);
        photosDto.setGeolocation("geo");



    }
/*
 ViewPhotos();
    @Test
    public void DeletePhotos()
    {
        photosDto.getPhotoID();
        photosDto.setTags(null);
        photosDto.setCapturedDate(null);
        photosDto.setCapturedBy(null);
        photosDto.setGeolocation(null);
        ViewPhotos();
    }

    @Test
    public void ViewPhotos()
    {
       System.out.println("View"+"\n");
        System.out.println("photoID :"+photosDto.getPhotoID());
        System.out.println("Tags :"+photosDto.getTags());
         System.out.println("CapturedDate  :"+ photosDto.getCapturedDate());
         System.out.println("CapturedBy  :"+ photosDto.getCapturedBy());
        System.out.println("getGeolocation:" + photosDto.getGeolocation());
    }

    @Test
    public void CreatePhotos()
    {
        Random IDgenarator =new Random();
        IDgenarator.nextLong();
        photosDto.getPhotoID();
        photosDto.setTags(null);
        photosDto.setCapturedDate(null);
        photosDto.setCapturedBy(null);
        photosDto.setGeolocation(null);
        ViewPhotos();

    }


    */
}
