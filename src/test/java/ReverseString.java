public class ReverseString {

    public static void main(String[] args) {
//        reverse a string
        String s = "Hello World";

//        Method 1:
        int len = s.length();
        String reverse = "";
        for (int i=len-1; i>=0; i--){
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);

//        Method 2:
        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());


    }

}
