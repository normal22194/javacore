package homeworks;
import java.util.Stack;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {

        Stack<Character> stack = new Stack<>();
        Stack<Integer> positions = new Stack<>();

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            if (c == '{' || c == '[' || c == '(') {

                stack.push(c);
                positions.push(i);

            } else if (c == '}' || c == ']' || c == ')') {

                if (stack.isEmpty()) {
                    System.out.println("error: unexpected closing bracket " + c + " at " + i);
                    return;
                }

                char opened = stack.peek();

                if ((opened == '{' && c == '}') ||
                        (opened == '[' && c == ']') ||
                        (opened == '(' && c == ')')) {

                    stack.pop();
                    positions.pop();

                } else {

                    char expected = '}';

                    if (opened == '[') {
                        expected = ']';
                    } else if (opened == '(') {
                        expected = ')';
                    }

                    System.out.println("error: opened " + opened +
                            " but closed " + c + " at " + i +
                            ". expected " + expected);
                    return;
                }
            }
        }

        if (!stack.isEmpty()) {

            char opened = stack.peek();
            int position = positions.peek();

            System.out.println("error: unclosed bracket " + opened +
                    " at " + position);

        } else {

            System.out.println("no errors");
        }
    }
}