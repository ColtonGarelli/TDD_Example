public class StringCalculator implements StringCalculatorInterface{

    public int Add(String numbers) {
        if(numbers.length()==0){
            return 0;
        }
        else if(!numbers.contains(",")) {
            int number = Integer.parseInt(numbers);
            return number;
        }
        else{
            String number1 = String.valueOf(numbers.charAt(0));
            int firstNumber = Integer.parseInt(number1);
            String number2 = String.valueOf(numbers.charAt(3));
            int secondNumber = Integer.parseInt(number2);
            int sum = firstNumber+secondNumber;
        }
        return 0;
    }
}
    
