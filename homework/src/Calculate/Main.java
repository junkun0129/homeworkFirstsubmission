package Calculate;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

    loop: for(int i = 0; i <=100; i++){
        System.out.println("----------------------------------------------");
        System.out.println("Please type the first number");
        double number1 = scanner.nextDouble();
        
        System.out.println("Choose an operation: ");
        System.out.println("> Type + for addition");
        System.out.println("> Type - for subtraction");
        System.out.println("> Type * for multiplication");
        System.out.println("> Type / for division");
        String operator = scanner.next();

        System.out.println("Please type the second number");
        double number2 = scanner.nextDouble();

        if(number2 == 0){
            System.out.println("cannot divide by zero");
        }else{

        Calculator cal = new Calculator(number1, number2);

        switch(operator){
            case "+":
                System.out.println(number1 + "+" + number2 + "=" + cal.add());
                break;
            case "-":
                System.out.println(number1 + "-" + number2 + "=" + cal.subtract());
            break;
            case "*":
                System.out.println(number1 + "*" + number2 + "=" + cal.multiply());
            break;
            case "/":
                System.out.println(number1 + "/" + number2 + "=" + cal.divide());
            break;
            default:
                System.out.println("you can not calcurate with this operator");
            break;
            }
        }
        System.out.println("do you want to continue or quit?");
        String disition = scanner.next();
        switch(disition){
            case "continue":
                System.out.println("Bye!");
            break;
            case "quit":
                System.out.println("Bye!");
            break loop;  
            default:
                System.out.println("concidering you want to continue");
               
        }

        // if(disition == "continue"){
        //     System.out.println("Ok");
        // }else if(disition == "quit"){
        //     System.out.println("Bye!");
        //     break loop;
        // }
        
}



        
        // Calculator cal = new Calculator(3,2);
        // System.out.println(cal);

        // System.out.println(cal.add());
        // System.out.println(cal.subtract());
        // System.out.println(cal.multiply());
        // System.out.println(cal.divide());
    }
}
