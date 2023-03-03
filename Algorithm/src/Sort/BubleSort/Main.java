package Sort.BubleSort;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; // 정수형 배열
        bubbleSort(arr); // 입력된 배열을 받아서 버블 정렬 알고리즘 적용
        System.out.println(Arrays.toString(arr)); // 배열을 문자열로 변환해주는 메서드
    }
    public static void bubbleSort(int[] arr) { // 버블 정렬 알고리즘 사용, 배열을 정렬
        int n = arr.length; // 배열의 길이
        for (int i = 0; i < n-1; i++) {  // 정렬을 위한 루프
               for (int j = 0; j < n-i-1; j++) { // 비교를 위한 루프
                if (arr[j] > arr[j+1]) { // 원소 비교
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
