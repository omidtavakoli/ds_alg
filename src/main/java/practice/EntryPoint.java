package practice;

import java.util.Scanner;


public class EntryPoint {

    public EntryPoint() {

        Scanner scan = new Scanner(System.in);
        Integer N = scan.nextInt();
        while(scan.hasNext()){
            Integer p = scan.nextInt();
            System.out.println(p);
        }

    }

    public static void main(String args[])
    {
        System.out.println("hello world");
        EntryPoint ep = new EntryPoint();
    }

}
