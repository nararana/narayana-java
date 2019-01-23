package com.narayana.java;

import java.util.Scanner;

public class Switch_6
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter i : ");
      int i = s.nextInt();
      System.out.println("enter j : ");
      int j = s.nextInt();
      System.out.println("Calculator statement");
      System.out.println("1.add 2.sub 3.mul 4.div");
      System.out.println("enter choice: ");
      int choice = s.nextInt();
      switch (choice)
      {
      case 1:
         System.out.println(add(i, j));
         break;

      case 2:
         System.out.println(sub(i, j));
         break;

      case 3:
         System.out.println(mul(i, j));
         break;

      case 4:
         System.out.println(div(i, j));
         break;

      default:
         System.out.println("invalid option");
      }

   }

   public static int add(int a, int b)
   {
      int c = a + b;
      return c;
   }

   public static int sub(int d, int e)
   {
      int c = d - e;
      return c;
   }

   public static int div(int a, int b)
   {
      int c = a / b;
      return c;
   }

   public static int mul(int a, int b)
   {
      int c = a * b;
      return c;
   }
}
