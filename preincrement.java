class preincrement{
static void myMethod1(){
double d=10.5;
d++;
System.out.println("increment of double is:" +d);
}
static void myMethod(){
char x='a';
x++;
System.out.println("increment of char is:" +x);
}
public static void main(String [] args){
myMethod1();
myMethod();
int x=10;
int y=++x;
//if we give int y=++10(then we will get compile time error it don't take value it take only valriable)
System.out.println("increment of int is:" +y);
//when we try int y=++(++x) then we will get same error
}
}