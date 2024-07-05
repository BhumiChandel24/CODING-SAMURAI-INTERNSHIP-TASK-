import java.util.Scanner;
class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char operator ;
        Double num1 , num2 , result ;

        //ask user to enter operator
        System.out.println("choose an operator: + , - , * or / ");
        operator = sc.next().charAt(0) ;

        //ask user to enter numbers
        System.out.println("enter first number");
        num1 = sc.nextDouble() ;

        System.out.println("enter second number");
        num2 = sc.nextDouble() ;

        switch(operator){

            //performs addition between two numbers
            case '+' :
                result = num1 + num2 ;
                System.out.println(num1 + " + " + num2 + " = " + result );
                break;

            //performs subtraction between two numbers
            case '-' :
                result = num1 - num2 ;
                System.out.println(num1 + " - " + num2 + " = " + result );
                break;

            //performs multiplication between two numbers
            case '*' :
                result = num1 * num2 ;
                System.out.println(num1 + " * " + num2 + " = " + result );
                break;

            //performs division between two numbers
            case '/' :
                if(num2 == 0){
                    System.out.println("INVALID OPERATOR");
                }
                else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;

            default:
                System.out.println("INVALID OPERATOR !");
                break ;
        }
    }
}