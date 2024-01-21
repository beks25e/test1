import java.util.ArrayList;
import java.util.Collections;

interface Payable {
    double getPaymentAmount();
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(new Employee("John", "Lennon", "Manager", 27045.78));
        peopleList.add(new Employee("BArackan", "Obama", "leader", 999999999.00));
        peopleList.add(new Student("Bekarys", "Sailay", 1.4));
        peopleList.add(new Student("Iliyas", "Moldahan", 2.7));


        Collections.sort(peopleList);

        printData(peopleList);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
