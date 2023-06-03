public class HelloSample {
    //Static methods - You should use static methods when you do not need to
    //access or modify the object's state without an object instance.
    static void myMethod() {
        /*Operators*/
        float x = 5;
        float z = 2;
        System.out.println(x/z); //2.5
        System.out.println(x*z); //10.0
        System.out.println(Math.floor(x/z)); //2.0
        System.out.println(x%z); //1.0

        double q = 50;
        System.out.println(q/6d); //8.333333333333334 (8 bytes)
        float w = 50;
        System.out.println(w/6f); //8.333333(4 bytes)

        System.out.println("The output is " + w+w); //The output is 50.050.0
        System.out.println("The output is " + (w+w)); //The output is 100.0

        double USDollars = 50;
        double bPounds = USDollars * 0.81d;
        System.out.println("50 USD in equal British Pounds is: " + bPounds);

        boolean trigger = true; //true or false //1bit
        char letter = 'a'; //single quote for char //2 byte
        char splAlphabet = '\u00AE'; //2byte
        byte num = 125; //1byte
        System.out.println(splAlphabet); //®
    }
    public static void main(String[] args) {
        /*keywords are very important, public and Public are two different keywords**/
        System.out.println("Hello World"); //Hello World
        /*Variable declaration and assignment */
        int sum = 300 + 5;
        System.out.println(sum); //305
        /*Primitive types (e.g., byte, int, float, double, boolean etc.)
        /*To know the data type of the variable, we need to cast Primitive types into an object*/
        Object y = sum;
        System.out.println(y.getClass()); //class java.lang.Integer
        /*String are not primitive types but an object), so we do not need to recast into an object*/
        String word = "hello";
        System.out.println(word.getClass()); //class java.lang.String

        /*Why we call it a method, not function cause it is member of the class*/
        myMethod(); //Calling the method
    }
}

