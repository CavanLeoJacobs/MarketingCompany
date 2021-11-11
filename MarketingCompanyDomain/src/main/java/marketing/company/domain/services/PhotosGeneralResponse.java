package marketing.company.domain.services;

import org.jetbrains.annotations.Contract;

import java.io.Serializable;
import java.util.Objects;

public class PhotosGeneralResponse<T> implements Serializable
{
    private static final long serialVersionUID = -5125154957713696269L;

//private String successfullycreated="successfullycreated";
  //  private String successfullydeleted="successfullydeleted";

    private final boolean successful;
    private final transient T payload;

    @Contract(pure = true)
    public PhotosGeneralResponse(boolean successful, T payload)
    {
        this.successful = successful;
        this.payload= payload;
    }

    public boolean isSuccessful() {return successful;}
    public T getPayload() {return payload;}








/*
    you have successfully uploaded,downloaded,shared,deleted,created an album


     */






    /* //private final String
     private final transient P payload;
    private final ;
    public PhotosGeneralResponse("boolean successful,P payload")
    {
        this.successful = successful;
        this.payload= payload;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash();
    }



     */
}
