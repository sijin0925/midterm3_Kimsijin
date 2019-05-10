package org.sijin.midterm3_Kimsijin;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostMain {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("post.xml");
		PostService postService = context.getBean("postService", PostService.class);

		postService.addPost();
		postService.listPost();
		postService.likePost();
		context.close();
	}
}
