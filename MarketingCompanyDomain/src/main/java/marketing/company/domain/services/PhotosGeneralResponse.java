package marketing.company.domain.services;

import java.io.Serializable;
import java.util.Objects;

public class PhotosGeneralResponse<P> implements Serializable
{
    private static final long serialVersionUID = -5125154957713696269L;


    private final boolean successful;
    private final transient P payload;
    public PhotosGeneralResponse(boolean successful,P payload)
    {
        this.successful = successful;
        this.payload= payload;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash();
    }


}
