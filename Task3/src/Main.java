import java.util.Scanner;


public class Main {
    private static final String VERIFICATOR = "((([А-я]+)|([А-я-]+))\\s){2}(([А-я]+)|([А-я-]+))";

    public static void main(String[] args) {
        printFIO();
        //todo ФИО

    }

    private static void printFIO() {
        System.out.println("Введи ФИО полностью");
        String inputUser = new Scanner(System.in).nextLine();
        boolean flag = true;
        int count = 0;
        inputUser = inputUser.replaceAll("\\s+", " ").trim();
        System.out.println(inputUser);
        for (int i = 0; i < inputUser.length(); i++) {
           if (!inputUser.matches(VERIFICATOR)) {
                flag = false;
                System.out.println("Введенная строка не является ФИО");
                break;
            }
        }
        System.out.println(flag);
        System.out.println(count);

        if (flag) {
            System.out.println(inputUser.replaceAll("\\s", "\n"));
        }
    }
}