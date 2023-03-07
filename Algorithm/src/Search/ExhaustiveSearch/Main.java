package Search.ExhaustiveSearch;

public class Main {
    public static void main(String[] args) {
        int[][] arr = { { 23, 46, 81, 20, 65, 57, 32, 75, 90 },
                { 77, 79, 35, 25, 68, 44, 55, 53, 72 },
                { 29, 51, 34, 76, 18, 39, 45, 56, 80 },
                { 71, 49, 64, 82, 84, 12, 61, 52, 30 },
                { 50, 27, 70, 19, 13, 87, 78, 90, 24 },
                { 11, 28, 38, 89, 73, 31, 43, 66, 58 },
                { 41, 16, 47, 74, 22, 85, 60, 67, 21 },
                { 15, 17, 83, 54, 62, 42, 48, 69, 36 },
                { 14, 33, 63, 59, 40, 37, 26, 88, 86 } };

        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;

        // 모든 원소를 순회하며 최댓값과 그 위치를 찾는다
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i + 1; // 배열 인덱스가 0부터 시작하므로 1을 더함
                    col = j + 1;
                }
            }
        }

        System.out.println("최댓값: " + max);
        System.out.println("위치: " + row + "행 " + col + "열");
    }
}