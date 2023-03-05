package Recursive.Binary;

public class BinarySearchRecursive {
    public static int binarySearchRecursive(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1; // 찾지 못한 경우
        }
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return mid; // 찾은 경우
        } else if (arr[mid] > target) {
            return binarySearchRecursive(arr, start, mid - 1, target); // 중간값이 찾는 값보다 큰 경우 왼쪽 탐색
        } else {
            return binarySearchRecursive(arr, mid + 1, end, target); // 중간값이 찾는 값보다 작은 경우 오른쪽 탐색
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 3;
        int index = binarySearchRecursive(arr, 0, arr.length - 1, target);
        if (index == -1) {
            System.out.println("원소를 찾지 못했습니다.");
        } else {
            System.out.println("원소가 " + (index + 1) + "번째에 있습니다.");
        }
    }
}