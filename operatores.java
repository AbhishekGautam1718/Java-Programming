public class operatores{
public static void assignment(){
int a = 49; // Assignment Operator
System.out.println(a);
}
public static void chained(){
int a,b,c,d;//chained operatores
a=b=c=d=20;
System.out.println(a);
}
public static void compound(){
int a=10;//compound operatores
a+=20;
System.out.println(a);
}
public static void main(String [] args){

operatores objec=new operatores();
objec.assignment();
objec.chained();
objec.compound();
}
}