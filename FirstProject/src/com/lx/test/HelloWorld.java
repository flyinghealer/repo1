package com.lx.test;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(testuipath());

	}
	
	public static int uniquePaths(int m,int n){
		int[][] f = new int[m][n];
		for (int i = 0; i <= m ; i++) {
			for (int j = 0; j <= n ; j++) {
				if(i==0||j==0) {
					f[i][j] = 1;
					continue;
				}
				f[i][j] = f[i-1][j] +f[i][j-1];
			}
		}
		return f[m][n];
	}
	
	public static int testuipath() {
		return 11222;	
	}
	public int testuipath2(int a,int b) {
		return a+b;	
	}
}
