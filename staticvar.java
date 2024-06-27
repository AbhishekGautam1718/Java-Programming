class staticvar{
static int x=10;
public static void main(String[] args){
staticvar obj=new staticvar();
System.out.println(x);
System.out.println(obj.x);
System.out.println(staticvar.x);
}
}