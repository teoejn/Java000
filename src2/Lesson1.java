public class Lesson1 {
    static void lesson_2_1() {
        System.out.println("Hello World");
    }
    static void lesson_3_1(){
        String letter;
        String word = "Hello World";
        System.out.println(word);

        Object type_word = word;
        System.out.println(type_word.getClass());
    }
    static void lesson_3_2(){
        int num = 123;
        System.out.println(num);

        Object type_num = num;
        System.out.println(type_num.getClass());
    }
    static void lesson_4_1(){
        float x = 50;
        float y = 50;
        float z = x + y;
        System.out.println("The sum is " + z); //The sum is 100.0
        System.out.println("The cal is " + x + " + " + y + " = " + z); //The cal is 50.0 + 50.0 = 100.0

        System.out.println("The sum is " + x + y); //The sum is 50.050.0
        System.out.println("The sum is " + (x + y)); //The sum is 100.0
    }
    static void lesson_4_2(){
        //https://en.wikipedia.org/wiki/List_of_Unicode_characters
        float x = 50; //precision: 7 decimal digits
        double y = 50; //precision: 15 decimal digits
        boolean trigger = true; //true or false //1bit
        char letter = 'a'; //single quote for char //2 byte
        char splAlphabet = '\u00AE'; //2byte
        byte num = 125; //1byte
        System.out.println(splAlphabet); //®
        System.out.println(num); //125
    }
    public static void main(String[] args) {
        lesson_2_1();
        lesson_3_1();
        lesson_3_2();
        lesson_4_1();
        lesson_4_2();
    }
}
