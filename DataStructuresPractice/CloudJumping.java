package com.hr.practice;

import java.util.Scanner;

public class CloudJumping {

	// 8 2 0 0 1 0 0 1 1 0
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		in.close();
		int e = 100;
		CloudJumping cj = new CloudJumping();
		e = cj.jump(c, e, n, k);
		System.out.println(e);

	}

	private int jump(int[] c, int e, int n, int k) {
		int point = -1;
		int i = 0;
		while ((point != 0) && (e > 0)) {
			e -= 1;
			i = (i + k) % n;
			point = i;
			if (c[point] == 1)
				e -= 2;
		}
		return e;
	}

}
