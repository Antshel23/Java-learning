import java.util.ArrayList;

public class arrayLists {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<Double>();
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers.add(1.5);
        numbers.add(2.5);
        numbers2.add(1);


        getList(numbers);
    }

    static void getList(ArrayList<Double> arraylist) {
        System.out.println(arraylist);
    }
}
