package com.mfs.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "message")
public class MessageForwarderController {
	
	@RequestMapping(value = "ping")
	public ModelAndView ping() {
		ModelAndView modelAndView = new ModelAndView("ping");
		return modelAndView;
	}

	@RequestMapping(value = "checkout")
	public ModelAndView processMerchantRequest() {
		String url = "redirect";
		ModelAndView modelAndView = new ModelAndView("mypage");
		modelAndView.addObject("myurl", url);
		return modelAndView;
	}
	

	@RequestMapping(value = "redirect", method = RequestMethod.POST)
	public ModelAndView processFrontEndRequest(@RequestBody String redirectedMessage) {
		String redirectUrl = "forward";
		String nameValue = "test message";
		// System.out.println(redirectedMessage);
		ModelAndView modelAndView = new ModelAndView("redirectpage");
		modelAndView.addObject("redirectedMessage", redirectedMessage);
		modelAndView.addObject("nameValue", nameValue);
		modelAndView.addObject("redirectUrl", redirectUrl);
		return modelAndView;
	}

	@RequestMapping(value = "forward", method = RequestMethod.POST)
	public ModelAndView processBackEndRequest(@RequestBody String message) {
		ModelAndView modelAndView = new ModelAndView("redirectfoward");
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}