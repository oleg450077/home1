package Exercises;

public class ReverseInteger {

    public static void main(String[] args) {
//        Solution 1
//        int num = 123456;
////                      output 54321
//        int rev = 0;
//        while (num != 0){
//            rev = rev*10 + num%10;
//            num = num/10;
//        }
//        System.out.println(rev);
//
////        Solution 2
//        int num1 = 987654321;
//        Integer num2 = Math.toIntExact(num1);
//        String str = num2.toString();
//        StringBuffer sb = new StringBuffer(str);
//        System.out.println(sb.reverse());
//
//        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

        int num = 1234;
//        int rev= 0;
//        while (num!=0){
//            rev = rev*10 + num%10;
//            num=num/10;
//
//        }
//        System.out.println(rev);
//        int rev= 0;
////        while (num!=0){
////            rev = rev*10 +num%10;
////            num = num/10;
////        }
////        System.out.println(rev);
////
////        int num1 = 122343546;
//////        Integer num2= num1;
//////        String str = num2.toString();
//////        StringBuffer sb = new StringBuffer(str);
//////        System.out.println(sb.reverse());




        int num1 = 987654321;
        int rev=0;

        String str = Integer.toString(num1);
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        while (num1!=0){
            rev=rev*10 + num1%10;
            num1=num1/10;
        }
        System.out.println(rev);






    }}