//this is teh naive solution with o(n^3) time complexity bettert solution with time complexity o(n^2) is listed below this code

/*import java.util.*;

public class longest_substring_with_all_distinct_characters {

    public static boolean aredistinct(String s, int i, int j) {
        boolean visited[] = new boolean[256];
        for (int k = i; k <= j; k++) {
            if (visited[s.charAt(k)]==true) {
                return false;
            }
            visited[s.charAt(k)] = true;
        }
        return true;
    }

    public static int islongest(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++)
            for (int j = 0; j < s.length(); j++)
                if (aredistinct(s, i, j))
                    res = Math.max(res, (j - i) +1);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String s = sc.nextLine();

        System.out.println(islongest(s));
    }

}*/


import java.util.Scanner;

class GFG { 
    
    static int longestDistinct(String str) 
    { 
	int n = str.length(); 
	int res = 0;
	for (int i = 0; i < n; i++){
	    boolean visited[]=new boolean[256];
	    for(int j=i;j<n;j++){
	        if(visited[str.charAt(j)]==true){
	            break;
	        }
	        else{
	            res=Math.max(res,j-i+1);
	            visited[str.charAt(j)]=true;
	        }
	    }
	} 
	return res; 
    } 
    
    public static void main(String args[]) 
    { 
        String str = "geeksforgeeks"; 
	    int len = longestDistinct(str);  
        System.out.print("The length of the longest distinct characters substring is "+ len); 
    } 
} 
