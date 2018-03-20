package w18comp1008s1mar20;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class ExceptionExperiment
{
    public static int quotient(int numerator, int denominator)
    {
        return numerator/denominator;
    }
    
    public static void main(String[] args)
    {
        boolean continueLoop=true;
        do{
            try{
                Scanner keyboard = new Scanner(System.in);

                System.out.print("Enter the numerator: ");
                int numerator = keyboard.nextInt();

                System.out.print("Enter the denominator: ");
                int denominator = keyboard.nextInt();

                System.out.printf("Result: %d / %d = %d%n", numerator, denominator, 
                                                          quotient(numerator,denominator));
                continueLoop=false;
            }
            catch (InputMismatchException mismatch)
            {
                System.out.printf("Only numbers allowed here.%n");
            }
            catch (ArithmeticException mathException)
            {
                System.out.printf("Your created a math error: %s%n", mathException.getMessage());
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }while(continueLoop);
    }
}
