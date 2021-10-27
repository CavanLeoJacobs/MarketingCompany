package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.persistence.Photos;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViewPhotosTest {
    private ViewPhotosFlowImpl photosV;
    private PhotosDto photos;
    @Before
    public void setUp() throws Exception
    {
photosV = new ViewPhotosFlowImpl();
    }
    @Test
    public void viewPhotos()
    {
        System.out.print(photosV.ViewPhotos(photos));
    }
}