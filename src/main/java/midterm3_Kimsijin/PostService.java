package midterm3_Kimsijin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
	
	static final Logger logger = LogManager.getLogger();
	
	@Autowired
	PostDao postDao;
	
	public void addPost() {
		Post post = new Post();
		post.setUserId("4");
		post.setName("김시진");
		post.setContext("김시진입니다");
		Logger.logger("글이등록되었습니다.");
	}
	public void listPost() {
		
	}
	
	public void likePost() {
		
	}
	
	public void getPost() {
		
	}
	
	
}
