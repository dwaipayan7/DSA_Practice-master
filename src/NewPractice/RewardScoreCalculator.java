package NewPractice;

public class RewardScoreCalculator {

    public static int sumOfDigits(int number){
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number = number/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sumOfDigit1 = sumOfDigits(10);
        int sumOfDigit2 = sumOfDigits(11);
        int reward = sumOfDigit1*sumOfDigit2;
        System.out.println(reward);
    }

}
