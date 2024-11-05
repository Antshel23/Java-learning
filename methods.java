public class methods {

    public static void main(String[] args) {
        printSentence();
        printSentenceWithName("Ant");
        add(6,11);
        add(4,8);
    }

    static void printSentence() {
        System.out.println("Hi");
    }

    static void printSentenceWithName(String name) {
        System.out.println("Hi " + name);
    }

    static boolean checkNumbers(int x, int y) {
        if (x > 5 && y > 10) {
            return true;
        }
        else {
            return false;
        }
    }

    static void add(int x, int y) {
        if (checkNumbers(x, y)) {
            System.out.println(x+y);
        }
        else {
            System.out.println("Numbers not large enough");
        }
    }
}
