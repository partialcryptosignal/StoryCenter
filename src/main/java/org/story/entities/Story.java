package org.story.entities;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Story {

	@Id
	private Long Id;
	
	private String title;
	

	private String body;
	

	private String creationDate;


	private String lastEditedDate;


	private String publishDate;
	

	private Long visitedCount;
}
