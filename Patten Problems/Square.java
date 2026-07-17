import java.util.Scanner;
public class Square
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++)
        {
            System.out.println("");
            for (int j = 0; j < n; j++)
            {
                System.out.print("* ");
            }
        }
    }
}
