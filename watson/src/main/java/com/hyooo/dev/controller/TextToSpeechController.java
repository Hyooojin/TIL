package com.hyooo.dev.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.watson.developer_cloud.http.ServiceCall;
import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

@Controller
public class TextToSpeechController {
	@RequestMapping("hello")
	public ModelAndView hello() {
		return new ModelAndView("hello", "msg", "HelloMVC");
		
	}

	@RequestMapping("display")
	public ModelAndView text2speech() {
		TextToSpeech service = new TextToSpeech(
				"343203c9-364b-48a7-870b-e93cb40c8914", "SWVj85Oif5e1");
		
		List<Voice> voices = service.getVoices().execute();
		return new ModelAndView("hello", "voices", voices);
	}
	
	
	// @PostMapping("text2speech")
	// @GetMapping("text2speech")
	// @RequestMapping(value="text2speech", method= {RequestMethod.GET, RequestMethod.POST}) // text2speech라는 요청이 들어오면 실행한다.
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		TextToSpeech service = new TextToSpeech("343203c9-364b-48a7-870b-e93cb40c8914", "SWVj85Oif5e1");
		//service.setUsernameAndPassword("825d78a1-93c0-43e5-bfe2-7970c1fdda64", "1Lp0xuP0Yv4i");
		ServiceCall call = service.getVoices();
		List<Voice> voices = (List<Voice>) call.execute();
		
		return new ModelAndView("text2speech", "voices", voices);
	}
	
	
}
