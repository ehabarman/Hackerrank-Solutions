//Date 14-7-2018
package Algorithms.Implementation.medium;

import java.util.Arrays;
import java.util.Scanner;

public class OrganizingContainersOfBalls {

		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            int n = in.nextInt();
	            int[] a = new int[n];
				int[] b = new int[n];
				for(int i=0; i<n; i++)
				{
					for(int j=0; j<n; j++)
					{
						int x = in.nextInt();
						a[i] += x;
						b[j] += x;
					}
				}
	            Arrays.sort(a);
	            Arrays.sort(b);
	            if(Arrays.equals(a, b))
	                System.out.println("Possible");
	            else
	                System.out.println("Impossible");
	        }
	        in.close();
	    }
}
