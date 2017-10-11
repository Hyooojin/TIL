package com.hyooo.dev.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.watson.developer_cloud.http.ServiceCall;
import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

import article.controllers.AbstractController;
import article.controllers.ModelAndView;

public class Text2Speech  extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		TextToSpeech service = new TextToSpeech("825d78a1-93c0-43e5-bfe2-7970c1fdda64", "1Lp0xuP0Yv4i");
		//service.setUsernameAndPassword("825d78a1-93c0-43e5-bfe2-7970c1fdda64", "1Lp0xuP0Yv4i");
		ServiceCall call = service.getVoices();
		List<Voice> voices = (List<Voice>) call.execute();
		
		return new ModelAndView("/WEB-INF/views/text2speech/text2speech.jsp", 
								"voices", 
								voices);
	}
	
	

}
