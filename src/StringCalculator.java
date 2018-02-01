

public class StringCalculator implements StringCalculatorInterface{

    public int Add(String numbers) {
        if(numbers == ""){
            return 0;
        }
        else if(!numbers.contains(",")) {
            int number = Integer.parseInt(numbers);
            return number;
        }
        else {
            //Austin's solution
            //Works for strings (arrays) of any length
            int sum = 0;
            String[] output = numbers.split(",");
            for (int i = 0; i < output.length; i++) {
                sum += Integer.valueOf(output[i]);
            }
            return sum;
        }
    }
}
    
