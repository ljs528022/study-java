package stream.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class StreamTest {
   public static void main(String[] args) {
//      배열을 ArrayList로 변경하는 방법
//      Integer[] arData = {10, 20, 30, 40, 50};
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//      System.out.println(datas);
      
//      ArrayList를 배열로 변경하는 방법
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//      Object[] arData = datas.toArray();
//      
//      for(Object data : arData) {
//         System.out.println(data);
//      }
      
//      IntStream: 정수를 다루는 Stream API
//      forEach(): 반복
//      여러 값을 가지고 있는 컬렉션 객체 또는 Stream API에서 forEach 메소드를 사용할 수 있다.
//      forEach() 메소드에는 Consumer 인터페이스 타입에 값(구현체)을 전달해야 한다.
//      Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 있다.
//      컬렉션 객체 또는 Stream 객체 안에 있는 값들이 매개변수에 순서대로 담기고,
//      화살표 뒤에서는 실행하고 싶은 문장을 작성한다.
//      IntStream.range(0, 10).forEach((data) -> {System.out.println(data);});
      
//      10 ~ 100까지 출력
//      	IntStream.range(10, 101).forEach((n) -> {System.out.println(n);});
//      	IntStream.rangeClosed(10, 100).forEach((n) -> {System.out.println(n);});
      	
//      	ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Black", "Red", "Green"));
//      	colors.forEach((c) -> {System.out.println(c);});
      	
//      참조형
//      1 ~ 10 까지 출력
//      	ArrayList<Integer> datas = new ArrayList<Integer>();
//      	Consumer<Integer> addConsumer = datas::add;
//      	
//      	IntStream.range(1, 11).forEach(addConsumer::accept);
//      	datas.forEach(System.out::println);
      	
//      map() : 변경
//      1 ~ 10 까기 ArrayList에 담고 각 값에 2를 곱하여 출력한다.
//      	ArrayList<Integer> datas = new ArrayList<Integer>();
      	
//      	IntStream.range(1, 11).forEach(datas::add);
//      	datas.stream().map((data) -> data * 2).forEach(System.out::println);
	   
//	   filter() : 조건
//	   10 ~ 1 까지 ArrayList에 담은 후 짝수만 출력한다.
//	   ArrayList<Integer> datas = new ArrayList<Integer>();
//	   IntStream.range(0, 10).map((data) -> 10 - data).forEach(datas::add);
//	   datas.stream().filter((data) -> data % 2 == 0).forEach(System.out::println);
	   
//	   reduce() : 누적 계산
//	   ArrayList<Integer> datas = new ArrayList<Integer>();
//	   IntStream.range(0, 10).map((data) -> 10 - data).forEach(datas::add);
	   
//	   int result = datas.stream().reduce((total, data) -> total + data).orElse(0);
//	   System.out.println(result);
	   
//	   Optional
//	   String data = null;
//	   Optional<String> foundData = Optional.ofNullable(data);
//	   
//	   System.out.println(foundData.orElse("없음"));
	   
	   
//	   심화
//	   만 나이 계산하기
	   ArrayList<User> users = new ArrayList<User>();
	   
	   users.add(new User(1, "이정식", 29));
	   users.add(new User(2, "홍길동", 25));
	   users.add(new User(3, "김철수", 13));
	   
	   // 만 나이 계산 (나이 - 1) 
	   users.stream().map(User::getLowerAge).forEach(System.out::println);
	   
	   // 미성년자만 정보 출력
	   users.stream().filter((user) -> user.getAge() < 20).forEach(System.out::println);
	   
	   
   }
}















