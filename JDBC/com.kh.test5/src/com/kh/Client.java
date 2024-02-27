package com.kh;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
			String ip;
			try {
				ip = InetAddress.getLocalHost().getHostAddress();
				Socket s = new Socket(ip, 3000);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	

	}


}
