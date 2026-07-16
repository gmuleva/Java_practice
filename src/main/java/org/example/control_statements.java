package org.example;

public class control_statements {
    public static void main() {
        String a = "Hello";
        String b = "Hello";
        int c = a.length();
        if (a==b){
            System.out.println("a==b");
        }
        else {
            System.out.println("not equal");
        }

        if(c==2){
            System.out.println("count is 2 ");

        } else if (c==3) {
            System.out.println("count is 3 ");

        }
        else {
            System.out.println("count is greater than 3 ");
            if(c==5){
                System.out.println("count is 5");

            }
            else{
                System.out.println("dont know count");
            }
        }
        String day = "hel";

        switch (day){
            case "hel":
                System.out.println("day is monday");
                break;
            case "yel" :
                System.out.println("day is tuesday");
                break;
            default:
                System.out.println("day is default");
                break;

        }
    }

    }

