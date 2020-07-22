import java.util.*;
public class Palindrome
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int r,s=0,temp=num;
while(num>0){
r=num%10;
s=(s*10)+r;
num=num/10;
}
if(temp==s)
System.out.print("palindrome");
else
System.out.print("not palindrome");

}
}