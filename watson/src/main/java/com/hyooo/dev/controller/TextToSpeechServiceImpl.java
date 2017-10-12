package com.hyooo.dev.controller;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.AudioFormat;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

@Component("service")
public class TextToSpeechServiceImpl 
	extends TextToSpeech 
	implements TextToSpeechService {
	@Autowired
	private TextToSpeechDAO texttoSpeechDAO;

	public TextToSpeechServiceImpl() {
		setUsernameAndPassword("343203c9-364b-48a7-870b-e93cb40c8914", "SWVj85Oif5e1");
	}

	public List<Voice> getVoiceList() throws Exception {
		return getVoices().execute();
	}
	
	@Override
	public InputStream getSpeech(String statement, String voice) throws Exception {
		return synthesize(statement, new Voice(voice,null,null), AudioFormat.OGG).execute();
	}

	@Override
	public void insertTextToSpeech(TextToSpeechVO vo) throws Exception {
		texttoSpeechDAO.insertTextToSpeech(vo);
	}

	@Override
	public List<TextToSpeechVO> getTextToSpeechList() throws Exception {
		
		return texttoSpeechDAO.getTextToSpeechList();
	}

	@Override
	public void deleteTextToSpeech(int no) throws Exception {
		
		texttoSpeechDAO.deleteTextToSpeech(no);
		
	}
}
