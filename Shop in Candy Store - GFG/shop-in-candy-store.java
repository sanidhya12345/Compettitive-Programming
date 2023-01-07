//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int K = Integer.parseInt(input_line[1]);
            input_line = read.readLine().trim().split("\\s+");
            int candies[]= new int[N];
            for(int i = 0; i < N; i++)
                candies[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            ArrayList<Integer> cost = ob.candyStore(candies,N,K);
            System.out.println(cost.get(0)+" "+cost.get(1));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        // code here
        
        ArrayList<Integer>ans=new ArrayList<>();
        Arrays.sort(candies);
        int minimum=0;
        int buy=0;
        int free=N-1;
        while(buy <= free){
            minimum+=candies[buy];
            buy++;
            free-=K;
        }
        ans.add(minimum);
        buy=N-1;
        free=0;
        int maximum=0;
        while(buy>= free){
            maximum+=candies[buy];
            buy--;
            free+=K;
        }
        ans.add(maximum);
        return ans;
        
    }
}