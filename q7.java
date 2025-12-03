import java.util.Scanner;

/**
 * Write a description of class q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q7
{
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        int n1,n2,n=0,q;
        do{
            System.out.println("enter 1st number");
            n1=a.nextInt();
            System.out.println("enter 2nd number");
            n2=a.nextInt();
            System.out.println("Choose operation addition=1, subtraction=2, multiplication=3, division=4");
            q=a.nextInt();
            if(q==1){
                int n3=n1+n2;
                System.out.println("n1+n2="+n3);
            }else if (q==2){
                int n3=n1-n2;
                System.out.println("n1-n2="+n3);
            }else if (q==3){
                int n3=n1*n2;
                System.out.println("n1*n2="+n3);
            }else if (q==4){
                double n3=(double)n1/n2;
                System.out.println("n1/n2="+n3);
            }else{
                System.out.println("choose no operation");
            }
            System.out.println("perform arithmetic operations again?(1=yes/other number =no)");
            n=a.nextInt();
        }while(n==1);
    }
}