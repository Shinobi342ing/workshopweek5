
/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q1
{ public static void main(String args[]){
    for(int i=2;i<=20;i+=2){
        System.out.println(i);
    }
    int n=0;
    int a=2;
    while(n!=10){
        System.out.println(a);
        a+=2;
        n++;
    }
    a=2;
    n=0;
    do{
        System.out.println(a);
        a+=2;
        n++;
    }while(n!=10);
}
}