package marketing.company.translator.Impl;

import marketing.company.domain.dto.PhotosDto;

import marketing.company.domain.persistence.Photos;
import marketing.company.repo.persistence.PhotosRepository;
import marketing.company.translator.PhotosTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PhotosTranslatorImpl implements PhotosTranslator
{
    private final PhotosRepository photosRepository;
    @Autowired
    public PhotosTranslatorImpl(PhotosRepository photosRepository)
    {
        this.photosRepository = photosRepository;
    }
    @Override
    public List<PhotosDto> getAllPhotos()
    {

        List<PhotosDto> photosDto =new ArrayList<>();
        try
        {
            for (Photos photos :photosRepository.findAll())
            {
                ///HERE new PhotosDto(photos) NB!!!!!!!
                photosDto.add(new PhotosDto());
            }

        }
        catch (Exception error)
        {
            throw new RuntimeException("Unable to read from DB",error);
        }
        return photosDto;
    }

}
