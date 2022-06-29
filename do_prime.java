import java.util.*;
 class do_prime
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int i=2;
  System.out.println("enter the no");
  int n=sc.nextInt();
    do
   {
     if(n%i==0)
     break;
     i++;
   }while(i<=n);

      if(i==n)
    System.out.println(n + " This is prime no");
    else
    System.out.println(n + " This is not prime no"); 
}
}