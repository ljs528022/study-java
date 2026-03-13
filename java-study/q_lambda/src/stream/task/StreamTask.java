package stream.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import stream.test.Product;

public class StreamTask {
	public static void main(String[] args) {
//		10 ~ 1 까지 ArrayList에 담고 출력
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		
//		// 1 ~ 10 까지 numbers에 담아서 뒤집기
//		IntStream.range(0, 10).forEach((n) -> {
//			numbers.add(10 - n);
//		});
//		
//		numbers.forEach(System.out::println);
		
//		10 ~ 1까지 ArrayList에 담고 출력(map)
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		IntStream.range(0, 10).forEach(numbers::add);
//
//		numbers.stream().map((num) -> 10 - num).forEach(System.out::println);
		
//		10 ~ 1 까지 ArrayList에 담은 후 짝수만 출력하기.
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		
//		IntStream.range(0, 10).forEach((n) -> { numbers.add(10 - n); });
//		
//		numbers.stream().filter((n) -> n % 2 == 0).forEach(System.out::println);
		
//		1 ~ 100까지 중 홀수만 ArrayList에 담고 출력한다.
//		ArrayList<Integer> arNum = new ArrayList<Integer>();
//		IntStream.range(1, 101).filter((n) -> n % 2 != 0).forEach(arNum::add);
//		
//		arNum.forEach(System.out::println);
		
//		Apple, Banana, Orange
//		위의 문자열들을 ArrayList에 담고 이름에 'n'이 포함된 과일 이름만 출력한다.
//		ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Apple", "Banana", "Orange"));
//		fruits.stream().filter((fruit) -> fruit.contains("n")).forEach(System.out::println);
		
//		Product를 선언한다.
//		- 상품명, 가격, 재고
		Product[] arDatas = {
				new Product("연필", 2000, 12),
				new Product("화장품", 4500, 4),
				new Product("휴지", 3000, 9),
		};
		
//		3개의 상품을 담아놓는다.
		ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(arDatas));
//		1. 가격을 모두 출력한다. 단, 30% 할인된 가격으로 출력한다.
		products.stream().map((p) -> (int)(p.getPrice() * 0.7)).forEach(System.out::println);
		
//		2. 모든 재고를 10으로 변경해서 출력한다.
		products.stream().map(Product::getCount).map((count) -> 10).forEach(System.out::println);
		
//		3. 해당 상품의 가격과 재고를 곱해 총 가격을 출력한다.
		products.stream().map(Product::getTotalPrice).forEach(System.out::println);
		
		
	}
}