public class CalculatorMain 
{
    public static void main( String[] args )
    {
        int number1=5;
        int number2=10;
        if (args.length > 0) {
            try {
                number1 = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                //Ignore
            }
        }
        if (args.length > 1) {
            try {
                number2 = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                //Ignore
            }
        }

        Calculator cal = new Calculator();
        System.out.println(cal.add(number1, number2));

    }
}
