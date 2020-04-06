package Exercises;


//    reverse the int 123 to int 321.

public class ReverseInt {
    public static void main(String[] args) {

//        Solution 1
        int num = 123;
//        int reversed = 0;
//        while (num!=0){
//            reversed = reversed*10 + num%10;
//            num = num/10;
//        }
//        System.out.println(reversed);

//        Solution 2
        String str = Integer.toString(num);
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);

        int num1= Integer.parseInt(sb.toString());
        System.out.println(num1);



    }

}
