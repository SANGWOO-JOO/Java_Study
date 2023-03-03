package Sort.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr); // 입력된 배열을 받아서 선택 정렬 알고리즘 적용
        System.out.println("선택 정렬: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i; // i 번째 인덱스를 최소값으로 가정
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // 나머지 인덱스와 비교하면서 최소값을 찾음
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

}
