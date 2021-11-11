package marketing.company.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import marketing.company.domain.persistence.Albums;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
@ApiModel(value="Albums",description="A DTO that represents the Albums")
public class AlbumsDto implements Serializable
{
  private static final Long serialVersionUID = 797566274463787428L;

  private Long AlbumsID;
  private String FileFormat;
  private String Geolocation;
  private String Tags;
  private LocalDate CapturedDate;
  private LocalDate CapturedBy;

  @Contract(pure = true)
  public AlbumsDto()
  {

  }

  @Contract(pure = true)
  public AlbumsDto(String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {
    FileFormat = fileFormat;
    Geolocation = geolocation;
    Tags = tags;
    CapturedDate = capturedDate;
    CapturedBy = capturedBy;
  }

  @Contract
  public AlbumsDto(Long albumsID, String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {

    AlbumsID = albumsID;
    FileFormat = fileFormat;
    Geolocation = geolocation;
    Tags = tags;
    CapturedDate = capturedDate;
    CapturedBy = capturedBy;
  }

  public AlbumsDto(@NotNull AlbumsDto albums)
  {
    this.setAlbumsID(albums.getAlbumsID());
    this.setFileFormat(albums.getFileFormat());
    this.setGeolocation(albums.getGeolocation());
    this.setTags(albums.getTags());
    this.setCapturedDate(albums.getCapturedDate());
    this.setCapturedBy(albums.getCapturedBy());

  }

  @ApiModelProperty(position=1 ,value = "Albums.AlbumsID")
  public Long getAlbumsID() {
    return AlbumsID;
  }

  public void setAlbumsID(Long albumsID) {
    AlbumsID = albumsID;
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


}
