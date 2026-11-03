package homeworks;

public class DynamicArray {

    public static void main(String[] args) {

        // test 1

        System.out.println("test 1");

        DynamicArrayDemo numbers1 = new DynamicArrayDemo();

        for (int i = 1; i <= 5; i++) {
            numbers1.add(i * 10);
        }

        numbers1.print();


        // test 2

        System.out.println("test 2");

        DynamicArrayDemo numbers2 = new DynamicArrayDemo();

        for (int i = 1; i <= 15; i++) {
            numbers2.add(i);
        }

        numbers2.print();


        // test 3

        System.out.println("test 3");

        DynamicArrayDemo numbers3 = new DynamicArrayDemo();

        for (int i = 1; i <= 25; i++) {
            numbers3.add(i);
        }

        numbers3.print();


        // test 4

        System.out.println("test 4");

        System.out.println("first elment: " + numbers3.getByIndex(0));

        System.out.println("last element: " + numbers3.getByIndex(24));

        System.out.println("negative index: " + numbers3.getByIndex(-1));

        System.out.println("non existing index: " + numbers3.getByIndex(30));


        DynamicArrayDemo empty = new DynamicArrayDemo();

        System.out.println("empty array: " + empty.getByIndex(0));
    }
}
