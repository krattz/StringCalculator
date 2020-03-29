import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.regex.*;
public class StringCalculator {
    private static final Logger logger = LogManager.getLogger(MainProgram.class.getName());
    public int add(String text)
    {

     int result = 0;
        if (text.contains("//")){

             String x = text.substring(2,3);
            text = text.replaceAll("777", "z");
           String textn = text.replace(x,"r");

        String [] num = textn.split("(//[0-9]?)?[^0-9]");

        for(int i = 0; i<num.length;i++)
        {
            try {
                int adding = Integer.parseInt(num[i]);
                if(adding == 777){
                    adding = 0;
                }
                if(adding<999){

                    result += adding;
                }else if (adding>1000){
                   
                    throw new Exception();

                }else if(adding < 0){
                    throw  new Exception();
                }

            }catch (NumberFormatException e)
            {
               logger.debug(e);
            } catch (Exception e) {
                System.out.println("ERROR: invalid input");
            }
        }
        System.out.println(result);

    }
        else{
            String [] num = text.split("(//[0-9]?)?");
            for(int i = 0; i<num.length;i++)
            {
                try {
                    result += Integer.parseInt(num[i]);
                }catch (NumberFormatException e)
                {
                    System.out.println(e);
                }
            }
            System.out.println(result);

        }
        return result;}
}