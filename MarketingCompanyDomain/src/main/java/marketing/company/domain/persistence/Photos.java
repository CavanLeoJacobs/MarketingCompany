package marketing.company.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table
public class Photos implements Serializable
{
    private static final long serialVersionUID = 461151729495873009L;
    private Long photo_id;
    private String FileFormat;
    private String Geolocation;
    private String Tags;
    private LocalDate CapturedDate;
    private LocalDate CapturedBy;

    public Photos()
    {

    }

    public Photos(Long photo_id, String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {
        this.photo_id = photo_id;
        FileFormat = fileFormat;
        Geolocation = geolocation;
        Tags = tags;
        CapturedDate = capturedDate;
        CapturedBy = capturedBy;
    }

    public Photos(String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {
        FileFormat = fileFormat;
        Geolocation = geolocation;
        Tags = tags;
        CapturedDate = capturedDate;
        CapturedBy = capturedBy;
    }

    @Id
    @Column(name = "photo_id", nullable = false)
    public Long getPhoto_id() {
        return photo_id;
    }
    @Column(name = "FileFormat")
    public String getFileFormat() {
        return FileFormat;
    }
    @Column(name = "Geolocation")
    public String getGeolocation() {
        return Geolocation;
    }
    @Column(name = "Tags")
    public String getTags() {
        return Tags;
    }
    @Column(name = "CapturedDate")
    public LocalDate getCapturedDate() {
        return CapturedDate;
    }
    @Column(name = "CapturedBy")
    public LocalDate getCapturedBy() {
        return CapturedBy;
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

    public void setPhoto_id(Long photo_id) {
        this.photo_id = photo_id;
    }


}
