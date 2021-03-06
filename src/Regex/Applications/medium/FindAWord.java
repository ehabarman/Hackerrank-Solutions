package Regex.Applications.medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            sb.append(" "+in.nextLine());
        }

        int t = in.nextInt();
        while (t-- > 0) {
            int count = 0;
            String s = in.next();
            Pattern p = Pattern.compile("((?<=\\W)|^)"+s+"((?=\\W)|$)");
            Matcher m = p.matcher(sb.toString());
            while (m.find()) {
                count += 1;
            }
            System.out.println(count);
        }
    }
}
