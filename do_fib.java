import java.util.*;
class do_fib
{
  public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n1=0;
 int n2=1;
 int n3=0;
 int i=3;
 System.out.println("enter the fibnossis series no");
 int n=sc.nextInt();
 System.out.println("This is series of given no");
 System.out.println(n1);
 System.out.println(n2);
   
   do
  {
    n3=n1+n2;
    System.out.println(n3);
    n1=n2;
    n2=n3;
    i++;
    }
      while(i<=n);
}
}
    