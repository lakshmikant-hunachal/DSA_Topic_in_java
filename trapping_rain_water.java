import java.util.Scanner;
public class trapping_rain_water {
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
        // find out the left max and right max for each element in the array
        int[] left_max = new int[n];  
        int[] right_max = new int[n];
        left_max[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            left_max[i] = Math.max(left_max[i-1],arr[i]);
        }
        right_max[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right_max[i] = Math.max(right_max[i+1],arr[i]);
        }
        int trapped_water = 0;
        for(int i=0;i<n;i++)
        {
            trapped_water += Math.min(left_max[i],right_max[i]) - arr[i];
        }
        System.out.println("Trapped water is: " + trapped_water);
    }   
}
