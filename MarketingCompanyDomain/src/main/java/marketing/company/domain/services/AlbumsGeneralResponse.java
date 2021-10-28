package marketing.company.domain.services;

import java.io.Serializable;
import java.util.Objects;

public class AlbumsGeneralResponse<A> implements Serializable
{

    private static final long serialVersionUID = 1314535159669886339L;
    private final boolean successful;
    private final transient A payload;
    public AlbumsGeneralResponse(boolean successful,A payload)
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
