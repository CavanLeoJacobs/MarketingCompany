package marketing.company.domain.exceptions;

public class UserNotFound
{

    private String errorMessage = "User not found, please ensure that the user is registered";
   public UserNotFound()
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
