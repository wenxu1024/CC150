import java.util.*;

// number of ways to representing n cents with ArrayList of coins.

public class Solution {
	public int waysToRepresent(ArrayList<Integer> coins, int n) {
		int i, j, l;
		l = coins.size();
		int[][] ways = new int[l + 1][n + 1];
		for(j = 0; j < n + 1; j ++) ways[0][j] = 0;
		ways[0][0] = 1;	
		for(i = 1; i < l + 1; i ++) {
			for(j = 0; j < n + 1; j ++) {
				if (coins.get(i - 1) > j) ways[i][j] = ways[i - 1][j];
				else {
					ways[i][j] = ways[i - 1][j] + ways[i][j - coins.get(i - 1)];
				}
			}
		}
		return ways[l][n];
	}

	public static void main(String[] args) {
		ArrayList<Integer> coins = new ArrayList<Integer> ();
		coins.add(25);
		coins.add(10);
		coins.add(5);
		coins.add(1);
		int n = 25;
		Solution sol = new Solution();
		System.out.println(sol.waysToRepresent(coins, n));
	}
};
