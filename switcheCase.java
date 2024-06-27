class switcheCase{
public static void main(String [] args){
int x=10;
final int y=20; //if don't give final then we will get compiletime error
switch(x){
case 10:
System.out.println(10);
break;
case y:
System.out.println(20);
break;
}
}
}