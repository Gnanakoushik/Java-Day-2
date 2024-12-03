import java.util.*;
public class Swap2numxor{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        String C=String.format("After Swapping a and b is a=%d b=%d",a,b);
        System.out.println(C);

    }
}