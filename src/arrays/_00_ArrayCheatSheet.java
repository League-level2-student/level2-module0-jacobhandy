package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] string = {"1", "2", "3", "4", "5"};
		//2. print the third element in the array
		System.out.println(string[3]);
		//3. set the third element to a different value
		string[3] = "error";
		//4. print the third element again
		System.out.println(string[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		 
		for(int i = 0; i < string.length; i++) {
        System.out.println(string[i]);
		}
		
		//6. make an array of 50 integers
		int z [] = new int[50];
		//7. use a for loop to make every value of the integer array a random number
	    Random r = new Random();
	    
		for(int y = 0; y < z.length; y++) {
			z[y] = r.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int min = z[0];
		for(int a = 0; a < z.length; a++) {
			if(min>z[a]) {
				min = z[a];
			}
		}
		//9 print the entire array to see if step 8 was correct
		for(int s = 0; s < z.length; s++) {
			System.out.println(z[s]);
		}
		//10. print the largest number in the array.
		int max = 1;
		for(int e = 0; e < z.length; e++) {
			if(z[max]<z[e]) {
				max = e;
			}
		}
	System.out.println(z[max]);
	 










for(int q = 0; q < z.length -1; q++) {
	for(int w = q + 1; w<z.length; w++) {
		if(z[q] < z[w]) {
			int oof = z[q];
			z[q] = z[w];
			z[w] = oof;
		}
	}
}















}
