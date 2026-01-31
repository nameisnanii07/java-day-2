import java.util.Scanner;

public class User1
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    System.out.println("enter a value=" + a);

    int b = sc.nextInt();
    System.out.println("enter b value=" + b);

    int sum = a + b;
    System.out.println("The sum=" + sum);

    float c = sc.nextFloat();
    System.out.println("Enter c value:=" + c);

    double d = sc.nextDouble();
    System.out.println("Enter d value:=" + d);

    sc.nextLine();

    String n = sc.nextLine();   
    System.out.println("Enter n value:=" + n);

} 
    }
        
    
    