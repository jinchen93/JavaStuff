public class Main {
    public static void main(String[] args) {
        int myIntVal = 5;
        float myFloatVal = 5.25f;
        double myDoubleVal = 5.25;
//        float and doubles have different
//        levels of decimal precisions

//        width of float = 32 (4 bytes)
//        width of double = 64 (8 bytes)

        int pounds = 5;
        double kilograms = pounds * 0.45359237;
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms");
    }
}