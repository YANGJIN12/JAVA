package namoo.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 도메인(www.naver.com)을 DNS와 통신을 통해 IP 주소로 변환해 주는 클래스 
 * @author 김기정
 *
 */
public class InetAddressExample {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println(ia.getHostAddress());
		
		InetAddress ia2= InetAddress.getByName("www.naver.com");
		System.out.println(ia2.getHostAddress());
		
//		InetAddress[] iaa = InetAddress.getAllByName("www.google.com");
//		InetAddress[] iaa = InetAddress.getAllByName("www.naver.com");
		InetAddress[] iaa = InetAddress.getAllByName("www.daum.net");
		for (InetAddress inetAddress : iaa) {
			System.out.println(inetAddress);
		}
		

	}

}









