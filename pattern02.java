import java.util.Scanner;

public class pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows");
        int row =sc.nextInt();
        System.out.println("Enter a number of columns");
        int col = sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
