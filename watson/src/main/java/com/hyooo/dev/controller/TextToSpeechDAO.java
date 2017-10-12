package com.hyooo.dev.controller;

import java.util.List;

public interface TextToSpeechDAO {

	void insertTextToSpeech(TextToSpeechVO vo) throws Exception;

	List<TextToSpeechVO> getTextToSpeechList() throws Exception;

	void deleteTextToSpeech(int no) throws Exception;

}
