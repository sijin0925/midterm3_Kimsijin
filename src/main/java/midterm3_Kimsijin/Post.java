package midterm3_Kimsijin;

public class Post {
	String postId;

	String userId;
	
	String name;
	
	String context;
	
	int sweet;
	
	String cdata;

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public int getSweet() {
		return sweet;
	}

	public void setSweet(int sweet) {
		this.sweet = sweet;
	}

	public String getCdata() {
		return cdata;
	}

	public void setCdata(String cdata) {
		this.cdata = cdata;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", userId=" + userId + ", name=" + name + ", context=" + context + ", sweet="
				+ sweet + ", cdata=" + cdata + "]";
	}
	
}