import java.util.*;
public class Even{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int e=sc.nextInt();
int i;
for(i=s;i<=e;i++)
{
if(i%2==0)
System.out.println(i);
}
}
}