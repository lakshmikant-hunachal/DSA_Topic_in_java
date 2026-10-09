import java.util.Scanner;
public class shell_and_buy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        shell_andbuy(arr,n);
    }
    private static void shell_andbuy(int[] arr, int n) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] < min_price)
            {
                min_price = arr[i];
            }
            else if(arr[i] - min_price > max_profit)
            {
                max_profit = arr[i] - min_price;
            }
        }
        System.out.println("Maximum profit is: " + max_profit);
    }
}

