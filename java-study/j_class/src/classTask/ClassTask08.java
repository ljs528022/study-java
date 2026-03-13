package classTask;

//게시글과 댓글 정보를 받아서 추가한다.
//게시글에서는 댓글의 전체 개수를 계산할 수 있다.

//게시글(Post)
//번호
//제목
//내용

//댓글(Reply)
//번호
//내용
public class ClassTask08 {
	public static void main(String[] args) {
		// 화면
		Reply[] arReply = {
				new Reply("안녕하세요"),
				new Reply("재밌네요"),
				new Reply("고마워요"),
				new Reply("도움이 되네요"),
		};
		
		Post post = new Post("주먹밥 만들기", "밥을 뭉쳐", arReply);
		
		System.out.println("게시글 이름: " + post.title);
		System.out.println("게시글 내용: " + post.content);
		System.out.println("해당 게시글의 총 댓글 수: " + post.replyCount);
	}
}
