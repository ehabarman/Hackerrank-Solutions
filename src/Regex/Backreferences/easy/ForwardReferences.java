package Regex.Backreferences.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForwardReferences {

    public static void main(String[] args) {

        MatchingSameTextAgainAndAgain.Regex_Test tester = new MatchingSameTextAgainAndAgain.Regex_Test();
        tester.checker("^((tac){2,}tic)+(\\2+(tic)?)*$");

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

