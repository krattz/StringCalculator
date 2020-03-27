import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.regex.*;
public class StringCalculator {
    public static void main(String[] args) {
        add("//94\n142");
    }
    public static int add(String text)
    {
     int result = 0;
        if (text.contains("//")){

             String x = text.substring(2,3);
            text = text.replaceAll("777", "z");
           String textn = text.replace(x,"r");

            System.out.println(textn);
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
                System.out.println(e);
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