public class FibonacciSeries {

//    Write a program to print Fibonacci Series up to count 10

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
            int a = 0, b=1, c, i, count=10;
            System.out.print(a + " " + b);
            for (i=2; i<=10; i++){
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }
    }}

