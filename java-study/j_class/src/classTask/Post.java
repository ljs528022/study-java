package classTask;

public class Post {
	static long seq;
	long id;
	String title;
	String content;
	
	int replyCount;
	Reply[] arReply;
	
	static {
		seq = 0;
	}
	
	{
		id = ++seq;
	}
	
	public Post() {;}

	public Post(String title, String content, Reply[] arReply) {
		this.title = title;
		this.content = content;
		
		this.replyCount = arReply.length;
	}
}
