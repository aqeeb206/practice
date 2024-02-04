import java.util.*;
public class aqeeb{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr 3 numbers please");
        int  num1 = sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int average=(num1+num2+num3)/3;
        System.out.println(average);
        sc.close();
        System.out.println("Hello folks");
    }
}