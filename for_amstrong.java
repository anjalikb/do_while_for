import java.util.*;
class for_amstrong
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int sum=0;
  System.out.println("enter the no");
  int a=sc.nextInt();
  for(int i=a; i!=0 ; )
{
  int rem=i%10;
  sum=sum+(rem*rem*rem);
  i=i/10;
  }

  if(sum==a)
  System.out.println("This is amstrong no");
  else
  System.out.println("This is not amstrong no");
  


}
}