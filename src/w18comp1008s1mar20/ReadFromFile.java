package w18comp1008s1mar20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JWright
 */
public class ReadFromFile
{
    public static void displayToScreen() throws FileNotFoundException
    {
        File buildFile = new File("build.xml");
        Scanner fileScanner = new Scanner(buildFile);
        
        while (fileScanner.hasNext())
        {
            System.out.println(fileScanner.nextLine());
        }
    }
    
    public static void main(String[] args)
    {
        try
        {
            displayToScreen();
        } catch (FileNotFoundException ex)
        {
            System.err.println(ex.getMessage());
        }
    }
}
