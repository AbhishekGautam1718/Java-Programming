class vararg{
public static void m1(int... x){
System.out.println("Abhishek Number of arguments are:"+x.length);
}
public static void main(String [] agrs){
m1();
m1(10,20);
m1(10,20,30);
m1(10,20,30,40);
}
}