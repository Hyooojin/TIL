package text_to_speech;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.AudioFormat;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;
import com.ibm.watson.developer_cloud.text_to_speech.v1.util.WaveUtils;

public class Text2SpeechTest1 {
	public static void main(String[] args) {
		TextToSpeech service = new TextToSpeech(
				"0a3f4d46-2ab1-4b73-ab79-9970543734ce", "MEOCGJkFDFTv");
//		service.setUsernameAndPassword(
//				"0a3f4d46-2ab1-4b73-ab79-9970543734ce", "MEOCGJkFDFTv");

//		List<Voice> voices = service.getVoices().execute();
//		System.out.println(voices);
//		System.out.println(voices.size());
		
//		Voice voice = service.getVoice("en-US_AllisonVoice").execute();
//		System.out.println(voice);
		try {
			  String text = "Hello world";
			  InputStream stream = service.synthesize(text, Voice.EN_ALLISON,
			    AudioFormat.WAV).execute();
			  InputStream in = WaveUtils.reWriteWaveHeader(stream);
			  OutputStream out = new FileOutputStream("hello_world.wav");
			  byte[] buffer = new byte[1024];
			  int length;
			  while ((length = in.read(buffer)) > 0) {
			    out.write(buffer, 0, length);
			  }
			  out.close();
			  in.close();
			  stream.close();
			}
			catch (Exception e) {
			  e.printStackTrace();
			}
	}
}
