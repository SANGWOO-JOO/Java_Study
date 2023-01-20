package cs.소켓;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;
import java.util.Scanner;

public class ServerExample {
    private static ServerSocket serverSocket =null;

    public static void main(String[] args) {

        System.out.println(" ----------------- " );
        System.out.println("서버를 종료하려면 q 그리고 enter키를 누르세요");
        System.out.println(" ----------------- " );

        // TCP 서버 시작
        startServer();

        //키보드 입력
        Scanner scanner = new Scanner(System.in);
        while (true){
            String key= scanner.nextLine();
            if(key.toLowerCase(Locale.ROOT).equals("q")){
                break;
            }
        }
        scanner.close();

        /// TCP 서버 종료
        stopServer();


        }

    public static void startServer(){
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    //ServerSocket 생성 및 Port 바인딩
                    serverSocket = new ServerSocket(50001);
                    System.out.println(" [서버] 시작됨");

                    while (true) {
                        System.out.println(" \n [서버] 연결 요청을 기다림");
                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라이언트 정보 얻기
                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버]" + isa.getHostName() + "의 연결 요청을 수락함");

                        // 연결 끊기
                        socket.close();
                        System.out.println("[서버]" + isa.getHostName() + "이 연결을 끊음");

                    }
                } catch (IOException e) {
                    System.out.println("[서버]" + e.getMessage());
                }
            }
        };
        thread.start();
    }

    public static void stopServer(){
        try {
            serverSocket.close();
            System.out.println("서버 종료됨");
        }catch (IOException e){

        }

    }
}
