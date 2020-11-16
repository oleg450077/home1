package Exercises;

public class StringManupulation {

    public static void main(String[] args) {

        String test = "Selenium Web Driver";
        String test1 = "selenium web driver";

//        System.out.println(test.length());
//        System.out.println(test.charAt(10));
//        System.out.println(test.indexOf("about"));
//        System.out.println(test.indexOf("o"));
//        System.out.println(test.indexOf("o",11));
//        System.out.println(test.indexOf("o",test.indexOf("o")+1));
//        System.out.println(test.indexOf("o", test.indexOf("o",test.indexOf("o")+1)+1));
//        System.out.println(test.indexOf("o", 37));
//        System.out.println(test.indexOf("o",test.indexOf("o", test.indexOf("o",test.indexOf("o")+1)+1)+1));
//        System.out.println(test.compareTo(test1));
//        System.out.println(test.compareToIgnoreCase(test1));
//        System.out.println(test+" "+test1);
//        System.out.println(test.contains(test1));
//        System.out.println(test.endsWith("m"));
//        System.out.println(test.equals(test1));

        System.out.println(test.length());
        System.out.println(test.startsWith("S"));
        System.out.println(test.endsWith("r"));
        System.out.println(test.toLowerCase().equals(test1));
        System.out.println(test.replace("Web", "Space"));
        System.out.println(test);
        System.out.println(test.indexOf("e"));
        System.out.println(test.indexOf("e", 13));
        System.out.println(test.indexOf("e", test.indexOf("e", 2)+2));
        System.out.println(test.matches(test1));
        System.out.println(test.substring(2, 8));
        String string = test.substring(2, 8);
        System.out.println(string);

        System.out.println("****************************");

        String str = "Hello_World";
        System.out.println(str.replace("_", "&"));

        String[] testval = str.split("_");
        System.out.println(testval.length);
        for (int i = 0; i < testval.length; i++) {
            System.out.println(testval[i]);
        }
        String str1 = "Hello@World";
        String[] arr = str1.split("@");
        for (int i = 0; i <arr.length; i++){
            System.out.println(arr[i]);
        }


        System.out.println(test.substring(2,10));

        String str2= "   Hello World   ";
        System.out.println(str2.trim());

        String str3 = "Selenium";
        String reverse="";
        for (int i =str3.length()-1; i>=0; i--){
            reverse = reverse +str3.charAt(i);

        }
        System.out.println(reverse);

        char[] chars = reverse.toCharArray();
        System.out.println(chars.length);
        for (int i=chars.length-1; i>=0; i--){
            System.out.print(chars[i]);
        }
        System.out.println();
        StringBuffer sb = new StringBuffer(str3);
        System.out.println(sb.insert(2,45));
        sb.append(87);

        System.out.println(sb);

        StringBuilder stringBuilder = new StringBuilder(str1);
        System.out.println(stringBuilder.replace(0,5, "Volgahggu"));

    }
}
