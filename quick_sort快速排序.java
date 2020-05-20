package com.hwua;

/**
 * 快排：arr[0]作为基准，数组中第二个元素往后，若找到第一个大于基准得数
 * 同时数组中最后一个元素往前寻找，若找到第一个小于基准得数
 * 则两个数交换
 * @author zhou
 *
 */
public class quick_sort快速排序 {
	
	public static void quickSort(int[] arr,int left,int right) {
		
		//递归终止条件 重要
		if(left > right)
			return;
		
		int l = left;
		int r = right;
		
		//定义基准
		int base = arr[l];
		
		while(l < r) {
			while(arr[r] >= base && l < r) {
				r --;
			}
			while(arr[l] <= base && l < r) {
				l ++;
			}
			
			if(l < r) {
				int tmp = arr[r];
				arr[r] = arr[l];
				arr[l] = tmp;
			}
		}
		arr[left] = arr[l];
		arr[l] = base;
		
		//递归
		quickSort(arr, left, l-1);
		quickSort(arr, l+1, right);
		
	}
	
	public static boolean binarySearch(int[] arr,int start,int end,int key) {
		while(start <= end) {
			int mid = start + (end - start) / 2;
//			int mid = (end + start) / 2;
			if(arr[mid] == key) {
				System.out.println("find it,it's located in index of : " + mid);
				return true;
			}else if(arr[mid] > key) {
				return binarySearch(arr, start, mid-1, key); //mid
			}else {
				return binarySearch(arr, mid+1, end, key);
			}
		}
		System.out.println("did not find it");
		return false;
	}
	
	public static void printArr(int[] arr) {
		quickSort(arr, 0, arr.length-1);
		for(int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{6, 5, 9, 8, 7, 1};
		printArr(arr);
		
		boolean res = binarySearch(arr, 0, 5, 7);
		System.out.println(res);
	}
	
}
