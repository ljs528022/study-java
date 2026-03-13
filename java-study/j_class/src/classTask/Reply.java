package classTask;

public class Reply {
	static long seq;
	long id;
	String cotent;
	
	static {
		seq = 0;
	}
	
	{
		id = ++seq;
	}

	public Reply() {;}

	public Reply(String cotent) {
		this.cotent = cotent;
	}
}