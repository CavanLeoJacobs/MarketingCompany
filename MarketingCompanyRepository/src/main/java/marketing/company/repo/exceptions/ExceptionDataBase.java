package marketing.company.repo.exceptions;

import marketing.company.repo.controller.DataBase;

public class ExceptionDataBase
{



    public void ExceptionDataBase() throws Exception {


        try
        {
            DataBase exceptionHandlerForDataBase = new DataBase();

            exceptionHandlerForDataBase.entityManagerFactory();
        }
        catch (Exception error)
        {
            String errorM = error.getMessage();

            throw new Exception(errorM, error);
        }
    }



}
