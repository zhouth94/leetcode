package com.leetcode;

public class �ڶ�����Ѱ���ظ�ֵ {
	public int findDuplicate(int[] nums) {
		int n = nums.length - 1;

        //�ҳ�����ظ�����������1-n ֮��

        //�������n��
        int l = 1, r = n;
        while(l < r) {
            int mid = l + r >> 1;

            int cnt = 0;
            for(int i : nums) {
            	System.out.println(i);
            }
        }
        return 0;
	}
	
	public static void main(String[] args) {
		�ڶ�����Ѱ���ظ�ֵ d = new �ڶ�����Ѱ���ظ�ֵ();
		d.findDuplicate(new int[]{1,3,4,2,2});
	}
}
