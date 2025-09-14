import java.util.Scanner;
  public class Loop4 {
   public static void main(String[]args) {
   
   Scanner sc =new Scanner(System.in);
   
   do {
   System.out.println("Enter your secret number");
   int n =sc.nextInt();
    if(n<=60 && n>=50) { //my secret code only 55 to 60 valid
	System.out.println("correct Number");
	break; 
	
	}
   System.out.println("Try again this is wrong number " + n);
   } while(true);
   }
      }