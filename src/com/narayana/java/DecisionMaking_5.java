package com.narayana.java;

import java.util.Scanner;

public class DecisionMaking_5
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter i : ");
      int i = s.nextInt();
      System.out.println("enter j : ");
      int j = s.nextInt();
      /*int d = add(i, j);
      System.out.println(d);
      d = sub(i, j);
      System.out.println(d);
      d = mul(i,j);
      System.out.println(d);
      d = div(i,j);
      System.out.println(d);
      System.out.println(add(i,j)); // */
      System.out.println("Calculator statement");
      System.out.println("1.add 2.sub 3.mul 4.div");
      System.out.println("enter choice: ");
      int choice = s.nextInt();
      if (choice == 1)
      {
         System.out.println(add(i,j));
      }
      else if (choice == 2)
      {
         System.out.println(sub(i,j));
      }
      else if (choice == 3)
      {
         System.out.println(mul(i,j));
      }
      else if(choice == 4)
      {
         System.out.println(div(i,j));
      }
      else
      {
         System.out.println("Invalid option");
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

