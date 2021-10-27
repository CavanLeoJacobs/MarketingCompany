package marketing.company.domain.dto;

import marketing.company.domain.persistence.Albums;

import java.io.Serializable;
import java.time.LocalDate;

public class AlbumsDto implements Serializable
{
  private static final long serialVersionUID = 797566274463787428L;

  private long AlbumsID;
  private String FileFormat;
  private String Geolocation;
  private String Tags;
  private LocalDate CapturedDate;
  private LocalDate CapturedBy;
  //I am not 100% sure what they mean? (Captured by) in project 2 scope
  public AlbumsDto()
  {

  }

  public AlbumsDto(long albumsID, String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {
    AlbumsID = albumsID;
    FileFormat = fileFormat;
    Geolocation = geolocation;
    Tags = tags;
    CapturedDate = capturedDate;
    CapturedBy = capturedBy;
  }

  public AlbumsDto(Albums albums)
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
}
