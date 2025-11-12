package h3;

public class H3_main {
    public static void main(String[] args) {

        float celsiusFloat = 14.2F;
        float fahrenheitFloat = 2.0F;
        double celsiusDouble = 14.2;
        double fahrenheitdouble = 4.0;

        fahrenheitdouble = (celsiusDouble * 9 / 5) + 32;
        fahrenheitFloat = (celsiusFloat * 9 / 5) + 32;

        System.out.println("Celsius (float): " + celsiusFloat);
        System.out.println("Fahrenheit (double): " + fahrenheitdouble);
        System.out.println("Celsius (double): " + celsiusDouble);
        System.out.println("Fahrenheit (float): " + fahrenheitFloat);

    }

}
