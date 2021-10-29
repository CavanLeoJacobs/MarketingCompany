package marketing.company.repo.exceptions;

import javafx.scene.chart.ScatterChart;
import marketing.company.repo.controller.DataBaseProperties;

public class ExceptionDataBase
{



    public void ExceptionDataBase() throws Exception {


        try
        {
            DataBaseProperties exceptionHandlerForDataBase = new DataBaseProperties();

            //exceptionHandlerForDataBase.entityManagerFactory();
        }
        catch (Exception error)
        {
            String errorM = error.getMessage();

            throw new Exception(errorM, error);
        }
    }



}
