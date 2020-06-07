package com.vismark.JenkinsBuildProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    
    /**
     * A test endpoint to ensure the application is running adequately.
     * @return A string message indicating whether communications are
     * configured correctly
     */
    @RequestMapping(method=RequestMethod.GET, value="/liveness")
	public String testingHeaders() {
		return "all good, brah.";
	}
}