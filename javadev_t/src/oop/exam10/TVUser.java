package oop.exam10;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception {
		//LgTV에 AppleSpeaker 연결 
		//SonyTV에 OrangeSpeaker 연결
		Properties p = new Properties();
		p.load(new FileInputStream("product.properties"));
		Class clazz1 = Class.forName(p.getProperty("tv"));
		Class clazz2 = Class.forName(p.getProperty("speaker"));
		
		TV tv = (TV) clazz1.newInstance(); //new SonyTV();
		Speaker speaker = (Speaker) clazz2.newInstance();
		
		tv.setSpeaker(speaker);
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}
}
