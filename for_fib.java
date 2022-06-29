import java.util.*;
class for_fib
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
 int n1=0;
 int n2=1;
 int n3=0;
 System.out.println("enter the no :");
 int n=sc.nextInt();
 System.out.println(n1);
 System.out.println(n2);
 for(int i=3; i<=n; i++)
 {
   n3=n1+n2;
   System.out.println(n3);
   n1=n2;
   n2=n3; 
}
}
}