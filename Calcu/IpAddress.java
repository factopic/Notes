package Calcu;

import java.net.*;
public class IpAddress 
{
	public static void main(String[] args)
	{
		try {
			System.out.println(InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}
}
