import java.util.*;
public class Armstrong{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int a,temp=num,c=0;
while(num>0)
{
a=num%10;
num=num/10;
c=c+(a*a*a);
}
if(temp==c)
System.out.print("armstrong");
else
System.out.print("not armstrong");
}
}
