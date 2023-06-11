import java.util.ArrayList;
import java.util.List;
public class LearningArrays {
    public static void main(String[] args) {
        //Array is a continuous representation of elements in the memory
        int[] studentMathScore = new int[5];
        //int[] studentMathScore = new int[]{1,2,3,4,5};
        studentMathScore[0] = 44;
        studentMathScore[1] = 45;
        studentMathScore[2] = 46;
        studentMathScore[3] = 47;
        studentMathScore[4] = 48;
        System.out.println(studentMathScore[0]); //4
        for (int i = 0; i < studentMathScore.length; i++) {
            System.out.println(studentMathScore[i]); //44 to 48
        }

        //List
        //Dont have to specify the value.
        List<Integer> integerList = new ArrayList<>();
        integerList.add(44);
        integerList.add(45);
        System.out.println(integerList.get(0)); //44
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }



    }
}

