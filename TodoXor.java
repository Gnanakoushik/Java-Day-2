import java.util.*;
public class TodoXor{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((a^b)==0)
        System.out.println("it is true");
        else
        System.out.println("it is false");


    }
}