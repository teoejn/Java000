import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaComparator3 {
    public static void test(){

    }
    public static int test(Integer a){
        return (a+a);
    }
    public static void main(String[] args){
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(4);
        intList.add(3);
        intList.add(5);

        Comparator<Integer> comparator = new JavaComparator3_1();
        Collections.sort(intList, comparator);

        Integer a = 5;
        System.out.println(test(a));

        System.out.println(intList);
    }
}
