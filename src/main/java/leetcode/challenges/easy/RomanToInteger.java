package leetcode.challenges.easy;

public class RomanToInteger {

    // This methode will take a Roman Numeral as a String and convert it into an Integer
    public int romanToInt(String s) {

        int solution = 0;
        int addition = 0;

        for (int i = 0; i < s.length(); i++) {

                switch (s.charAt(i)) {
                    case 'I':
                        if (i + 1 != s.length()) {
                            addition = checkForSubtraction(s.charAt(i + 1), 1);
                        } else addition = 1;
                        break;
                    case 'V':
                        addition = 5;
                        break;
                    case 'X':
                        if (i + 1 != s.length()) {
                            addition = checkForSubtraction(s.charAt(i + 1), 2);
                        } else addition = 10;
                        break;
                    case 'L':
                        addition = 50;
                        break;
                    case 'C':
                        if (i + 1 != s.length()) {
                            addition = checkForSubtraction(s.charAt(i + 1), 3);
                        } else addition = 100;
                        break;
                    case 'D':
                         addition = 500;
                         break;
                    case 'M':
                        addition = 1000;
                        break;
                }
                solution = solution + addition;

            // In case the next to last and last letter form a union (e.g. "XL" equals "40", "XC" equals "90")
            // the last letter is to be ignored (counter will be increased by 2).
            int firstDigitOfAddition = Integer.parseInt(Integer.toString(addition).substring(0, 1));
                if ((firstDigitOfAddition == 4) || (firstDigitOfAddition == 9)) {
                    i++;
                };
        }

    return solution;
    }

    private int checkForSubtraction(char next, int decimalPower) {

        switch (decimalPower) {
            case 1:
                if (next == 'V') {
                    return 4;
                } else if (next == 'X') {
                    return 9;
                }
                return 1;

            case 2:
                if (next == 'L') {
                    return 40;
                } else if (next == 'C') {
                    return 90;
                }
                return 10;

            case 3:
                if (next == 'D') {
                    return 400;
                } else if (next == 'M') {
                    return 900;
                }
        }
        return 100;
    }

}

