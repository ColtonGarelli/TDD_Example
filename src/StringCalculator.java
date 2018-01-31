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


        }
        int sum = 0;

        return sum;

    }
}
    
