package marketing.company.repo.exceptions;


import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionDataBaseTest {

    @Test
    public void exceptionDataBase() throws Exception
    {
        try {
            ExceptionDataBase test =new ExceptionDataBase();

            test.ExceptionDataBase();

        }
        catch (Exception error)
        {
            System.out.print(error.getMessage());
        }

    }
}