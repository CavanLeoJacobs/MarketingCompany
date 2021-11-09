package marketing.company.domain.persistence;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table

public class Albums implements Serializable
{
    private static final long serialVersionUID = -4984226601624324688L;
    private Long albums_ID;
    private String FileFormat;
    private String Geolocation;
    private String Tags;
    private LocalDate CapturedDate;
    private LocalDate CapturedBy;

    public Albums() {

    }

    public Albums(Long albums_ID, String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {
        this.albums_ID = albums_ID;
        FileFormat = fileFormat;
        Geolocation = geolocation;
        Tags = tags;
        CapturedDate = capturedDate;
        CapturedBy = capturedBy;
    }

    public Albums(String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {
        FileFormat = fileFormat;
        Geolocation = geolocation;
        Tags = tags;
        CapturedDate = capturedDate;
        CapturedBy = capturedBy;
    }

    @Id
    @Column(name = "albums_id", nullable = false)
    public Long getAlbums_ID() {
        return albums_ID;
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

    @Column(name = "LocalDate")
    public LocalDate getCapturedBy() {
        return CapturedBy;
    }

    public void setAlbums_ID(Long albums_ID) {
        this.albums_ID = albums_ID;
    }

    public void setFileFormat(String fileFormat) {
        FileFormat = fileFormat;
    }

    public void setGeolocation(String geolocation) {
        Geolocation = geolocation;
    }

    public void setTags(String tags)
    {
        Tags = tags;
    }

    public void setCapturedDate(LocalDate capturedDate) {
        CapturedDate = capturedDate;
    }

    public void setCapturedBy(LocalDate capturedBy) {
        CapturedBy = capturedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Albums albums = (Albums) o;
        return albums_ID.equals(albums.albums_ID) && Objects.equals(FileFormat, albums.FileFormat) && Objects.equals(Geolocation, albums.Geolocation) && Objects.equals(Tags, albums.Tags) && Objects.equals(CapturedDate, albums.CapturedDate) && Objects.equals(CapturedBy, albums.CapturedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albums_ID, FileFormat, Geolocation, Tags, CapturedDate, CapturedBy);
    }
}

