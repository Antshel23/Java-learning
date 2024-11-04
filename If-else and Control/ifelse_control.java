public class ifelse_control {
    public static void main(String[] args) {

    //long if-elif-else
    int num = 230;
    if (num > 250) {
        System.out.println("Expensive");
    }
    else if (num > 225) {
        System.out.println("Pricey");
    }
    else {
        System.out.println("Average");
    }

    //short ternary if-else
    String result = (num > 250) ? "Expensive" : "Pricey";
    System.out.println(result);

    //switch cases

    switch (num) {
        case 229:
        System.out.println("Matched at 229");
        break;
        case 230:
        System.out.println("Matched at 230");
        break;
        case 231:
        System.out.println("Matched at 231");
        break;
        default:
        System.out.println("No match");
    }

}
}
