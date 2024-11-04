public class vars_datatypes {
    public static void main(String[] args) {

    //variable dec/init
    final String myName = "Ant";
    int myAge = 22;
    char firstInitial = 'A';
    boolean isHuman = true;
    double ageAsDouble = 22.723d;

    //logical operators (+ - * / % ++ -- <> && ||) and boolean/math methods 
    int sum = 0;
    sum += 6; // = 6
    sum *= 5; // = 30
    sum /= 3; // = 10
    sum %= 4; // = 2
    sum++; // = 3
    sum--; // = 2
    System.out.println(sum > 3); // false
    System.out.println(!(sum > 3)); // true
    System.out.println(sum < 3 && sum > 1); // true
    System.out.println(sum > 3 || sum > 4 ); // false
    System.out.println(Math.max(4,7)); // 7
    System.out.println(Math.min(4,7)); // 4
    System.out.println(Math.sqrt(144)); // 12
    System.out.println((int)Math.random()* 100); // number between 0-100


    //string methods
    System.out.println(myName.length()); // length is 3
    System.out.println(myName.toUpperCase()); // ANT
    System.out.println(myName.toLowerCase()); // ant
    System.out.println(myName.indexOf('n')); // 1
    System.out.println("Name: " + myName + " Age: " + myAge + " First Initial: " 
    + firstInitial + " Is Human?: " + isHuman + " Age as Double: " + ageAsDouble); //concats
    }
}
