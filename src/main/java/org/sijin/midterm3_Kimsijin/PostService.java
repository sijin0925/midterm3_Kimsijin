package org.sijin.midterm3_Kimsijin;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
	

	@Autowired
	PostDao postDao;
	
	static final Logger logger = LogManager.getLogger();
	
	
	public void addPost() {
		Post post = new Post();
		post.setUserId("4");
		post.setName("김시진");
		post.setContext("김시진입니다");
		
		postDao.addPost(post);
		logger.debug("글이등록되었습니다.");
	}
	public void listPost() {
		List<Post> postList = postDao.listPost(0, 50);
		logger.debug(postList);		
	}
	
	public void likePost() {
		final String postId = "135";
				
		postDao.likePost(postId);
		Post post = postDao.getPost(postId);
		logger.debug(post);

	}	
}
