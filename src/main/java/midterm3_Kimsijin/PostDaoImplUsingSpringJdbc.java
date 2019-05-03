package midterm3_Kimsijin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class PostDaoImplUsingSpringJdbc implements PostDao {

	static final String ADD_POST = "INSERT INTO post(userId,name,context) VALUES(?,?,?)";
	static final String LIST_POST = "SELECT postId, userId, name, context,sweet,cdate FROM post ORDER BY postId desc";
	static final String LIKE_POST = "update post set sweet = sweet+1 when postid=?";
	static final String GET_POST = "SELECT postId, userId, name, context, cdate FROM post WHERE articleId=?";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	RowMapper<Post> postRowMapper = new BeanPropertyRowMapper<>(Post.class);
	@Override
	public int addPost(Post post) {
		return jdbcTemplate.update(ADD_POST,post.getUserId(),post.getName(),post.getContext());
	}

	@Override
	public List<Post> listPost(int offset, int count) {
		return jdbcTemplate.query(LIST_POST, postRowMapper,offset,count);
	}

	@Override
	public int likePost(String postId) {
		return jdbcTemplate.update(LIKE_POST, postId);
	}

	@Override
	public Post getPost(String postId) {
		return jdbcTemplate.queryForObject(GET_POST,postRowMapper, postId);
	}
}
