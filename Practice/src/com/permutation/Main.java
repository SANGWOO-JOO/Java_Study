package com.permutation;
import java.io.*;

public class Main{
    static int n;
    static int nums[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        for(int i=0; i < n; i++){
            nums[i] = i+1;
            sb.append(String.valueOf(i+1)).append(" ");
        }
        sb.append("\n");

        while(true){
            boolean result = getNext();
            if(!result) break;
            sb.append(print());
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
    }

    private static boolean getNext(){
        int i = n-1;

        // 내림차순이 시작되는 가장 큰 i값을 찾는다.
        while(i > 0 && nums[i-1] >= nums[i]) i--;

        if(i <= 0) return false;

        // i-1 이후의 모든 숫자 중 큰 것을 고르는데 그 중, j의 값이 가장 큰 경우로 선택
        int j = i-1;
        while(j < n-1 && nums[i-1] < nums[j+1]) j++;

        swap(i-1, j);

        // i번째부터 이후의 모든 숫자를 뒤집음
        // i~n-1 사이의 숫자를 상호 뒤집어야 하므로 j 값을 n-1로 초기화
        j = n-1;
        while(i < j){
            swap(i, j);
            i+=1; j-=1;
        }
        return true;
    }

    private static void swap(int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static StringBuilder print(){
        StringBuilder sb2 = new StringBuilder();
        for(int num : nums){
            sb2.append(num).append(" ");
        }
        sb2.append("\n");
        return sb2;
    }
}