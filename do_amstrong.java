import java.util.*;
class do_amstrong
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
  int sum=0;
  System.out.println("enter the Amstrong no");
  int n=sc.nextInt();
  int i=n;
 
   do
  {
    int rem=i%10;
    sum=sum+(rem*rem*rem);
    i=i/10;
    }while(i!=0);

    if(n==sum)
      System.out.println("This is amstrong no");
      else
      System.out.println("This is not amstrong no");
    
 }
}