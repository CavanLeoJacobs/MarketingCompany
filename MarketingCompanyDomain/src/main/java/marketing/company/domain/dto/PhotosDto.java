package marketing.company.domain.dto;

import marketing.company.domain.persistence.Albums;
import marketing.company.domain.persistence.Photos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class PhotosDto implements Serializable
{
    private static final long serialVersionUID = 6568108165313641961L;

    private long PhotoID;
    private String FileFormat;
    private String Geolocation;
    private String Tags;
    private LocalDate CapturedDate;
    private LocalDate CapturedBy;
    //I am not 100% sure what they mean? (Captured by) in project 2 scope


    public PhotosDto() {
    }

    public PhotosDto(long photoID, String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {
        PhotoID = photoID;
        FileFormat = fileFormat;
        Geolocation = geolocation;
        Tags = tags;
        CapturedDate = capturedDate;
        CapturedBy = capturedBy;
    }

    public PhotosDto(PhotosDto photos)
    {
        this.setPhotoID(photos.getPhotoID());
        this.setFileFormat(photos.getFileFormat());
        this.setGeolocation(photos.getGeolocation());
        this.setTags(photos.getTags());
        this.setCapturedDate(photos.getCapturedDate());
        this.setCapturedBy(photos.getCapturedBy());
    }

    public long getPhotoID() {
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

    public void setPhotoID(long photoID) {
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
}
