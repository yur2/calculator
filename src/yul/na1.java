package yul;

import java.util.Scanner;


public class na1 extends na2 {
  
 public static void main(String[] args) {
  
  while(true) {

  Scanner scan = new Scanner(System.in);
  
  System.out.println("숫자를 입력하세요");
  int a = scan.nextInt();
  System.out.println("숫자를 입력하세요");
  int b = scan.nextInt();
  
  
  na2 ee = new na2();
  
  ee.add(a, b);
  ee.minus(a, b);
  ee.multiple(a, b);
  ee.devide(a, b);
  }
 }
}
  
   class na2{ 
  
 
 public static void add(int a, int b) {
  System.out.println(a+"+"+b+"="+(a+b));
 }
 
 public static void minus(int a, int b) {
  System.out.println(a+"-"+b+"="+(a-b));
 }
 
 public static void multiple(int a, int b) {
  System.out.println(a+"*"+b+"="+(a*b));
 }
 
 public static void devide(int a, int b) {
  System.out.println(a+"/"+b+"="+(a/b));
 }
 
  
}
