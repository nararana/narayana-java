package com.narayana.java;

import java.util.Scanner;

public class BasicArithmeticOperators_4
{
   public static void main(String args[])
   {
      int i;
      int j;
      Scanner s = new Scanner(System.in);
      i = s.nextInt();
      j = s.nextInt();

      System.out.println("i+j");
      System.out.println(i+j);
      System.out.println(i*j);
      System.out.println(i/(j*1.0));
      System.out.println(i-j);
      System.out.println(i%j);
   }
}
