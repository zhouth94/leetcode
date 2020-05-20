package com.hwua;

/**
 * ���ţ�arr[0]��Ϊ��׼�������еڶ���Ԫ���������ҵ���һ�����ڻ�׼����
 * ͬʱ���������һ��Ԫ����ǰѰ�ң����ҵ���һ��С�ڻ�׼����
 * ������������
 * @author zhou
 *
 */
public class quick_sort�������� {
	
	public static void quickSort(int[] arr,int left,int right) {
		
		//�ݹ���ֹ���� ��Ҫ
		if(left > right)
			return;
		
		int l = left;
		int r = right;
		
		//�����׼
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
		
		//�ݹ�
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
