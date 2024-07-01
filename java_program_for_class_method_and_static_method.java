class java_program_for_class_method_and_static_method {
// class method
static void myStaticMethod() {
System.out.println("Static methods can be called without creating objects");
}
// instance method
public void myPublicMethod() {
System.out.println("Public methods must be called by creating objects");
}
public static void main(String[ ] args) {
myStaticMethod(); // Call the static method
// myPublicMethod(); This would output an error
java_program_for_class_method_and_static_method obj = new java_program_for_class_method_and_static_method (); // Create an object of Main
obj.myPublicMethod(); // Call the public method
}
}