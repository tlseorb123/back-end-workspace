package com.kh.test7;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.SQLException;

public class Client {

	public static void main(String[] args) throws SQLException {
    
		try {
			String ip = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		Socket s = new Socket();
	}

}
