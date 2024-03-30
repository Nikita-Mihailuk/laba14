import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите IPv4: ");
        String input = in.nextLine();

        Pattern pattern = Pattern.compile("\\b((\\d\\d?|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d\\d?|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find())
        {
            System.out.println("Верный IPv4: " + matcher.group());
        }
    }
}