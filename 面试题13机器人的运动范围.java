package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ������13�����˵��˶���Χ {
	public int movingCount(int m,int n,int k) {
		int[] dx = {-1, 0, 1, 0,};
		int[] dy = {0, 1, 0, -1};
		
		Queue<int[]> queue = new LinkedList<int[]>();
		//��ʼ��
		queue.offer(new int[]{0, 0});
		
		/**
		 * BFS
		 */
		//����Ҫ����һ��boolean���͵�����
		boolean[][] flag = new boolean[m][n];
		
		int ans = 0; 
		while(!queue.isEmpty()) {
			int[] ele = queue.poll();
			for(int i = 0;i < 4;i ++) {
				int x = ele[0] + dx[i];
				int y = ele[1] + dy[i];
				if(x < 0 || x >= m || y < 0 || y >= n) continue;
				
				int count = count(x) + count(y);
				if(count > k || flag[x][y]) continue;
				
				ans ++;
				flag[x][y] = true;
				
				//����queue����
				queue.offer(new int[]{x, y});
			}
		}
		
		return ans;
	}
	
	public int count(int num) {
		int res = 0;
		while(num > 0) {
			res += num % 10;
			num /= 10;
		}
//		System.out.println(num + "-res-:" + res);
		return res;
	}
	
	public static void main(String[] args) {
		������13�����˵��˶���Χ m = new ������13�����˵��˶���Χ();
		int out = m.movingCount(5, 4, 0);
		System.out.println(out);
	}

}








