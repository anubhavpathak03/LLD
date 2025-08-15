//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        List<Integer> arr = new ArrayList<>();
        // List is an interface.
        // interface is a type of template where we define generics like
        // ArrayList is also a class which implement the List class
        arr.add(10);
        arr.add(99);
        arr.add(30);
        arr.add(400);
        for(Integer it : arr) {
            System.out.print(it + ", ");
        }
        System.out.println();
        /*
         * Collection ------->(extend)--->AbstractCollection ---------> ArrayList ----->List
         * */

        int[] arr1 = {1, 2, 3};
        for(int i=0; i<arr1.length; i++) {
            System.out.println("Element: " + arr1[i]+ ", at index ->" + i);
        }

        System.out.println();
        /**** MAP IN JAVA  *****/
        Map<String, Integer> marks = new HashMap<>();
        marks.put("rahul", 100);
        marks.put("rohan", 90);
        marks.put("ayush", 70);
        marks.put("rohit", 99);
        marks.put("alloo", 60);

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            String name = entry.getKey();
            Integer numbers = entry.getValue();
            System.out.println("Name: " + name + ", NumberInMath: " + numbers);
        }

        System.out.println();

        marks.forEach((name, numbers) -> System.out.print(name + "-> " + numbers +", "));
        System.out.println();
        System.out.println();

        // if key not exist in map then return exception
//        System.out.println(marks.get("anubhav") > 10); // Create Null pointer Exception

        // optional is used to remove exception
        Optional<Integer> marksOfAnubhav = Optional.ofNullable(marks.get("anubhav"));
        System.out.println(marksOfAnubhav);
        if(marksOfAnubhav.isPresent()) {
            ///
        }else {
            System.out.println("I'm Not Present");
        }
    }
}