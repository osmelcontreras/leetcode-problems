package com.leetcode.easy;

import java.util.HashMap;

public class ClimbingStairsSolution {
	public HashMap<Integer, Integer> memo = new HashMap<>();

	public int climbStairs(int n) {

		int result = 0;

		if (memo.containsKey(n)) {
			return memo.get(n);
		}

		if (n == 1) {
			return 1;
		}

		if (n == 2) {
			return 2;
		}
		if (n == 3) {
			return 3;
		}

		int oneWayMethod = climbStairs(n - 1);
		int twoWayMethod = climbStairs(n - 2);
		result = oneWayMethod + twoWayMethod;

		memo.put(n, result);

		return result;
		// memo.put(n, twoWayMethod);

//         int oneWays = 0;
//         for(Map.Entry<Integer, Integer> entry : memo.entrySet() ){

//            if(entry.getKey().equals(n)){
//                oneWays = entry.getValue();
//            }

//         }
//         int twoWays = 0;
//         for(Map.Entry<Integer, Integer> entry1 : memo1.entrySet() ){
//            if(entry1.getKey().equals(n)){
//                twoWays = entry1.getValue();
//            }

//         }
		// result = oneWays + twoWays;

//         int[] arrayN = new int[n+2];

//         arrayN[0] = 0;
//         arrayN[1] = 1;

//         for(int i =2 ; i<= arrayN.length-1; i++){
//             arrayN[i] = arrayN[i-1] + arrayN[i-2];
//            // System.out.println("i: "+ i + "array[i]: "+ arrayN[i]);
//         }

//          return arrayN[n+1];
	}
}