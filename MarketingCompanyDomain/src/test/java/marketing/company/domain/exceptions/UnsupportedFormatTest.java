package marketing.company.domain.exceptions;


import org.junit.jupiter.api.Test;

class UnsupportedFormatTest {


    @Test
   void UnsupportedFormat()
    {
        UnsupportedFormat errFormat=new UnsupportedFormat();
        errFormat.FileFormat("");
    }

}