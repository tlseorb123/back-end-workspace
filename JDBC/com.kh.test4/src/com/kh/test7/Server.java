package com.kh.test7;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

public class Server {

	public static void main(String[] args) throws SQLException, IOException {
     ServerSocket server;
	 try {
		 server = new ServerSocket(3000);
		Socket s = server.accept();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}
}

	
// 포트 번호 저장안해서

