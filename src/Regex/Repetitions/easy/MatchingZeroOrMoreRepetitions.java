package Regex.Repetitions.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingZeroOrMoreRepetitions {

    public static void main(String[] args) {

        MatchingZeroOrMoreRepetitions.Regex_Test tester = new MatchingZeroOrMoreRepetitions.Regex_Test();
        tester.checker("^\\d{2,}[a-z]*[A-Z]*$");

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