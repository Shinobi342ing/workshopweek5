import java.util.Scanner;

/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixedDepositNIB
{
    public static void main(String args[]){
        
    Scanner a = new Scanner(System.in);
    int n=1;
    double P,I,T;
while(n==1){
    do{
    System.out.println("enter principal( minimum Rs1000)");
    P=a.nextDouble();
    if(P<1000){
        System.out.println("minimum rs10000");
    }
}while(P<1000);
do{
     System.out.println("enter interest rate(8-12%)");
    I=a.nextDouble();
     if(I<8 || I>12){
        System.out.println("must be in the range of 8-12%");
    }
}while(I<8 || I>12);
do{
     System.out.println("enter durating in year(maximum 5 years)");
    T=a.nextDouble();
     if(T>5){
        System.out.println("max 5 years");
    }
}while(T>5 || T<0);
    double tm=T*12;
    double rate=I/100/12;
double amount=P*Math.pow((1+rate),tm);
double famount=amount-0.005*amount;
System.out.println("Principle="+P+" Annual interest="+I+"% Time in years="+T+" Time in months="+tm);
System.out.println("Principle="+P+" Maturity amount="+amount+" finalamount="+famount);

    System.out.println("Do you wish for another FD?(yes=1/no=another number)");
    n=a.nextInt();
}
    }
}

