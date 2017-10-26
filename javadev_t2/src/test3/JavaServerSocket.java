package test3;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaServerSocket {
	static final int SERVER_PORT = 8667;
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
			System.out.println("서버 소켓이 생성됨 : " + SERVER_PORT);
			while(true) {
				Socket socket = serverSocket.accept();
				
				System.out.println("연결됨...");
				InputStream ois = socket.getInputStream();
				byte[] readBytes = new byte[1024];
				int readByteCount = -1;
				
				readByteCount = ois.read(readBytes);
				String fileName = new String(readBytes, 0, readByteCount, "UTF-8");
				fileName = fileName.trim();
				
				System.out.println(fileName + " 파일을 전송받고있습니다....");
				String filePath = "C:/dev/upload/" + fileName;
				FileOutputStream fos = new FileOutputStream(filePath);
				
				while((readByteCount = ois.read(readBytes)) != -1){
					fos.write(readBytes, 0, readByteCount);
				}
				System.out.println("완료~!");
				fos.close();
				ois.close();
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
