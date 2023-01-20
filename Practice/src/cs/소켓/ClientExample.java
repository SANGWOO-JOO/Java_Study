package cs.소켓;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {
    public static void main(String[] args) {
        try {
            // Socket 생성과 동시에 localhost의 50001 Port로 연결 요청
            Socket socket = new Socket("127.0.0.1",50001);

            System.out.println("[클라이언트] 연결 성공");

            socket.close();
        } catch (UnknownHostException e) {
//            e.printStackTrace();
        } catch (IOException e) {
//            e.printStackTrace();
        }
    }
}
