import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[] teams = {"cavaliers", "bulls", "lakers", "clippers", "heat", "cavaliers", "warriors", "bucks", "lakers",
        "jazz", "jazz", "blazers"};
        HashMap<String, Integer> champs = new HashMap<>();
        for (String s : teams) {
            champs.put(s,champs.getOrDefault(s, 0)+1);

        }
        System.out.println(champs);

        PhoneBook book = new PhoneBook();
            book.addContact("ЛеБрон", "1233344");
            book.addContact("Стефен", "5555555");
            book.addContact("Дэмиан","8888888");

            book.getContactAndPrint("ЛеБрон");

            }
        }





