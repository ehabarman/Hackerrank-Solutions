package Regex.Backreferences.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackreferencesToFailedGroups{

        public static void main(String[] args) {

            BackreferencesToFailedGroups.Regex_Test tester = new BackreferencesToFailedGroups.Regex_Test();
            tester.checker("^(\\d{8}|(\\d{2}-){3}\\d{2})$");

        }

static class Regex_Test {

    public void checker(String Regex_Pattern) {

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}
}

