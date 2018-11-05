
import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;





public class Udp_packet_transmission {
	
	
	public static void main(String[] args)
	{
		
		
		
		try
		{
			
			int port =55553;
			String fileName = "C:/Users/S.T.Jeeva/Downloads/quartet.mp3";
			int delay  = 50;
			int packetSize = 1000;
					
		
		byte[] thePacket = new byte[packetSize];
		FileInputStream Mp3_in_bytes = new FileInputStream(new File(fileName));
		
		int read = 0; 
		System.out.print(read);
		
		 DatagramSocket the_socket = new DatagramSocket();
		 InetAddress theAddress = InetAddress.getByName("10.0.0.56");
		 System.out.println(theAddress.toString());
		 while(read!=-1)
		 {
			 read = Mp3_in_bytes.read(thePacket, 0, thePacket.length);
			 //for(int i = 0; i < thePacket.length; i++)
				// System.out.println(thePacket);
			 System.out.println(read);
		 DatagramPacket the_sender_packet = new DatagramPacket(thePacket, thePacket.length, theAddress, port);
		 System.out.println("running");
		
		 
		the_socket.send(the_sender_packet);
		 Thread.sleep(delay);
		 }
		
		 
		
		
		
		
		
		
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
