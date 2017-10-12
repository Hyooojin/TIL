package com.hyooo.dev.controller;

import java.io.InputStream;
import java.util.List;

import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

public interface TextToSpeechService {
	public List<Voice> getVoiceList() throws Exception;
	
	public InputStream getSpeech(String statement, String lang) throws Exception;

	public void insertTextToSpeech(TextToSpeechVO vo) throws Exception;

	public List<TextToSpeechVO> getTextToSpeechList() throws Exception;

	public void deleteTextToSpeech(int no) throws Exception;

}
