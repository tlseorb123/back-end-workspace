package com.kh.test7;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

public class Server {

	public static void main(String[] args) throws SQLException, IOException {
     ServerSocket server = new ServerSocket(3000);
	 try {
		Socket s = server.accept();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}
}

	


