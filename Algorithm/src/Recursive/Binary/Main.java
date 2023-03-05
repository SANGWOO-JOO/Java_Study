package Recursive.Binary;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int x = 5;
        int result = binarySearch(arr, 0, arr.length - 1, x);

        if (result == -1) {
            System.out.println("원소가 배열에 없습니다.");
        } else {
            System.out.println("원소가 배열의 " + result + "번째에 있습니다.");
        }
    }


    public static int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearch(arr, l, mid-1, x);
            } else {
                return binarySearch(arr, mid+1, r, x);
            }
        }

        return -1;
    }
}