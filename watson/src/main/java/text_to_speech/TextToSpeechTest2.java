package text_to_speech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextToSpeechTest2 {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("text_to_speech/beaninit.xml");
		TextToSpeechService service = (TextToSpeechService)context.getBean("service");
		try {
			System.out.println(service.getVoiceList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
