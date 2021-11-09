package marketing.company.domain.exceptions;

public class AccessRequired
{

    private String errorMessage ="Access Required";
    public AccessRequired()
    {
        try
        {

        }
        catch(Exception e)
        {
            System.out.println(errorMessage);
        }
    }
}
