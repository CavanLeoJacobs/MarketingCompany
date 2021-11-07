package marketing.company.domain.dto;

import marketing.company.domain.persistence.Albums;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AlbumsDto implements Serializable
{
  private static final Long serialVersionUID = 797566274463787428L;

  private Long AlbumsID;
  private String FileFormat;
  private String Geolocation;
  private String Tags;
  private LocalDate CapturedDate;
  private LocalDate CapturedBy;
  //I am not 100% sure what they mean? (Captured by) in project 2 scope
  public AlbumsDto()
  {

  }

  public AlbumsDto(Long albumsID, String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {

    AlbumsID = albumsID;
    FileFormat = fileFormat;
    Geolocation = geolocation;
    Tags = tags;
    CapturedDate = capturedDate;
    CapturedBy = capturedBy;
  }

  public AlbumsDto(AlbumsDto albums)
  {
    this.setAlbumsID(albums.getAlbums_ID());
    this.setFileFormat(albums.getFileFormat());
    this.setGeolocation(albums.getGeolocation());
    this.setTags(albums.getTags());
    this.setCapturedDate(albums.getCapturedDate());
    this.setCapturedBy(albums.getCapturedBy());

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

  public long getAlbums_ID() {return AlbumsID;}

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlbumsDto albumsDto = (AlbumsDto) o;
    return Objects.equals(AlbumsID, albumsDto.AlbumsID) && FileFormat.equals(albumsDto.FileFormat) && Geolocation.equals(albumsDto.Geolocation) && Tags.equals(albumsDto.Tags) && CapturedDate.equals(albumsDto.CapturedDate) && CapturedBy.equals(albumsDto.CapturedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AlbumsID, FileFormat, Geolocation, Tags, CapturedDate, CapturedBy);
  }

}
