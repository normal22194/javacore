package homeworks;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;
            }
        }

        System.out.println("Count of " + n + ": " + count);

        // Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը

        for (int i = 0; i < numbers.length / 2; i++) {
            numbers[i] = numbers[i] + numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = numbers[i] - numbers[numbers.length - 1 - i];
            numbers[i] = numbers[i] - numbers[numbers.length - 1 - i];

            System.out.print("");
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը

        int repeatedCount = 0;

        for (int i = 0; i < numbers.length; i++)  {
            boolean alreadyCounted = false ;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted == false) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        repeatedCount++;
                        break;
                    }
                }
            } else {
                continue;
            }
        }

        System.out.println("repeated numbers count: " + repeatedCount);


        // Խնդիր 4 — Հաշվել ձայնավորների քանակը

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};

        int vowelsCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'ա' || chars[i] == 'ե' || chars[i] == 'է'
                    || chars[i] == 'ը' || chars[i] == 'ի' || chars[i] == 'ո'
                    || chars[i] == 'օ') {
                vowelsCount++;
            }
        }

        System.out.println("vowels count: " + vowelsCount);

    }
}