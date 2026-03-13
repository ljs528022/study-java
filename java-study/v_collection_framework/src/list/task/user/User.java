package list.task.user;

import java.util.Objects;

public class User {
	// 유저 정보 이메일, 비밀번호, 이름, 전화번호
	private String email;
	private String password;
	private String name;
	private String phone;
	
	// 기본 생성자
	public User() {;}
	
	public User(User user) {
		this(user.email, user.password, user.name, user.phone);
	}

	// 생성자
	public User(String email, String password, String name, String phone) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}

//	-------------------------- (getter, setter)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
//	-------------------------- (getter, setter)

	
//	toString 재정의
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", name=" + name + ", phone=" + phone + "]";
	}

//	equals 재정의
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email);
	}
	
}












