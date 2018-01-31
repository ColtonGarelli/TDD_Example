

public class StringCalculator implements StringCalculatorInterface{

    public int Add(String numbers) {
        if(numbers == ""){
            return 0;
        }
        else if(!numbers.contains(",")) {
            int number = Integer.parseInt(numbers);
            return number;
        }
        else{
            //Austin's solution
            int sum = 0;
            String[] output = numbers.split("\\,");

            for (int i = 0; i<output.length;i++){
                sum += Integer.valueOf(output[i]);
            }

            return sum;

            /*
            String number1 = String.valueOf(numbers.substring(0,(numbers.indexOf(",")-1)));
            int firstNumber = Integer.parseInt(number1);
            String number2 = String.valueOf(numbers.substring(3));
            int secondNumber = Integer.parseInt(number2);
            int sum = firstNumber+secondNumber;
            return sum;
            */
        }
        //return 0;
    }
}
    
