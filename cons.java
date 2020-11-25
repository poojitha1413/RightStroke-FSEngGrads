class cons{
private int x;
int para;
private cons(){
System.out.println("java constructor");
x=5;
}
private cons(int para){
this.para=para;
System.out.println(para+"parameterized cons");
}
public static void main(String[] args)
{
cons o1=new cons(2);
cons o2=new cons(3);
cons obj=new cons();
System.out.println("x="+obj.x);
}
}

