package com.PS;
//taking user input
//percentage calculator marks out of 100 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ps=new Scanner(System.in);
        System.out.println("enter ur marks in sci");
       double a = ps.nextDouble();
        System.out.println("enter ur marks in sst ");
       double b =ps.nextDouble();
        System.out.println("enter ur eng mask ");
        double c = ps.nextDouble();
        System.out.println("enter ur skt marks ");
       double d = ps.nextDouble();
        System.out.println("enter ur maths marks ");
        double e = ps.nextDouble();
        double sum=a+b+c+d+e;
        double percentage = (sum/500)*100;
        System.out.println("ur percentage is " +percentage+"%" );
        double sj=33.5;
        if (percentage >33.5){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
    }
}
