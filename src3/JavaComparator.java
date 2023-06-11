import java.util.*;


public class JavaComparator {
    public static void main(String[] args){
        //STRING ARRAY
        List<String>  stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("Matthew","Luke","Mark","John"));
        System.out.println("Before Sort: " + stringList);
        Collections.sort(stringList); //A-Z
        System.out.println("After Sort: " + stringList);
        Collections.reverse(stringList); //Z-A
        System.out.println("After Sort: " + stringList);
        //INT ARRAY
        List<Integer> intList = new ArrayList<>();
        intList.addAll(Arrays.asList(1,2,4,3,5));
        System.out.println("Before Sort: " + intList);
        Collections.sort(intList); //1-5
        System.out.println("After Sort: " + intList);
        Collections.reverse(intList); //5-1
        System.out.println("After Sort: " + intList);

        //USING COMPARATOR FOR INT
        List<Integer> intList_2 = new ArrayList<>();
        intList_2.addAll(Arrays.asList(1,2,4,3,5));
        System.out.println("Before Sort: " + intList_2);
        Collections.sort(intList_2, new JavaComparator_2()); //1-5
        System.out.println("After Sort: " + intList_2);
        Collections.reverse(intList_2); //5-1
        System.out.println("After Sort: " + intList_2);

        Comparator<Integer> comparator_str = new JavaComparator_2();
        comparator_str.compare(1,2);
    }
}
