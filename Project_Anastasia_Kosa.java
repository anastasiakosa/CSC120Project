import java.util.Scanner;

public class Project_Anastasia_Kosa
{
   public static void main(String[] args)
   {
   
      int speed = 0;
      int numCores = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter clock speed: ");
      numCores = keyboard.nextInt();
      
      System.out.print("Enter number of cores that your processor has: ");
      numCores = keyboard.nextInt();
      
      System.out.println(" Monitor Resolution");
      System.out.println("1. 1280 x 720");
      System.out.println("2. 1920 x 1080");
      System.out.println("3. 2560 x 1440");
      System.out.println("4. 3840 x 2160");
      
      System.out.print("\nEnter the resolution of your monitor: ");
      speed = keyboard.nextInt();
      
      }
}