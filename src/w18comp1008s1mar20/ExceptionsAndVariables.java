package w18comp1008s1mar20;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class ExceptionsAndVariables
{
    public static void main(String[] args)
    {
        int number=0; //variable used outside of the try block, need to be defined
                      //outside of the try block.
        try{
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter your favourite number: ");
            number = keyboard.nextInt();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        System.out.printf("My fav number is: %d%n",number);
    }
}
