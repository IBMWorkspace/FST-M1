package Activites;
import java.util.*;
public class Activity2 {
	public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] numbers =new int[n];
        for(int i=0;i<n;i++)
        	numbers[i]=sc.nextInt();

        int sum = 0;

        
        for (int num : numbers) {
            if (num == 10) {
                sum += num;
            }
        }

        
        if (sum == 30) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
