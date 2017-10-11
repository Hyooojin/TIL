package text_to_speech;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

@Component("service")
public class TextToSpeechServiceImpl extends TextToSpeech implements TextToSpeechService {

	public TextToSpeechServiceImpl() {
		setUsernameAndPassword("343203c9-364b-48a7-870b-e93cb40c8914", "SWVj85Oif5e1");
	}

	public List<Voice> getVoiceList() throws Exception {
		return getVoices().execute();
	}

}
