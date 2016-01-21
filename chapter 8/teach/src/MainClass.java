import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args){
        Integer [] intArray = {5,1,-10};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(intArray));

        System.out.println("ArrayList element:");
        for (Integer element : arrayList){
            System.out.println(element);
        }
        arrayList.add(10);
        System.out.println("Size of arrayList "+arrayList.size());

        final List<Person> personList = new ArrayList<>();
        personList.add(new Person ("John","Doe",(byte) 20));
        personList.add(new Person ("Debbie","Smith",(byte) 30));
        personList.add(new Person ("Chuck","Norris",(byte) 20));

        for(Person person : personList){
          System.out.println(person);
        }

        personList.stream().forEach(p -> System.out.println(p));

        personList
                .stream()
                .map(person -> person.lastName())
                .forEach(lastName -> System.out.println(lastName));
    }
}
