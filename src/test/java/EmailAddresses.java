//        Write a method that takes a string of email addresses as an argument, processes that string, and displays
//        the first part of the email (i.e. the part before ‘@’) if that part consists of alpha characters only.
//        Each item should be displayed on a new line.

//    Given the input:  AngelaKowalski@yahoo.com,John234@yahoo.com,678@gmail.com,JasonMendez@wellsfargo.com,Gemini_234@aol.com,GordonBrown@wellsfargo.com
//The output should be:
//        AngelaKowalski
//        JasonMendez
//        GordonBrown


        import java.lang.reflect.Array;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.regex.*;

public class EmailAddresses {

    public static void main(String[] args) {
        List <String> list = Arrays.asList("AngelaKowalski@yahoo.com","John234@yahoo.com","678@gmail.com",
                "JasonMendez@wellsfargo.com","Gemini_234@aol.com",
                "GordonBrown@wellsfargo.com");

        convertionMethod(list);
    }

    static void convertionMethod (List<String> list){

        for (String string: list){
            String str = string.substring(0,string.indexOf("@"));

            if (str.matches("[a-zA-Z]")){
                System.out.println(str);
            }


            }


        }
    }


