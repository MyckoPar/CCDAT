import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> Enrollee = new LinkedList<>();

        Enrollee.add("Mike Vincent Par");
        Enrollee.add("Ronn Adia");
        Enrollee.add("Neil Rifarial");
        Enrollee.add("Alexander Du");
        Enrollee.add("Winna Babilis");

        System.out.println(Enrollee);

        System.out.println(Enrollee.size());

        System.out.println(Enrollee.peek());

        Enrollee.remove();
        Enrollee.remove();
        Enrollee.remove();
        Enrollee.remove();
        Enrollee.remove();

        System.out.println(Enrollee);

        Enrollee.add("Jeremiah Pagarigan");
        Enrollee.add("Rizjake Pineda");
        Enrollee.add("J-rhyzz Tanghal");
        Enrollee.add("Jamil Valencia");
        Enrollee.add("Jap Bolanos");

        System.out.println(Enrollee);

        System.out.println(Enrollee.size());

        System.out.println(Enrollee.peek());

    }

}
