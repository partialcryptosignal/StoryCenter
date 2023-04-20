package org.story.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.story.entities.Story;

@Service
public interface StoryServiceInterface {
	void addStory(Story story);
	void updateStory();
	List<Story> search();
	void deleteStory();
	boolean publishStory();
}
