public class StringManupulation {

    public static <Char> void main(String[] args) {

        String test = "There is something about Marry and John Moor";
        String test1 = "There is something about Marry and John Moor";

        System.out.println(test.length());
        System.out.println(test.charAt(10));
        System.out.println(test.indexOf("about"));
        System.out.println(test.indexOf("o"));
        System.out.println(test.indexOf("o",11));
        System.out.println(test.indexOf("o",test.indexOf("o")+1));
        System.out.println(test.indexOf("o", test.indexOf("o",test.indexOf("o")+1)+1));
        System.out.println(test.indexOf("o", 37));
        System.out.println(test.indexOf("o",test.indexOf("o", test.indexOf("o",test.indexOf("o")+1)+1)+1));
        System.out.println(test.compareTo(test1));
        System.out.println(test.compareToIgnoreCase(test1));
        System.out.println(test+" "+test1);
        System.out.println(test.contains(test1));
        System.out.println(test.endsWith("r"));
        System.out.println(test.equals(test1));

        System.out.println("****************************");

        String str= "Hello_World";
        System.out.println(str.replace("_","&"));

        String[] testval= str.split("_");
        System.out.println(testval.length);
        for (int i=0; i<testval.length; i++){
            System.out.println(testval[i]);
        }

        System.out.println(test.substring(2,23));

        String str1= "   Hello World   ";
        System.out.println(str1.trim());

        String str2 = "Selenium";
        char[] chars = str2.toCharArray();
        System.out.println(chars.length);
        for (int i = 0; i <chars.length; i++){
            System.out.println(chars[i]);
        }

    }
}
