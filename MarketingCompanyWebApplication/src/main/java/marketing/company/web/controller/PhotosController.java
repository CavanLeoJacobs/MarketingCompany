package marketing.company.web.controller;


/*
import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.services.PhotosGeneralResponse;
import marketing.company.logic.flow.ViewAlbumsFlow;
import marketing.company.logic.flow.ViewPhotosFlow;
import marketing.company.web.exceptions.PageNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@SpringBootApplication
@RestController
@RequestMapping("marketing-company")



/*
@SpringBootApplication
@RestController
@RequestMapping("Controllor")

   /* @GetMapping("/onemore")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class),
    })
*/



    //public GeneralResponse<String> getAll() {
     //   return new GeneralResponse<String>(true, "No Types Found");
    //}

  //  @GetMapping("/all")
   // @ApiOperation(value = "Gets all the configured Account types.", notes = "Returns a list of account types")
   // @ApiResponses(value = {
     //       @ApiResponse(code = 200, message = "Account types returned", response = PhotosGeneralResponse.class),
       //     @ApiResponse(code = 400, message = "Bad Request", response = PhotosGeneralResponse.class),
         //   @ApiResponse(code = 404, message = "Not found", response = PhotosGeneralResponse.class),
           // @ApiResponse(code = 500, message = "Internal Server Error", response = PhotosGeneralResponse.class),
   // })

   // public ResponseEntity<PhotosGeneralResponse<List<PhotosDto>>> GetAll() {
     //   List<PhotosDto> photos = viewPhotosFlow.getAllPhotos();

       // PhotosGeneralResponse<List<PhotosDto>> response = new PhotosGeneralResponse<List<PhotosDto>>(true, photos);
        //return new ResponseEntity<>(response, HttpStatus.OK);
    /*}


    public PhotosGeneralResponse<String> getAll() {
        return new PhotosGeneralResponse<String>(true, "No Types Found");
    }
    @Autowired
    public PhotosController(ViewPhotosFlow viewPhotosFlow) {
        this.viewPhotosFlow = viewPhotosFlow;

    }
    private final ViewPhotosFlow viewPhotosFlow;
}

     */
       public class PhotosController {



       }