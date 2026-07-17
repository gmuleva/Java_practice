package org.example;

public class loop {
    public static void main() {

        System.out.println("hello");
//        for(int i = 1;i<=5;i++){
//            System.out.println(i);
//        }
//        int a = 1;
//
//        while (a<=10){
//            System.out.println(a*2);
//            a++;
//
//        }

//        for(int i =1 ;i<=5;i++){
//            for(int j =2;j<=5;j++){
//                System.out.println(j);
//            }
//        }

//       for(int i =5; i>=1;i--){
//           for(int j=1; j<=i;j++){
//               System.out.print("*");
//           }
//           System.out.println();
////           System.out.println(i);
//       }
        for(int i = 1; i <=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
