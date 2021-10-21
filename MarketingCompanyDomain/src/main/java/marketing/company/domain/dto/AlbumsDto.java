package marketing.company.domain.dto;

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
}
