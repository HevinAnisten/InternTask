import java.util.*;
import java.util.Scanner;
//practice if else conditions
/*public class Main {
    public static void main(String[] args) {
        int age1 = 25;
        int age2 = 30;
            if(age1>age2) {
                System.out.println("age1 is big");
            }else if(age1<age2){
                System.out.println("age2 is big");
            }else{
                System.out.println("nothing");
            }
    }
}*/
//Write a Java program to get a number from the user and print whether it is positive or negative.
/*public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = scanner.nextInt();

        if(a>0){
            System.out.println(" Number is Positive");
        }else if(a<0){
            System.out.println("Number is Negative");
        }else{
            System.out.println("number is zero");
        }
    }
}*/
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the Second number : ");
        int b = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the Third number : ");
        int c = scanner2.nextInt();

        if(a>b)
        if(a>c){
            System.out.println("The Greatest value is" +a);
        }
        if(b>a)
        if(b>c){
            System.out.println("The Greatest value is" +b);
        }
        if(c>a)
        if(c>b) {
            System.out.println("The Greatest value is "+c);
        }

    }
}