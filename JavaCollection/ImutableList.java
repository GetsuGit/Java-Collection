package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImutableList {
    public static void main(String[] args) {

     List<String> one = Collections.singletonList("Satu");
     List<String> empty = Collections.emptyList();

     List<String> mutable = new ArrayList<>();
     mutable.add("User 1");
     mutable.add("User 2");

     List<String> immutable = Collections.unmodifiableList(mutable);

     List<String> elements = List.of("User 1", "User 2", "User 3");
     elements.add("User 4");

    }
}
