package marketing.company.web.controller;

/*
import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.services.AlbumsGeneralResponse;
import marketing.company.logic.flow.ViewAlbumsFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@SpringBootApplication

//@RestController
//@RequestMapping("marketing-company")


 */

import org.jetbrains.annotations.Contract;

public class AlbumsController
{
    @Contract
   public AlbumsController()
    {

    }
   // @Autowired

/*
    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured Account types.", notes = "Returns a list of account types")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = AlbumsGeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = AlbumsGeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = AlbumsGeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = AlbumsGeneralResponse.class),
    })
    public ResponseEntity<AlbumsGeneralResponse<List<AlbumsDto>>>GetAll() {
        List<AlbumsDto> albums = viewAlbumsFlow.getAllAlbums();

        AlbumsGeneralResponse<List<AlbumsDto>> response = new AlbumsGeneralResponse<List<AlbumsDto>>(true, albums);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    public AlbumsGeneralResponse<String> getAll() {
        return new AlbumsGeneralResponse<String>(true, "No Types Found");
    }
        @Autowired
         public AlbumsController(ViewAlbumsFlow viewAlbumsFlow) {
            this.viewAlbumsFlow = viewAlbumsFlow;

    }
    private final ViewAlbumsFlow viewAlbumsFlow;

 */

}
