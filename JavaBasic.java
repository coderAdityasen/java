import java.util.Scanner;

public class JavaBasic {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter number 1 for add , 2 for sub , 3 for mult , 4 for divide");
            int op = sc.nextInt();
            System.out.println("enter first number");
            int num1 = sc.nextInt();
            System.out.println("Enter second number");
            int num2 = sc.nextInt();

            if(op < 5 && op > 0 ){
                switch (op) {
                    case 1:
                        System.out.println(num1 + num2);
                        break;
                    case 2:
                    System.out.println(num1 - num2);
                        break;
                    case 3: 
                    System.out.println(num1 * num2);
                        break;
                    case 4:
                    if(num2 == 0){
                        System.out.println("divisible number not be zero");
                    }else{
                    System.out.println(num1 / num2);
                    }
                    default:
                        break;
                }

            }else{
                System.out.println("enter number between 1 to 4");
            }

        }
    }
}
