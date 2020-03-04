package Tasks.t11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\projects\\src\\Tasks\\t11\\input3.txt");
        Scanner in = new Scanner(file);
        StringBuilder sb = new StringBuilder();
        while(in.hasNextLine()) {
            sb.append(in.nextLine());
        }
        String text = sb.toString();

        Pattern pattern = Pattern.compile("([А-Я][а-я]+\\s[А-Я][а-я]+\\s[А-Я][а-я]+)+");
        Pattern pattern1 = Pattern.compile("([А-Я][а-я]+\\s[А-Я]\\.[А-Я]\\.+)");
        Matcher match = pattern.matcher(text);
        Matcher match1 = pattern1.matcher(text);

        while (match1.find()) {
            System.out.println(match1.group() + " ");
        }

        while (match.find()) {
            System.out.println(match.group() + " ");
        }
    }
}
