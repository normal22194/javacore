package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        // Խնդիր 1 — Տպել զանգվածի բոլոր էլեմենտները;

        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //Խնդիր 2 — Տպել առաջին էլեմենտը

        System.out.print("first element: " +  numbers[0]);
        System.out.println();
        //Խնդիր 3 — Տպել վերջին էլեմենտը

        System.out.print("last element: " +  (numbers[8]));
        System.out.println();
        //Խնդիր 4 — Տպել զանգվածի երկարությունը

        System.out.println("array lenght: " + numbers.length);
        //Խնդիր 5 — Գտնել ամենափոքր թիվը

        int min = numbers[0];
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            //Խնդիր 6 — Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները
        }
        System.out.println("min = " + min);
        int[] nums = {10, 20, 30, 40, 50, 60};
        System.out.println("lenght = " +  nums.length);
        if (nums.length < 2)
            System.out.println("Can't print middle values");
        else if (nums.length % 2 == 0)
            System.out.println("middle element " + nums[nums.length / 2] + ", " + nums[nums.length / 2 -1]);
        else System.out.println("middle element " + (nums[nums.length / 2]));
        //Խնդիր 7 — Հաշվել զույգ թվերի քանակը

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] );
                count++;
            }
        }
        System.out.println("even numbers count: " +  count);
        //Խնդիր 8 — Հաշվել կենտ թվերի քանակը

        int countt = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1 || numbers[i] % 2 == -1) {
                System.out.println(numbers[i]);
                countt++;
            }
        }
        System.out.println("odd numbers count: " + countt);
        //Խնդիր 9 — Հաշվել զանգվածի էլեմենտների գումարը

        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum: " + sum);
        //Խնդիր 10 — Հաշվել միջին թվաբանականը

        double average = (double) sum / numbers.length;
        System.out.println("average: " + average);
        // bonus
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max: " + max);
        //bonus2

        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positive++;
            } else if (numbers[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("positibe numbers: " + positive);
        System.out.println("negative numbers: " + negative);
        System.out.println("zeros: " + zero);
        //bonus3

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
            System.out.println();
        }
        System.out.println(":)");
    }
}