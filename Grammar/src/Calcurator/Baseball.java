package Calcurator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Baseball {
    /*
    기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

    같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
    e.g. 상대방(컴퓨터)의 수가 425일 때, 123을 제시한 경우 : 1스트라이크, 456을 제시한 경우 : 1볼 1스트라이크, 789를 제시한 경우 : 낫싱
    위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게 임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
    이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
    게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine(); // 문자열 입력
//        int[] split = split(str);
        int[] answer = Answer(); // 정답 출력

        System.out.println(str); // 문제 맞추기 출력

        int[] split = Split(str); // 문제를 int형 배열로 쪼개면?

    }

    public static int[] Answer(){

        Set<Integer> set = new HashSet<>(); //HashSet생성

        while (set.size() < 3){ // 3보다는 작게 반복문으로 만든다.
            set.add((int)(Math.random() * 8) + 1); // 랜덤 함수로 0~8 생성 후 +1을 하여 1~9 의 수를 생성한다.
        }
        /*
         Stream().mapToInt(Integer::intValue).toArray();를 통해 리스트를 모두 int 타입의 값으로 바꾸어 int[] 배열로 바꿀 수 있다.
         */
        int [] answer = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("정답지 "  + Arrays.toString(answer)); // 정답 출력
        return answer;
    }


    public static int [] Split(String str){
//        String [] toInt = new String[str.length()]; // int 배열로 변환
//        int[] intArr = Stream.of(toInt).mapToInt(Integer::parseInt).toArray();
        int[] intSplit = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray(); //자바 String 숫자를 자릿수별 int 배열로 분할
        System.out.println(Arrays.toString(intSplit));
        return intSplit;
    }

    public static int [] baseballCheck(int[] intSplit , int [] answer ){

        int [] check =new int [2];
        // 체크
        for(int i=0;i<3;i++){
            checkBallAndStrike(intSplit, answer, i);
        }

        return check;
    }

    private static void checkBallAndStrike(int[] intSplit, int[] answer, int i) {
        int strike=0; int ball=0;

        if (ckeckStrike(intSplit, answer, i)==true){
            strike ++;
        }
        if(checkBall(intSplit, answer, i)==true){
            ball ++;
        }

    }

    private static boolean checkBall(int[] intSplit, int[] answer, int i) {
        boolean ballTrue = false;
        for (int a = 0; a < 3; a++) {
            if (intSplit[i] == answer[a]) {
                ballTrue = intSplit[i] != answer[i];
            }
        }
        return ballTrue;
    }

    private static boolean ckeckStrike(int[] intSplit, int[] answer, int i) {
        boolean strikeTrue = intSplit[i] == answer[i];
        return strikeTrue;
    }

}

