package org.story.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.story.entities.Story;

public interface StoryRepos extends MongoRepository<Story, Long>{

}
