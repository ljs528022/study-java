package bank;

public class Bank {
	
	// private 선언 -> 해당 값들은 '메소드'로만 접근해서 수정 가능.
	private String name;
	private String account;
	private String phone;
	private String password;
	private int money;

	// 기본 생성자
	public Bank() {
		;
	}

	// 생성자 각 값들을 받아와서 초기화.
	public Bank(String name, String account, String phone, String password, int money) {
		super();
		this.name = name;
		this.account = account;
		this.phone = phone;
		this.password = password;
		this.money = money;
	}

	// ---------------------------- (getter, setter 부분)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	// ---------------------------- (getter, setter 부분)

//	계좌번호 중복검사 
//	final 선언 다른 클래스에서 상속받으면 재정의 불가.
//	static 선언 어디서든 Bank 클래스를 선언하면 호출 가능. 
	public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
		// Bank 타입의 bank 를 null 로 선언.
		Bank bank = null;

		// for 문 ->  arrBank의 길이(3) 만큼 반복 // 데이터베이스에서 접속한 계좌 찾기.
		for (int i = 0; i < arrBank.length; i++) {
			int j = 0;

			// 각 은행별로 account와 같은 값이 있는지 조회.
			// 반복은 arCount[i](각 은행의 고객수)만큼 반복.
			for (j = 0; j < arCount[i]; j++) {
				if (arrBank[i][j].getAccount().equals(account)) {
					
					// 찾으면 배열 안의 값을 bank에 넣고 for문 탈출
					bank = arrBank[i][j];
					break;
				}
			}

			// 위 for문에서 break로 나왔다면 여기서도 탈출.
			if (j != arCount[i]) {
				break;
			}
		}

		// bank 리턴.
		return bank;
	}

//	핸드폰 번호 중복검사	
//	final 선언 다른 클래스에서 상속받으면 재정의 불가.
//	static 선언 어디서든 Bank 클래스를 선언하면 호출 가능. 
	public final static Bank checkPhone(Bank[][] arrBank, int[] arCount, String phone) {
		Bank bank = null;

		// 모든 은행을 한번씩 전부 검사.
		for (int i = 0; i < arrBank.length; i++) {
			int j = 0;

			// 해당 은행안에 phone과 같은 값이 있는지 검사
			for (j = 0; j < arCount[i]; j++) {
				if (arrBank[i][j].getPhone().equals(phone)) {
					
					// 있으면 bank에 놓고 for문 탈출
					bank = arrBank[i][j];
					break;
				}
			}

			// 위 for문에서 break로 나왔다면 여기서도 탈출.
			if (j != arCount[i]) {
				break;
			}
		}

		// bank 리턴.
		return bank;
	}

//	로그인
//	final 선언 다른 클래스에서 상속받으면 재정의 불가.
//	static 선언 어디서든 Bank 클래스를 선언하면 호출 가능.
	public final static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		// 계좌 정보 조회해서 있으면 가져오고, 없으면 null 값
		Bank user = checkAccount(arrBank, arCount, account);
		
		// 가져온 user 값이 있으면 문장 실행.
		if(user != null) {
			
			// user의 password랑 받아온 password 값이 같으면 user을 리턴.
			if(user.password.equals(password)) {
				return user;
			}
		}
		
		// 유저가 없거나 패스워드가 다르면 null 리턴.
		return null;
	}

//	입금
	public void deposit(int money) {
		// 로그인 되어 있는 계좌에 돈 누적합산
		this.money += money;
	}

//	출금
	public void withdraw(int money) {
		// 로그인 되어 있는 계좌에 돈 누적감산
		this.money -= money;
	}

//	잔액 조회
	public int showBalance() {
		// 로그인 되어 있는 계좌의 금액 조회
		return money;
	}

}
