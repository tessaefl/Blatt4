package h3;

public class H3_main {
    public static void main(String[] args) {

        float celsiusFloat = 14.2F;
        float fahrenheitFloat = 2.0F;
        double celsiusDouble = 3.0;
        double fahrenheitdouble = 4.0;

        celsiusDouble = (fahrenheitFloat - 32) * 5 / 9;
        fahrenheitdouble = celsiusFloat * 9 / 5 + 32;

        System.out.println("Celsius (float): " + celsiusFloat);
        System.out.println("Fahrenheit (double): " + fahrenheitdouble);

    }

}
