package com.kh;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		
			ServerSocket server = null;
			try {
				server = new ServerSocket(3000);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			try {
				Socket s = server.accept();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

	}

}
