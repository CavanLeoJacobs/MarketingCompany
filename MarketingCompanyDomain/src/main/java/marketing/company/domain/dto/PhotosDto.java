package marketing.company.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
@ApiModel(value="Photos",description="A DTO that represents the Photos")

public class PhotosDto implements Serializable
{
    private static final long serialVersionUID = 6568108165313641961L;

    private Long PhotoID;
    private String FileFormat;
    private String Geolocation;
    private String Tags;
    private LocalDate CapturedDate;
    private LocalDate CapturedBy;


    @Contract(pure = true)
    public PhotosDto() {
    }

    public PhotosDto(String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {
        FileFormat = fileFormat;
        Geolocation = geolocation;
        Tags = tags;
        CapturedDate = capturedDate;
        CapturedBy = capturedBy;
    }

    @Contract(pure = true)
    public PhotosDto(Long photoID, String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {
        PhotoID = photoID;
        FileFormat = fileFormat;
        Geolocation = geolocation;
        Tags = tags;
        CapturedDate = capturedDate;
        CapturedBy = capturedBy;
    }

    public PhotosDto(@NotNull PhotosDto photos)
    {
        this.setPhotoID(photos.getPhotoID());
        this.setFileFormat(photos.getFileFormat());
        this.setGeolocation(photos.getGeolocation());
        this.setTags(photos.getTags());
        this.setCapturedDate(photos.getCapturedDate());
        this.setCapturedBy(photos.getCapturedBy());
    }
    @ApiModelProperty(position=1 ,value = ("Photos.photoID"))
    public Long getPhotoID() {
        return PhotoID;
    }


    public String getFileFormat() {
        return FileFormat;
    }

    public String getGeolocation() {
        return Geolocation;
    }

    public String getTags() {
        return Tags;
    }

    public LocalDate getCapturedDate() {
        return CapturedDate;
    }

    public LocalDate getCapturedBy() {
        return CapturedBy;
    }

    public void setPhotoID(Long photoID) {
        PhotoID = photoID;
    }

    public void setFileFormat(String fileFormat) {
        FileFormat = fileFormat;
    }

    public void setGeolocation(String geolocation) {
        Geolocation = geolocation;
    }

    public void setTags(String tags) {
        Tags = tags;
    }

    public void setCapturedDate(LocalDate capturedDate) {
        CapturedDate = capturedDate;
    }

    public void setCapturedBy(LocalDate capturedBy) {
        CapturedBy = capturedBy;
    }

    @Contract(value = "null -> false", pure = true)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotosDto photosDto = (PhotosDto) o;
        return Objects.equals(PhotoID, photosDto.PhotoID) && Objects.equals(FileFormat, photosDto.FileFormat) && Objects.equals(Geolocation, photosDto.Geolocation) && Objects.equals(Tags, photosDto.Tags) && Objects.equals(CapturedDate, photosDto.CapturedDate) && Objects.equals(CapturedBy, photosDto.CapturedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PhotoID, FileFormat, Geolocation, Tags, CapturedDate, CapturedBy);
    }
}
