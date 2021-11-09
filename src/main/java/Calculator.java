public class Calculator {
    public static double Calculator(double firstNum, double secondNum, String operator) {
        switch (operator) {
            case "+":
                return firstNum + secondNum;
            case "-":
                return firstNum - secondNum;

            case "*":
                return firstNum * secondNum;

            case "/":
                if(secondNum != 0){
                    return firstNum / secondNum;
                } else {
                    throw new RuntimeException("Ko the chia cho O");
                }
            default:
                throw new RuntimeException("Ko ton tai");
        }
    }
}
