package definitions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmailAssingment {

    public static void main(String[] args) {
        List <String> list = Arrays.asList("AngelaKowalski@yahoo.com","John234@yahoo.com","678@gmail.com","JasonMendez@wellsfargo.com","Gemini_234@aol.com",
        "GordonBrown@wellsfargo.com");
        convertionMethod(list);

    }


    static void convertionMethod (List<String> li){
            for (String str: li){
                String str2 = str.substring(0,str.indexOf("@"));
                if(!str2.matches(".*\\d.*")) {
                    System.out.println(str2);
                }

            }

    }

}
