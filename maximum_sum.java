import java.util.*;
public class maximum_sum {
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
        brutefrce(arr,n);
        prefix_sum(arr,n);
        kadanes_algorithm(arr,n);
    }
    private static void brutefrce(int[] arr, int n) {
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=i;j<n;j++)
            {
                sum += arr[j];
                if(sum > max_sum)
                {
                    max_sum = sum;
                }
            }
        }
        System.out.println("Maximum sum of subarray is: " + max_sum);
    }
    // prefix sum approach
    private static void prefix_sum(int[] arr, int n) {
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum = prefix[j] - (i > 0 ? prefix[i-1] : 0);
                if(sum > max_sum)
                {
                    max_sum = sum;
                }
            }
        }
        System.out.println("Maximum sum of subarray is: " + max_sum);
    }
    // kadanes algorithm is a optimal solution for maximum sum of subarray problem
    private static void kadanes_algorithm(int[] arr, int n) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for(int i=0;i<n;i++)
        {
            current_sum += arr[i];
            if(current_sum > max_sum)
            {
                max_sum = current_sum;
            }
            if(current_sum < 0)
            {
                current_sum = 0;
            }
        }
        System.out.println("Maximum sum of subarray is: " + max_sum);
    }
}
