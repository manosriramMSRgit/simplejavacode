package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello from "+ name);
    }
}
