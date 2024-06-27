class varargprint{
public static void main(String [] args){
sum();
sum(10,20);
sum(12,23,43);
sum(20,30,40,50);
}
public static void sum(int... x){
int total=0;
for(int x1:x){
total=total+x1;
}
System.out.println(total);
}
}