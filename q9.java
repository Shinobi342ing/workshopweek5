import java.util.Scanner;

/**
 * Write a description of class q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q9
{
    // instance variables - replace the example below with your own
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.println("enter number");
        int n=a.nextInt();
       int b=0,c=0;
       
        while(n!=0){
            b=n%10;
            c=c*10+b;
            n=n/10;
        }
        System.out.println(c); 
    }
}