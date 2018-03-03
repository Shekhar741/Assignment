package pages;

import java.net.HttpURLConnection;
import java.net.URL;

public class VerifyPage {
	public  String link="https://www.google.co.in";
	public  String link2="https://.com";
	public  String link3="https://www.amazon.com/";
	public  String link4="https://www.ebay.com";
	
	public static void verifyLinkActive(String linkUrl) {
		try {
			URL url=new URL(linkUrl);
			HttpURLConnection httpURLConnect=(HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if(httpURLConnect.getResponseCode()==200){
				System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage());
				
			}
			else if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
				System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND);
				
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	

}
