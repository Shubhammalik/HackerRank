package com.hr.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LittleShino {
	 public static void main(String args[] ) throws Exception {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String line = br.readLine();
				int n = Integer.parseInt(line);
				Scanner sc = new Scanner(System.in);
				Queue<Integer> que = new LinkedList<>();
				int count = 0;
				int[] arr = new int[n];
				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
				}
				for (int i = 0; i < n; i++) {
					if (que.isEmpty()) {
						que.add(arr[i]);
					} else {
						if (arr[i] != que.peek()) {
							que.add(arr[i]);
							if (que.size() == 2) {
								count++;
								que.poll();
							}
						}
					}
				}
				System.out.println(count);
		    }
}
