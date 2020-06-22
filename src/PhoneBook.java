import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<String>> pb;

    public PhoneBook(){
        this.pb = new HashMap<>();
    }

    public void addContact(String name, String phonenum){
        HashSet<String>  book = pb.getOrDefault(name, new HashSet<>());
        book.add(phonenum);
        pb.put(name, book);
    }
    public void getContactAndPrint(String name){
        System.out.println("Контакт " + name + " Номер " + pb.getOrDefault(name, new HashSet<>()));
    }
}
