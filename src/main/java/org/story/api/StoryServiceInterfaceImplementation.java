package org.story.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.story.entities.Story;
import org.story.services.StoryServiceInterface;

@Service	
public class StoryServiceInterfaceImplementation implements StoryServiceInterface {

	@Override
	public void addStory(Story story) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Story> search() {
		// TODO Auto-generated method stub
		return new ArrayList<Story>();
	}

	@Override
	public void deleteStory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean publishStory() {
		// TODO Auto-generated method stub
		return false;
	}

}
