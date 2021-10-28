package marketing.company.translator.Impl;

import marketing.company.domain.dto.AlbumsDto;

import marketing.company.domain.persistence.Albums;

import marketing.company.repo.persistence.AlbumsRepository;
import marketing.company.translator.AlbumsTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AlbumsTranslatorImpl implements AlbumsTranslator
{
    private final AlbumsRepository albumsRepository;
    @Autowired
    public AlbumsTranslatorImpl(AlbumsRepository albumsRepository)
    {
        this.albumsRepository= albumsRepository;
    }


    @Override
    public List<AlbumsDto> getAllAlbums()
    {

        List<AlbumsDto> albumsDto =new ArrayList<>();
        try
        {


            for (Albums albums :albumsRepository.findAll())
            {
                ///HERE new AlbumsDto(albums) NB!!!!!!!
                albumsDto.add(new AlbumsDto());
            }

        }
        catch (Exception error)
        {
            throw new RuntimeException("Unable to read from DB",error);
        }
        return albumsDto;
    }

}
