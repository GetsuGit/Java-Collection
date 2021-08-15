package JavaCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("User 1");
        collection.add("User 2");
        collection.add("User 3");
        collection.addAll(List.of("User 4", "User 5", "User 6"));
        
    for (String value : collection){
        System.out.println(value);
    }

        System.out.println("===== Hasil Sisa Remove =====");
    collection.remove("User 3");
    collection.removeAll(List.of("User 6"));

    for (String value : collection){
        System.out.println(value);
    }

        System.out.println(collection.contains("User 2"));
        System.out.println(collection.containsAll(List.of("User 4", "User 5")));
    }
}