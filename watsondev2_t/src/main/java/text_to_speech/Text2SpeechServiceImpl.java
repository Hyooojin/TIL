package text_to_speech;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

@Component("service")
public class Text2SpeechServiceImpl 
	extends TextToSpeech
	implements Text2SpeechService {

	public Text2SpeechServiceImpl() {
		setUsernameAndPassword(
			"0a3f4d46-2ab1-4b73-ab79-9970543734ce", "MEOCGJkFDFTv");
	}

	public List<Voice> getVoiceList() throws Exception {
		return getVoices().execute();
	}
}
