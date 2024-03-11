
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> myList = List.of(1, 2, 3);

        Integer cumulativeSum = myList.stream().reduce(0, (a, b) -> a + b );
        System.out.println(cumulativeSum);
        
        Integer cumulativeProduct = myList.stream().reduce(1, (a, b) -> a * b);

List<Integer> myNumbersList = new ArrayList<>();

 Stream<Integer> myNumbersStream = myNumbersList.stream();
        Stream<Integer> myNumbersEmptyStream = Stream.empty();

        Stream<Integer> myStringStream;
        System.out.println(myStringStream.toList());


 List<String> myStringList = List.of(
                 "Welding",
                "Welding",
                 "English",
                 "DC Software Development",
                "Economics",
                "Credit Recovery",
                "Lifetime Fitness"
              );
        
                 Stream<String> filteredStream = myStringList.stream().filter((element) -> element.contains("d"));
         System.out.println(filteredStream.toList());

         boolean hasLowerD = myStringList.stream().anyMatch((element) -> element.contains("d"));
         System.out.println(hasLowerD);

         boolean allHasLowerD = myStringList.stream().allMatch((element) -> element.contains("d"));
         System.out.println(allHasLowerD);


    }
}