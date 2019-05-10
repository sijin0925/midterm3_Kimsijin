package org.sijin.midterm3_Kimsijin;

import java.util.List;

public interface PostDao {
	
	
	int addPost(Post post);
	
	List<Post> listPost(int offset, int count);
	
	int likePost(String postId);
	
	Post getPost(String postId);
}
