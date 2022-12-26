import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map;

public class task1 {
     public static void main(String[] args) {
        
        Map<String, List<String>> phonebook = new HashMap<>();
        phonebook.put("Власенков", List.of("+7(911)451-67-24", "+7(911)451-67-23"));
        phonebook.put("Кошкин", List.of("+7(911)341-78-24", "+7(921)541-78-23"));
        phonebook.put("Петров", List.of("+7(554)575-23-98", "+7(667)623-26-66"));

        ScreenMenu(phonebook);

    }
    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        scanner.close();
        return scan;
    }
    public static void FunctionFind(Map<String, List<String>> phonebook) {
        System.out.println("Введите фамилию: ");
        String surname = scanner();
        System.out.println(phonebook.get(surname));

    }

    public static void FunctionView(Map<String, List<String>> phonebook) {
        System.out.println(phonebook);
    }

    public static Map<String, List<String>> ScreenMenu(Map<String, List<String>> phonebook) {
        System.out.println(
                "Введите команду из списка: 1 - найти контакт, 2 - показать всю контакты, 3 - выйти");
        while (true) {
            String comands = scanner();
            if (comands.equals("3")) {
                break;
            } else {
                switch (comands) {
                    case "1":
                        FunctionFind(phonebook);
                        break;
                    case "2":
                        FunctionView(phonebook);
                        break;
                    default:
                        break;
                }
            }
        }
        return phonebook;
    }
}
