package marketing.company.domain.exceptions;




public class UnsupportedFormat
{

    private final String errorMessage ="Unsupported format, please upload the content in a different format";


   // private List<String> list = new ArrayList<String>();

    public UnsupportedFormat()
    {

    }
    public UnsupportedFormat(String FileType)
    {

        try
        {

            FileFormat(FileType);

        }
        catch(Exception e)
        {
            System.out.println(errorMessage);


        }
    }
    public void FileFormat(String Format) {
        try {

            // list.clear();
            // list.add("");
            //            list.add(".bmp");
            //            list.add(".ico");
            //            list.add( ".jpeg");
            //            list.add(".jpg");
            //            list.add(".gif");
            //            list.add(".tiff");
            //            list.add(".png");



          //  if (Format==""||Format == ".bmp" ||Format ==".ico"||Format == ".jpeg" ||Format ==".jpg" ||Format ==".gif" ||Format ==".tiff" ||Format ==".png")
           // {
            //    throw new Exception (errorMessage);
            //}
        }
        catch (Exception type) {
            System.out.println(errorMessage);
        }

    }


}
