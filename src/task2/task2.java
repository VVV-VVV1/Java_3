package task2;


public class task2 {
    public static void main(String[] args) {
        {
            Double x = Double.valueOf(5);

            String str = "6.557";
            Double b = Double.parseDouble(str);

            Double d = Double.valueOf(6.5656);

            System.out.println("Double to byte: " + d.byteValue() );
            System.out.println("Double to short: " + d.shortValue() );
            System.out.println("Double to int: " + d.intValue() );
            System.out.println("Double to long: " + d.longValue() );
            System.out.println("Double to float: " + d.floatValue() );
            System.out.println("Double to double: " + d.doubleValue() );

            double total = 44;
            String total2 = String.valueOf(total);
        }
    }
}
