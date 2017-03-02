package wintervacation.net;

import java.net.*;
import java.io.*;

public class UdpChat 
{
	public static void main(String[] args) 
	{
		try
		{
			DatagramSocket sendSocket = new DatagramSocket();
			Send send = new Send(sendSocket);
			new Thread(send).start();

			DatagramSocket receiveSocket = new DatagramSocket(10001);
			(new Thread(new Receive(receiveSocket))).start();
		}
		catch (Exception e)
		{
			System.out.println("fail");
		}

	}
}
class Send implements Runnable
{
	private DatagramSocket ds;
	public Send(DatagramSocket ds)
	{
		this.ds = ds;
	}

	public void run()
	{
		try
		{
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

			String line = null;
			while((line = bf.readLine())!=null)
			{
				if(line.equals("886"))
					break;

				byte[] buf = line.getBytes();
				DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("127.0.0.1"),10001);

				ds.send(dp);
			}
		}
		catch (Exception e)
		{
			System.out.println("fail send");
		}

	}
}

class Receive implements Runnable
{
	private DatagramSocket ds;
	public Receive(DatagramSocket ds)
	{
		this.ds = ds;
	}

	public void run()
	{
		while(true)
		{
			try
			{
				byte[] buf = new byte[64];
				DatagramPacket dp = new DatagramPacket(buf,buf.length);

				ds.receive(dp);

				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				String data = new String(dp.getData(),0,dp.getLength());

				System.out.println(ip+"::"+port+"::"+data);
			}
			catch (Exception e)
			{
				System.out.println("fail receive");
			}
			
		}
	}
}