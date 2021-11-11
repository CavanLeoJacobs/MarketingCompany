package marketing.company.domain.persistence;


import org.jetbrains.annotations.Contract;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table

public class Albums implements Serializable
{
    private static final long serialVersionUID = -4984226601624324688L;
    private Long albumsID;
    private String FileFormat;
    private String Geolocation;
    private String Tags;
    private LocalDate CapturedDate;
    private LocalDate CapturedBy;

    @Contract(pure = true)
    public Albums() {

    }

    @Contract(pure = true)
    public Albums(Long albumsID, String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {
        this.albumsID = albumsID;
        FileFormat = fileFormat;
        Geolocation = geolocation;
        Tags = tags;
        CapturedDate = capturedDate;
        CapturedBy = capturedBy;
    }

    @Contract(pure = true)
    public Albums(String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {
        FileFormat = fileFormat;
        Geolocation = geolocation;
        Tags = tags;
        CapturedDate = capturedDate;
        CapturedBy = capturedBy;
    }

    @Id
    @Column(name = "albumsID", nullable = false)
    public Long getAlbumsID() {
        return albumsID;
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

    public void setAlbumsID(Long albumsID) {
        this.albumsID = albumsID;
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


}

