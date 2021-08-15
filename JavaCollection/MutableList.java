package JavaCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Person{

   private String name;

   private List<String> hobbies;

   public Person(String name){
       this.name = name;
       this.hobbies = new ArrayList<>();
   }

   public void addHobby(String hobby){
       hobbies.add(hobby);
   }

   public List<String> getHobbies(){
       return Collections.unmodifiableList(hobbies);
   }

   public String getName(){
       return name;
   }
}

public class MutableList {
    public static void main(String[] args) {

    Person person = new Person("Getsu Code");

    person.addHobby("GAMING");
    person.addHobby("Music");
    person.addHobby("Ngopi");

    doSomethingWithHobbies(person.getHobbies());

    System.out.println(person.getName());

  for(String hobby : person.getHobbies()){
      System.out.println(hobby);

     }
    }

   public static void doSomethingWithHobbies(List<String> hobbies){
      hobbies.add("Bukan Hobby");
   }

}

