package org.story.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.story.api.StoryServiceInterfaceImplementation;
import org.story.entities.Story;


@RestController
@RequestMapping("/v1/")
public class StoryController {
	
	@Autowired
	private StoryServiceInterfaceImplementation storyService;
	
	@GetMapping("/stories")
	public ResponseEntity<?> getStories(){
		
		List<Story> stories = this.storyService.search();
		
		return new ResponseEntity<>(stories, HttpStatus.OK);
	}

	public ResponseEntity<?> createStory(@RequestBody @Validated Story story)
	{
		this.storyService.addStory(story);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
