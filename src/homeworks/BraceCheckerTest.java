package homeworks;


public class BraceCheckerTest {

    public static void main(String[] args) {

        BraceChecker bc1 = new BraceChecker("hello from [java]");
        bc1.check();

        BraceChecker bc2 = new BraceChecker("{hello (java)}");
        bc2.check();

        BraceChecker bc3 = new BraceChecker("{[()]}");
        bc3.check();

        BraceChecker bc4 = new BraceChecker("hello java");
        bc4.check();

        BraceChecker bc5 = new BraceChecker("hello from [java)");
        bc5.check();

        BraceChecker bc6 = new BraceChecker("{[(])}");
        bc6.check();

        BraceChecker bc7 = new BraceChecker("hello from java]");
        bc7.check();

        BraceChecker bc8 = new BraceChecker("{hello java");
        bc8.check();

        BraceChecker bc9 = new BraceChecker("((()))");
        bc9.check();

        BraceChecker bc10 = new BraceChecker("(()");
        bc10.check();
    }
}
