import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class LearningArrays_1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(44,45,46,47,48));
        integerList.remove(integerList.indexOf(45));

        for (int intList: integerList){
            System.out.println(intList);
        }

        Iterator iterator = integerList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }

        //List to an int array
        Integer[] a = integerList.toArray(new Integer[0]);

        for (Object intList: a) {
            System.out.println(intList);
        }

        Object[] mixIntStr_Array = new Object[]{1,2,"ASD"};
        for (int i = 0; i < mixIntStr_Array.length; i++){
            System.out.println(mixIntStr_Array[i]);
        }

        List<Object> mixIntStr_List = new ArrayList<>();
        mixIntStr_List.addAll(Arrays.asList(1,2,"ASD"));
        System.out.println(mixIntStr_List.getClass());
        for (int i = 0; i < mixIntStr_List.size(); i++) {
            System.out.println(mixIntStr_List.get(i));
        }

    }
}
        /*
        //List
        //Dont have to specify the value.
        List<Integer> integerList = new ArrayList<>();
        integerList.add(44);
        integerList.add(45);
        System.out.println(integerList.get(0)); //44
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
        */





