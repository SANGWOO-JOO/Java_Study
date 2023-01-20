package aljob_몰입캠프5;

import java.util.Scanner;


public class Main{
    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();   //게임 수

        final int MAX = 100005;
        char chArray[] = new char[MAX];

        scan.nextLine();
        int jinScnt=0;   //지니의 가위 횟수 카운트
        int jinRcnt=0;   //지니의 바위 횟수 카운트
        int jinPcnt=0;   //지니의 보 횟수 카운트

        for(int i=0; i<n; i++){
            //지니의 가위바위보 정보
            chArray[i] = scan.next().charAt(0);

            if(chArray[i]=='S'){   //지니가 가위를 내었다면
                jinScnt++;
            }else if(chArray[i]=='R'){   //지니가 바위를 내었다면
                jinRcnt++;
            }else{  //지니가 보를 내었다면
                jinPcnt++;
            }
        }

        //유니가 가위('S')를 넀을때
        int Scnt=0;
        for(int i=0; i<n; i++){

            if(chArray[i]=='S') {         //지니가 가위를 냈다면
                continue;
            }
            if(chArray[i]=='R') {         //지니가 바위를 냈다면
                continue;
            }
            if(chArray[i]=='P') {         //지니가 보를 냈다면
                Scnt++;                   //유니 가위 승리에 대한 카운트
            }
        }
        if(jinRcnt>0 || jinScnt>0){         //유니는 바위('R)나 보('P')로 한번 이길수 있다.
            Scnt++;
        }

        //System.out.println("가위로 이겼을때 승리 횟수 : " + Scnt);  //유니 가위 승리에 대한 카운트 출력

        //유니가 바위('R')를 넀을때
        int Rcnt=0;
        for(int i=0; i<n; i++){

            if(chArray[i]=='S') {         //지니가 가위를 냈다면
                Rcnt++;                   //유니 바위 승리에 대한 카운트
            }
            if(chArray[i]=='R') {         //지니가 바위를 냈다면
                continue;
            }
            if(chArray[i]=='P') {         //지니가 보를 냈다면
                continue;
            }
        }
        if(jinPcnt>0 || jinRcnt>0){         //유니는 가위('S)나 보('P')로 한번 이길수 있다.
            Rcnt++;
        }

        //System.out.println("바위로 이겼을때 승리 횟수 : " + Rcnt);  //유니 바위 승리에 대한 카운트 출력

        //유니가 보('P')를 넀을때
        int Pcnt=0;
        for(int i=0; i<n; i++){

            if(chArray[i]=='S') {         //지니가 가위를 냈다면
                continue;
            }
            if(chArray[i]=='R') {         //지니가 바위를 냈다면
                Pcnt++;                   //유니 보 승리에 대한 카운트
            }
            if(chArray[i]=='P') {         //지니가 보를 냈다면
                continue;
            }
        }
        if(jinPcnt>0 || jinScnt>0){         //유니는 가위('S')나 바위('R')로 한번 이길수 있다.
            Pcnt++;
        }

        //System.out.println("보로 이겼을때 승리 횟수 : " + Pcnt);  //유니 보 승리에 대한 카운트 출력

        System.out.println(Math.max(Scnt, Math.max(Rcnt, Pcnt) ));

    }
}