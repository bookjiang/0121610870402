package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class requestlistener implements ServletRequestListener {

	private static int onlineCount=0;
	private static int offlineCount=0;
	public void requestInitialized(ServletRequestEvent sre)
	{
		System.out.println("�����ɹ�");
		
		onlineCount++;
		System.out.println(onlineCount);
	}
	public void requestDestroyed(ServletRequestEvent sre)
	{
		System.out.println("���ٳɹ�");
		offlineCount++;
		System.out.println(offlineCount);
	}
	public static int getonlineCount()
	{
		return onlineCount;
	}
	public static int getofflineCount()
	{
		return offlineCount;
	}
}
