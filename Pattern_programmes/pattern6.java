import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args)
    {
        System.out.println("Enter a number you want to see *\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("   ");
            }
            for (int j = i; j <= n;j++)
            {

                System.out.print(" * ");
            }
            for( int j = i;j<n; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}

