package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> string = new ArrayList<>();
        // List<String> string = new LinkedList();

        string.add("User 1");
        string.add("User 2");

        string.set(0, "User a");

        string.remove(1);
        System.out.println(string.get(0));

        for(String value : string){
            System.out.println(value);
        }




    }
}
