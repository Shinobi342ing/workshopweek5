import java.util.Scanner;

/**
 * Write a description of class q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q8
{
   
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.println("enter number");
        int n=a.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}