package Exercises;

public class FibonacciSeries {

//    Write a program to print Fibonacci Series up to count 10:  0 1 1 2 3 5 8 13 21 34

        public static void main(String args[]) {
//         int a=0, b=1, c, i, count =10;
//            System.out.print(a + " " + b +" ");
//
//            for ( i = 3; i<=10; i++ ){
//                c = a + b;
//                System.out.print(c + " ");
//                a=b;
//                b=c;
//
//            }
//
//        }


            int a= 0, b=1, c, count=10;

            System.out.print(a +" "+ b);

            for (int j=2; j<count; j++ ){
                c = a+b;
                System.out.print(" "+ c);
                a=b;
                b=c;
            }
        }





    }

