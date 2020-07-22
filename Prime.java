import java.util.*;
public class Prime{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,j,temp;
for(i=1;i<=n;i++)
{
if(i==0||i==1)
continue;
temp=1;
for(j=2;j<=i/2;j++){
if(i%j==0){
temp=0;
break;
}
}
if(temp==1)
System.out.print(i);
}
}
}