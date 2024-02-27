package com.kh.test7;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.SQLException;

public class Client {

	public static void main(String[] args) throws SQLException {
    
		try {
			String ip = InetAddress.getLocalHost().getHostName();
			try {
				Socket s = new Socket(ip, 3000);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
 // ip랑 포트번호 저장 안해서