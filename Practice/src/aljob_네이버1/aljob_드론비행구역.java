package aljob_네이버1;
import java.util.Scanner;
public class aljob_드론비행구역{

    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();  //건물의 수

        int height[] = new int[n]; //건물 높이 배열

        for(int i=0; i<n; i++){
            height[i] = scan.nextInt();   //각각의 건물 높이 입력
            //System.out.print(height[i] + " ");
        }


        int cnt=0;       //드론 비행 가능 구역 건물 수 초기화
        int maxIdx = 0;  //드론비행 가능 구역 중 큰 수의 인덱스 저장

        //최소 드론 비행 가능 구역 건물수 구하기 : 배열에서 앞의 수보다 작거나 같은수가 없을때까지 카운트를 세서 출력
        for(int i=0; i<n; i++){

            boolean flag = false;        //앞의 수보다 작거나 같은 수가 있는지 체크해주는 변수

            if(height[maxIdx] < height[i]){
                maxIdx = i;   //드론비행 가능 구역 중 큰 수의 인덱스 셋팅
            }

            for(int j=i+1; j<n; j++){     //j는 i+1부터 n-1까지 반복하면서

                if(height[maxIdx] >= height[j]){   //마지막 수는 비교 안하므로 에러날 일이 없음..
                    flag = true;        //앞의 수보다 작거나 같은 수가 있는지 확인
                    break;
                }
//                System.out.println( "i 인덱스 값은 " + i + " , j 값 은 " + height[j] + " 는 " + flag + " 그리고 " + cnt);
            }

            if(flag==true){   //앞의 수보다 작거나 같은 수가 있다면
                cnt++;    //드론 비행 가능 구역 건물 수 카운트
                //System.out.println(height[i] + "일떄 cnt는 " + cnt);
            }else{   //flag==false...  앞의 수보다 작거나 같은 수가 없다면
                cnt++;    //드론 비행 가능 구역 건물 수 카운트
                //System.out.println(height[i] + "일떄 cnt는 " + cnt);
                break;
            }
        }
        System.out.println(cnt);  //드론 비행 가능 구역 건물 수 출력
    }
}