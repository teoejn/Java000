import java.util.Comparator;

public class JavaComparator_2 implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2); //A-Z //1-5
    }
}

