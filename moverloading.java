class moverload{
static int add(int a,int b)
{
return a+b;
}
static int add(int a,int b,int c)
{
return a+b+c;
}
}
public class moverloading
{
public static void main(String[] args)
{
System.out.println(moverload.add(99,99));
System.out.println(moverload.add(99,99,99));
}
} 