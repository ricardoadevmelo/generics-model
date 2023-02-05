import java.util.*;

public class TestProgram {
    public static void main(String[] args) {

    List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
    List<Double> myDoubles = Arrays.asList(3.14, 6.28);
    List<Object> myObjs = new ArrayList<Object>();
    copy(myInts, myObjs);
    printList(myObjs);
    copy(myDoubles, myObjs);
    printList(myObjs);


        Set<String> integerSet = new HashSet<>();
        integerSet.add("TV");
        integerSet.add("Notebbok");
        integerSet.add("Tablet");

        System.out.println(integerSet.contains("Notebbok"));

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);

}
public static void copy(List<? extends Number> source, List<? super Number> destiny) {
    destiny.addAll(source);
}
public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + ", ");
        }
    System.out.println();
}

}