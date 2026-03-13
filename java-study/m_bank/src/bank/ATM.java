package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
//	화면
	public static void main(String[] args) {
		
		// 신한, 국민, 카카오의 각 은행의 고객을 담는 배열 각각 100명 까지
		Bank[][] arrBank = new Bank[3][100];
		// arCount는 arrBank의 크기(3) 만큼 선언됨.
		// 해당 은행에 저장된 계좌 개수를 담은 값들이 저장됨.
		int[] arCount = new int[arrBank.length];
		// arBankName은 "신한은행", "국민은행", "카카오뱅크" 라는 값을 입력. 3칸 크기의 배열
		String[] arBankName = { "신한은행", "국민은행", "카카오뱅크" };

		// 질문지 작성 및 Scanner 선언.
		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
		Scanner sc = new Scanner(System.in);

		// 은행 번호, 선택한 번호, 고객 은행 번호를 선언 및 0으로 초기화 
		int bankNumber = 0, choice = 0, myBankNumber = 0;
		// 계좌, 비밀번호, 휴대폰번호, 이름을 선언 및 null로 초기화
		String account = null, password = null, phone = null, name = null;
		// Bank라는 클래스(타입)를 user로 선언 및 null로 초기화.
		Bank user = null;
		// money, withdrawMoney, temp 를 선언 및 0으로 초기화
		int money = 0, withdrawMoney = 0, temp = 0;
		// 난수 선언.
		Random random = new Random();
		// 비밀번호, 휴대폰 번호 확인용 값 선언 및 0으로 초기화
		int passwordCheck = 0, phoneCheck = 0;

		// 결과 출력용 메세지 선언.
		String accountMessage = "계좌번호: ";
		String nameMessage = "예금주: ";
		String passwordMessage = "비밀번호(4자리): ";
		String phoneMessage = "핸드폰번호(- 제외): ";
		String depositMessage = "입금액: ";
		String withdrawMessage = "출금액: ";
		String errorMessage = "다시 시도해주세요.";
		String loginFailMessage = "계좌번호 혹은 비밀번호를 다시 확인해주세요.";
		
		
		// while 반복문. 은행 업무를 진행하는 동안 계속해서 구동된다.
		while(true) {
			
			// 질문지 출력 및 값을 콘솔로 입력받음
			System.out.println(message);
			bankNumber = sc.nextInt();
			
			// 입력값이 4이면 해당 while문 탈출
			// -> 은행 서비스 종료.
			if(bankNumber == 4) {
				break;
			}
			
			// bankNumber를 1 감소
			// 신한 -> 0
			// 국민 -> 1
			// 카카오 -> 2
			bankNumber--;
			
			// 또다른 while 문 -> 은행 선택 후, 은행 업무 선택 메뉴 출력.
			while(true) {
				// 은행 업무 메뉴 출력 및 콘솔로 입력받음
				System.out.println(menu);
				choice = sc.nextInt();
				
				// 입력값이 6이면 해당 while 문 탈출.
				if(choice == 6) {
					break;
				}
				
				// switch 문 입력받은 값에 따라 다른 문장 실행.
				switch(choice) {
				case 1: // 계좌 개설
					
					// Bank 타입의 arBank에 Shinhan, Kookmin, Kakao 라는 클래스를 생성자로 생성.
					Bank[] arBank = {new Shinhan(), new Kookmin(), new Kakao()};
					
					// while 문 -> 계좌번호 생성 로직.
					while(true) {
						// account 라는 값에 100000 ~ 999999 사이의 난수값을 Sting 값으로 저장 
						account = String.valueOf(random.nextInt(900000) + 100000);
						
						// 은행 선택 메뉴에서 입력 받은 값에 account 값을 '연결' 
						// ex) 신한(0) -> 0 + "999999" -> "0999999"
						account = bankNumber + account;
						
						// 만약 arrBank, arCount, account 값 중 하나라도 null 이면
						// 해당 while 문(계좌 생성 로직)을 탈출.
						if(Bank.checkAccount(arrBank, arCount, account) == null) {
							break;
						}
					}
					
					// 고객 이름 입력 받기
					System.out.println(nameMessage);
					name = sc.next();
					
					// while 문 -> 계좌 비밀번호 확인 로직
					while(true) {
						
						// 비밀번호 입력받고 passwordCheck(비밀번호 중복 확인용 값)을 0으로 입력.
						System.out.println(passwordMessage);
						password = sc.next();
						passwordCheck = 0;
						
						// if 문 -> 계좌비밀번호인 4자리의 숫자 확인 로직.
						if(password.length() == 4) {
							// 4자리의 숫자를 각 자리마다 검사
							for (int i = 0; i < password.length(); i++) {
								// 4자리의 숫자를 하나씩 c 에 저장
								char c = password.charAt(i);
								
								// c 에 저장된 숫자가 0 ~ 9 사이 값이면
								// passwordCheck 값을 1씩 증가
								if(c >= 48 && c <= 57) {
									passwordCheck++;
								}
							}
						}
						
						// passwordCheck이 4면 해당 while 문(계좌 비밀번호 확인 로직)을 탈출
						if(passwordCheck == 4) {
							break;
						}
					}
					
					// while 문 -> 전화번호 확인
					while(true) {
						
						// 전화번호 입력받고, phoneCheck(확인용)를 0으로 저장. 
						System.out.println(phoneMessage);
						phone = sc.next();
						phoneCheck = 0;
						
						// 전화번호에 "-"가 있다면 "-"를 모두 제거.
						// 010-1234-5678 => 01012345678 
						phone = phone.replaceAll("-", "");
						
						// 입력된 전화번호가 11자리면 if문 실행.
						if(phone.length() == 11) {
							// 11자리 모두 각각 검사를 진행
							for (int i = 0; i < phone.length(); i++) {
								
								// 한자리씩 c에 넣어서 0 ~ 9 사이 값이면
								// phoneCheck를 1씩 증가.
								char c = phone.charAt(i);
								if(c >= 48 && c <= 57) {
									phoneCheck++;
								}
							}
							
							// phoneCheck 값이 11이고,
							if(phoneCheck == 11) {
								// 데이터베이스에 해당 값이 없으면 while 문 탈출
								if(Bank.checkPhone(arrBank, arCount, phone) == null) {
									break;
								}
							}
						}
					}
					
					// 선택한 은행 배열에 user를 담음.
					user = arBank[bankNumber];
					
					// 입력받은 account, name, password, phone 값을 user에 저장
					user.setAccount(account);
					user.setName(name);
					user.setPassword(password);
					user.setPhone(phone);
					
					// 선택한 은행 계좌 맨뒤 배열에 user 값을 저장.
					// ex) 신한 -> 신한에 처음 계좌가 생성되었으면, arrBank[0][0];
					//			   			  10번째 생성이면, arrBank[0][9];
					arrBank[bankNumber][arCount[bankNumber]++] = user;
					
					// ex) 신한 계좌 생성 -> 신한은행 가입을 진심으로 환영합니다.
					System.out.println(arBankName[bankNumber] + " 가입을 진심으로 환영합니다.");
					
					// 저장한 account 값 출력하기.
					System.out.println("고객님의 소중한 계좌번호: " + account);
					
					// case 1 부분 종료.
					// switch문 탈출
					break;
					
				case 2: // 입금 하기
					
					// 계좌 번호 입력받기
					System.out.println(accountMessage);
					account = sc.next();
					
					// 계좌 비밀번호 입력받기
					System.out.println(passwordMessage);
					password = sc.next();
					
					// 로그인 -> 조회 후 있으면 user에 저장, 없으면 null.
					user = Bank.login(arrBank, arCount, account, password);
					
					// user 값이 있으면 if문 실행
					if(user != null) {
						// myBankNumber = 유저의 계좌번호 첫번째 자리 값 - 0; 
						myBankNumber = user.getAccount().charAt(0) - 48;
						
						// myBankNumber 가 선택한 은행과 맞다면 if 문 실행
						if(myBankNumber == bankNumber) {
							
							// 입금할 금액 입력받기
							System.out.println(depositMessage);
							money = sc.nextInt();
							
							if(money > 0) {
								// 입력받은 금액이 0보다 크면 입금하고, 잔액 출력.
								user.deposit(money);
								System.out.println("현재 잔액: " + user.getMoney() + "원");
							}else {
								// 금액이 0이면 에러메세지 출력
								System.out.println(errorMessage);
							}
						}else {
							// 로그인한 유저의 은행이 같지 않으면 아래 구문 출력
							System.out.println(arBankName[myBankNumber] + " 은행에서만 입금 서비스를 이용하실 수 있습니다.");
						}
						
//						현 로직에서 instanceof를 통해 고객의 은행사를 구분하는 것은 무리가 있다.
//						그래서 계좌번호 맨 앞 숫자로 검사하는 것이 낫다.
//						if(bankNumber == 0) {
//							if(user instanceof Shinhan) {
//								System.out.println(depositMessage);
//								money = sc.nextInt();
//								
//								user.deposit(money);
//							}
//						}else if(bankNumber == 1) {
//							if(user instanceof Kookmin) {
//								System.out.println(depositMessage);
//								money = sc.nextInt();
//								
//								user.deposit(money);
//							}
//						}else if(bankNumber == 2) {
//							if(user instanceof Kakao) {
//								System.out.println(depositMessage);
//								money = sc.nextInt();
//								
//								user.deposit(money);
//							}
//						}
					} else {
						// 조회한 user 값이 없으면 로그인 실패 메세지 출력.
						System.out.println(loginFailMessage);
					}
					
					// case 2 부분 종료.
					// switch문 탈출
					break;
				case 3: // 출금 하기
					
					// 계좌 번호 입력받기
					System.out.println(accountMessage);
					account = sc.next();
					
					// 계좌 비밀번호 입력받기
					System.out.println(passwordMessage);
					password = sc.next();
					
					// 로그인 -> 조회 후 있으면 user에 저장, 없으면 null.
					user = Bank.login(arrBank, arCount, account, password);
					
					// user가 있으면 if 문 실행.
					if(user != null) {
						
						// 출금할 금액 입력받기
						System.out.println(withdrawMessage);
						withdrawMoney = sc.nextInt();
						
						// user의 타입을 검사하고
						// Kookmin이면 temp에 출금값에 수수료 50% 적용
						// Kookmin이 아니면 수수료 적용 안함. -> 은행사 구분이 어려운 관계로 여기서 수수료 적용.
						// 결과값은 정수로 저장.
						temp = user instanceof Kookmin ? (int) (withdrawMoney * 1.5) : withdrawMoney;
						
						// 출금하는 값이 0 보다 크면 if문 실행.
						if(withdrawMoney > 0) {
							// 수수료 적용 후, 출금값이 회원의 잔액보다 작으면 출금하고 잔액 출력
							if(temp <= user.getMoney()) {
								user.withdraw(withdrawMoney);
								System.out.println("현재 잔액: " + user.getMoney() + "원");
							}else {
								// 잔액보다 크면 에러메세지 출력
								System.out.println(errorMessage);
							}
							
						}else {
							// 출금액이 0 보다 크면 에러메세지 출력
							System.out.println(errorMessage);
						}
					} else {
						// user가 null이면 로그인 실패 메세지 출력
						System.out.println(loginFailMessage);
					}
					
					// case 3 부분 종료.
					// switch문 탈출
					break;
					
				case 4: // 잔액 조회
					
					// 계좌 번호 입력받기
					System.out.println(accountMessage);
					account = sc.next();
					
					
					// 계좌 비밀번호 입력받기
					System.out.println(passwordMessage);
					password = sc.next();
					
					// 로그인 -> 조회 후 있으면 user에 저장, 없으면 null.
					user = Bank.login(arrBank, arCount, account, password);
					
					// user가 있으면 잔액 출력하기.
					if(user != null) {
						System.out.println("현재 잔액: " + user.showBalance() + "원");
					}
					
					// case 4 부분 종료.
					// switch문 탈출
					break;
					
				case 5: // 계좌번호 찾기
						// 전화번호로 찾았는데 데이터베이스에 계좌가 있으면 해당 계좌에 새로운 계좌번호를 생성해서 저장.
					
					// 전화번호 입력받기
					System.out.println(phoneMessage);
					phone = sc.next();
					
					// 계좌 비밀번호 입력받기
					System.out.println(passwordMessage);
					password = sc.next();
					
					// phone 값으로 데이터베이스 조회
					// 있으면 user에 저장, 없으면 null.
					user = Bank.checkPhone(arrBank, arCount, phone);
					
					// user가 있으면 if문 실행.
					if(user != null) {
						
						while(true) {
							
							// account에 100000 ~ 999999 사이의 난수값을 저장.
							account = String.valueOf(random.nextInt(900000) + 100000);
							// account 값 앞에 은행번호 연결
							// ex) 신한 -> 0 + "99999" => 0999999
							account = bankNumber + account;
							
							// account 값이 선택한 은행 데이터베이스에 없는지 조회
							if(Bank.checkAccount(arrBank, arCount, account) == null) {
								// 없으면 while 문 탈출.
								break;
							}
						}
						
						// 새로운 계좌번호를 user의 계좌번호에 저장. 
						user.setAccount(account);
						
						// 고객의 (새로운 것으로 교체된)계좌번호를 출력
						System.out.println("고객님의 소중한 계좌번호: " + account);
					}else {
						// user가 null 이면 에러메세지 출력.
						System.out.println(errorMessage);
						
					}
					
					// case 5 부분 종료.
					// switch문 탈출
					break;
					
					default:
						// 입력된 값이 1 ~ 5 의 값이 아니면
						// 에러메세지 출력하고 switch문 탈출
						System.out.println(errorMessage);
						
						// default 부분 종료.
						// switch문 탈출
						break;
				}
				
			}
		}
		
		// Scanner 종료
		sc.close();
	}
}















