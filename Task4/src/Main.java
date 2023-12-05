import java.util.Scanner;

public class Main {
    private static final String INPUT_REGEX = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static final String OUTPUT_REGEX = "+7 ($2) $3 $4-$5";
    private static final String OUTPUT_REGEX2 = "+7 ($1) $2 $3-$4";

    public static void main(String[] args) {
        //todo Numbers
        while (true) {
            String input = new Scanner(System.in).nextLine();
            input = input.replaceAll("\\D+", "");
            if (input.length() == 11) {
                input = input.replaceAll("(\\d)" + INPUT_REGEX, OUTPUT_REGEX);
                System.out.println(input);
            } else if (input.length() == 10) {
                input = input.replaceAll(INPUT_REGEX, OUTPUT_REGEX2);
                System.out.println(input);
            } else System.out.println("Это не номер");
        }

    }
}