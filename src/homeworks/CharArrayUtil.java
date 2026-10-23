package homeworks;

public class CharArrayUtil {
    public static void main(String[] args) {

        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        //Խնդիր 1 — Տպել բոլոր սիմվոլները

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        //Խնդիր 2 — Հաշվել սիմվոլների քանակը

        int count = 0;
        for (int i = 0; i < chars.length; i++);{
            count++;
        }
        System.out.println("characters count: " + count);
        System.out.println("first character: " + chars[0]);
        System.out.println("last character: " + chars[chars.length-1]);

        //Խնդիր 3 — Հաշվել տրված սիմվոլի հանդիպումների քանակը


        char c = 'a';
        int count2 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count2++;
            }
        }
        System.out.println("character 'a' count:" + count2);

        //Խնդիր 4 — Հաշվել ձայնավորների քանակը

        int count3 = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' ||
                    chars[i] == 'i' || chars[i] == 'o' ||
                    chars[i] == 'u' || chars[i] == 'A' ||
                    chars[i] == 'E' || chars[i] == 'I' ||
                    chars[i] == 'O' || chars[i] == 'U') {
                count3++;
            }
        }

        System.out.println("vowels count: " + count3);

        // Խնդիր 5 — Հաշվել բաղաձայնների քանակը

        int count4 = 0;

        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z' ||
                    chars[i] >= 'A' && chars[i] <= 'Z') &&
                    chars[i] != 'a' && chars[i] != 'e' &&
                    chars[i] != 'i' && chars[i] != 'o' &&
                    chars[i] != 'u' && chars[i] != 'A' &&
                    chars[i] != 'E' && chars[i] != 'I' &&
                    chars[i] != 'O' && chars[i] != 'U') {

                count4++;
            }
        }

        System.out.println("consonants count: " + count);

        // Խնդիր 6 — Հաշվել բացատների քանակը

        int count5 = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count5++;
            }
        }

        System.out.println("spaces count: " + count5);

        //Խնդիր 7 — Շրջել սիմվոլների հերթականությունը

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        //Խնդիր 8 — Փոխել մեծատառերը և փոքրատառերը

        char[] chars1 = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };

        for (int i = 0; i < chars.length; i++) {
            if (chars1[i] >= 'a' && chars1[i] <= 'z') {
                chars1[i] = (char) (chars1[i] - 32);
            }
        }

        System.out.print("uppercase: ");
        for (int i = 0; i < chars1.length; i++) {
            System.out.print(chars1[i]);
        }

        System.out.println();

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] >= 'A' && chars1[i] <= 'Z') {
                chars1[i] = (char) (chars1[i] + 32);
            }
        }

        System.out.print("lowercase: ");
        for (int i = 0; i < chars1.length; i++) {
            System.out.print(chars1[i]);
        }
        System.out.println();

        //Խնդիր 9 — Փոխարինել տրված սիմվոլը

        char oldChar = 'a';
        char newChar = '*';

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == oldChar) {
                chars1[i] = newChar;
            }
        }

        for (int i = 0; i < chars1.length; i++) {
            System.out.print(chars1[i]);
        }
        System.out.println();

        //Խնդիր 10 — Ստուգել Palindrome-ը
        char[] chars2 = {'l', 'e', 'v', 'e', 'l'};

        boolean isPalindrome = true;

        for (int i = 0; i < chars2.length / 2; i++) {
            if (chars2[i] != chars2[chars2.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("is palindrome: " + isPalindrome);
    }
}
