import java.util.Scanner;

public class main {
    static Scanner object =new Scanner(System.in);
    public static void main(String[] args) {
        Calculator calc = new Calculator(5, 2, 5);
        int userPick;
        boolean answer;
        String[] menuArray = {"Adding two numbers", "Subtract two numbers", "Multiply two numbers", "Divide two numbers", "Adding N numbers", "Multiply N numbers", "Calculate area of circle"};
        do {
            UserMenu(menuArray);
            System.out.print("Your pick:");
            userPick = object.nextInt();
            if (userPick == 1) {
                System.out.println("Result:" + calc.addingTwoNumbers());
            }
            if (userPick == 2) {
                System.out.println("Result:" + calc.subtractingTwoNumbers());
            }
            if (userPick == 3) {
                System.out.println("Result:" + calc.multiplyNumbers());
            }
            if (userPick == 4) {
                System.out.println("Result:" + calc.divideNumbers());
            }
            if (userPick == 5) {
                System.out.println("Numbers added:" + calc.addingTwoNumbers());
                float sum = calc.addingTwoNumbers();
                do {
                    answer = userAnswer();
                    if (answer) {
                        System.out.print("Enter number to add:");
                        int n=object.nextInt();
                        sum = sum + calc.addingNNumbers(n);
                        System.out.println("Result:" + sum);
                    } else {
                        break;
                    }
                } while (answer);
            }
            if (userPick == 6) {
                System.out.println("Numbers multiplied:" + calc.multiplyNumbers());
                float sum = calc.multiplyNumbers();
                do {
                    answer = userAnswer();
                    if (answer) {
                        System.out.print("Enter number to multiply by:");
                        int n=object.nextInt();
                        sum = sum * calc.addingNNumbers(n);
                        System.out.println("Result:" + sum);
                    } else {
                        break;
                    }
                } while (answer);
            }
            if(userPick==7){
                System.out.println("Area circle:"+calc.circleArea());
            }
            answer = userAnswer();
        }while (answer);
    }
    public static boolean userAnswer(){
        System.out.print("Would you like to continue(y-yes)(n-no):");
        char answer=object.next().charAt(0);
        return answer == 'y' || answer == 'Y';
    }
    public static void UserMenu(String[]menuArray){
        System.out.println("---------------Menu---------------");
        for (int i = 0; i < menuArray.length; i++) {
            System.out.println(i + 1 + " " + menuArray[i]);
        }
    }
}
