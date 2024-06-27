class instanceofoperator{
public static void main(String [] args){
Thread t=new Thread();
System.out.println(t instanceof Thread);
System.out.println(t instanceof Object);
System.out.println(t instanceof Runnable);
//System.out.println(t instanceof String); it is compulsory there should be have relation between argument types.(they should from the same type of instance of object)
}
}