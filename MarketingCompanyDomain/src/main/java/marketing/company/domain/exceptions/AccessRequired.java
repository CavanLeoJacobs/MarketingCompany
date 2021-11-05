package marketing.company.domain.exceptions;

public class AccessRequired
{

    private String errorMessage ="Access Required";
    public AccessRequired()
    {
        try
        {
            System.out.println(errorMessage);
        }
        catch(Exception e)
        {
            System.out.println(errorMessage);
        }
    }
}
