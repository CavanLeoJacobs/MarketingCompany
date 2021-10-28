package marketing.company.translator;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.dto.PhotosDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PhotosTranslator
{

    List<PhotosDto> getAllPhotos();

}
