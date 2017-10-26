package test2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class JavaClientSocket {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("70.12.50.50", 8667);
			System.out.println("클라이언트 소켓 생성");
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			oos.writeObject("안녕하세요. 저는 클라이언트입니다.");
			oos.flush();
			Object in = ois.readObject();
			System.out.println("받은 메시지 : " + in);
			System.out.println("클라이언트를 종료합니다.");
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
