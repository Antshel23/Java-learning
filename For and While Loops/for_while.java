public class for_while {
    public static void main(String[] args) {

        int num = 5;
        while(num>0) {
            System.out.println(num);
            num--;
        }

        for (int x = 0; x < 6; x++) {
            System.out.println(x);
        }

        for (int o = 0; o < 3; o++) {
            System.out.println("outer" + o);

            for (int i = 0; i < 3; i++) {
                System.out.println("inner" + i);
            }
        }

        String[] shapes = {"circle", "rectangle", "triangle"};
        for (String shape : shapes) {
            System.out.println(shape);
        }

        for (int a = 0; a < 10; a++) {
            if (a == 4) {
                continue;
            }
            System.out.println(a);

            if (a==8) {
                break;
            }
        }
    }
}
