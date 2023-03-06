package Search.ExhaustiveSearch;

public class SequentialSearch {

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // 찾은 경우 해당 위치를 반환
            }
        }
        return -1; // 찾지 못한 경우 -1을 반환
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 8, 4};
        int target = 8;
        int index = search(arr, target);
        if (index != -1) {
            System.out.println("찾은 위치: " + index);
        } else {
            System.out.println("해당 값이 배열에 존재하지 않습니다.");
        }
    }
}