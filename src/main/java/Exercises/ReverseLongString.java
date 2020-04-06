package Exercises;

class ReverseLongString {

//    Reverse string "This is very long summer!!!"

//    public static void main(String[] args) {
//
//        String a = "Selenium is fun and fun again!";
//        String reverse = "";
//
//        for (int i = a.length()-1; i>=0; i--){
//            reverse = reverse + a.charAt(i);
//        }
//
//        System.out.println(reverse);
//
//    }

    static void reverseString(String text){
        String reverse = "";
        for (int i= text.length()-1; i>=0; i-- ){
            reverse = reverse + text.charAt(i);
        }
        System.out.println(reverse);

//        ***********

        StringBuffer sb = new StringBuffer(text);
        System.out.println(sb.reverse());

    }

    public static void main(String []args){
        String str = new String("This is very long summer!!!");
        reverseString(str);
    }



}
