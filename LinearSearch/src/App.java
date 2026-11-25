import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to search for: ");
        int key = sc.nextInt();
        System.out.println(linearSearch(nums, key));
    }

    
    public static String linearSearch(int[][] array, int key)
    {
       	 for(int i = 0; i < array.length; i++)
       	 {
            for(int j=0; j<array[0].length; j++){

           	 	if(array[i][j] == key)
           	 	{
               		 return "Found at " + i + " : " + j;
            	}
        	}
       	 }
       	 return "The key was not found";
    }

}
