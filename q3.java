
/**
 * Write a description of class q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q3
{ public static void main(String args[]){
    int a=1,n=0,sum=0;
    do{
        sum=sum+a*a;
        n++;
        a++;
    }while(n!=10);
    System.out.println("sum:"+sum);
}
}