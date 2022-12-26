import java.util.Map;
import java.util.HashMap;

public class task2 {
    
    public static void main(String[] args) {
        Map<String, Integer> CountRepeat = new HashMap<>();
        String NameAndSurname = "Иван Иванов " +
                "Анастасия Власенкова " +
                "Карина Петрова " +
                "Анна Гончарова " +
                "Анна Семенова " +
                "Иван Кошкин " +
                "Сергей Камышов " +
                "Марина Ольгина " +
                "Сергей Пупкин " +
                "Иван Федоров " +
                "Марина Светлова " +
                "Карина Петрова ";       
         
        String[] journal = NameAndSurname.split(" ");
        for (int i = 0; i < journal.length; i += 2) {
            if (CountRepeat.containsKey(journal[i])) {
                CountRepeat.replace(journal[i], CountRepeat.get(journal[i]) + 1);
            } else {
                CountRepeat.put(journal[i], 1);
            }
        }
        System.out.println(CountRepeat);
    }
}