package com.yedam.ref.app;

public class TodoExe {
	
	public static void main(String[] args) {
		int[][] numAry = new int[3][5];
		// 임의의 숫자 생성.
		for (int row= 0; row < numAry.length; row++) {
			for (int col = 0; col < numAry[row].length; col++) {
				numAry[row][col] = (int) (Math.random() * 101);
			}
			
		}
		for(int i = 0; i<numAry.length; i++) {
			int sum = 0;
			for(int j=0; j< numAry[i].length; j++) {
				sum+=numAry[i][j];
			}
			double avg = (double) sum / numAry[i].length;
			System.out.println(sum);
			System.out.printf("numAry[%d]의 평균은 %.2f\n", i, avg);
		}

	}
}
