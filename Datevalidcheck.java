import java.util.Scanner;
 public class Datevalidcheck {
public static void main(String[]args) {
 Scanner sc =new Scanner(System.in);
 System.out.println("year");
 int year =sc.nextInt();
 
 System.out.println("Enter your month  ");
 int month  =sc.nextInt();
 
 System.out.println("Enter day");
 int day =sc.nextInt();
 if (day >=1 && day <= 31) {
  System.out.println("day is valid");
 }  else {
 System.out.println("day is not valid");
 }

 if (month<=1 && month>=12 ) {
 System.out.println("monthh is valid");
 } else {
 System.out.println("month is not valid");
 }
 
 if (year%4 == 0) {
 System.out.println(" a leap year");
 } else {
 System.out.println("not a leap year but year is valid");
 }
 
 
 
 
 
 
 
   
} }
 