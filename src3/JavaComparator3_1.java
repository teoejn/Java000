import java.util.Comparator;

public class JavaComparator3_1 implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2){
        return o1.compareTo(o2);
    }

    @Override
    public Comparator<Integer> reversed() {
        return Comparator.super.reversed();
    }
}


