package h2;

public class H2_main {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = true;
        boolean a = true;
        boolean b = true;
        boolean c = true;

        int input = 10;

        if (input == 10 || input == 11) {
            x = true;
        } else {
            x = false;
        }

        if (input == 11 || input == 1) {
            y = true;
        } else {
            y = false;
        }

        if (x == true && y == true) {
            a = true;
        } else {
            a = false;
        }

        if (x == true || x != y) {
            b = true;
        } else {
            b = false;
        }

        if (y == false) {
            c = true;
        } else {
            c = false;
        }

        System.out.println("Input: " + input);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

    }

}
