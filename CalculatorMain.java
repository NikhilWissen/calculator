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
        System.out.println("Addition of : " + number1 + " and " + number2);
        System.out.println("result : " + cal.add(number1, number2));
        
        System.out.println("Sub of : " + number1 + " and " + number2);
        System.out.println("result : " + cal.sub(number1, number2));
        
    }
}
