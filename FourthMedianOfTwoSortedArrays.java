package com.leetcode;

/**
 * The overall run time complexity should be O(log (m+n)).
 * ʱ�临�ӶȾ����� �����Ʋ��ң�Ҳ��Ϊ���ֲ��ҡ��۰����
 * @author zhou
 *
 */
public class FourthMedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1,int[] nums2){
		if((nums1.length==0 && nums2.length==0) || (nums1==null && nums2==null))
			return Integer.MIN_VALUE;
		
		int totalLength = nums1.length + nums2.length;
		if((totalLength & 1) == 0){	
			/**
			 * totalLength��ż��
			 * findKth : �����ù������ҵ� �ϲ���������� = (totalLength / 2) ��  = (totalLength /2 +1) ��ֵ
			 */
			return ((double)findKth(nums1, 0, nums2, 0, totalLength / 2) + (double)findKth(nums1, 0, nums2, 0,totalLength /2 +1)) / 2;
		}else{
			/**
			 * totalLength������
			 * findKth : �����ù������ҵ� �ϲ���������� = (totalLength / 2) ��ֵ 
			 * ��������
			 */
			
			return findKth(nums1, 0, nums2, 0, (totalLength + 1) / 2);
		}
		
	}

	//k�������±���������������
	private double findKth(int[] nums1, int i, int[] nums2, int j, int k) {
		if(i >= nums1.length){
			return nums2[j + k - 1]; 
		}
		if(j >= nums2.length){
			return nums1[i + k -1];
		}
			
		
		/**
		 * 
		 * ���ǵݹ���ֹ����
		 */
		if(k == 1){
			return Math.min(nums1[i], nums2[j]);
		}
		/**
		 * ÿ���ƶ�k/2
		 * 
		 * Ϊʲô  i + k / 2 - 1  ������
		 */
		int mid1 = i + k / 2 - 1 < nums1.length ? nums1[i + k / 2 - 1] : Integer.MAX_VALUE;
		int mid2 = (j + k / 2 - 1) < nums2.length ? nums2[j + k / 2 - 1] : Integer.MAX_VALUE;
		
		if(mid1 <= mid2){
			return findKth(nums1, i + k / 2, nums2, j, k - k / 2);
		}
		return findKth(nums1, i, nums2, j + k / 2, k - k / 2);
		
	}
	
	public static void main(String[] args) {
		FourthMedianOfTwoSortedArrays f = new FourthMedianOfTwoSortedArrays();
		int[] nums1 = new int[]{1, 3};
		int[] nums2 = new int[]{2};
		double res = f.findMedianSortedArrays(nums1, nums2);
		System.out.println(res);
	}

}
