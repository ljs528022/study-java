package list.task.product;

import java.util.ArrayList;
import java.util.List;

import list.task.DBConnecter;

public class ProductService {
//	상품 추가
	public void addProduct(Product product) {
		if(product != null) {
			DBConnecter.products.add(new Product(product));
		}
	}
	
//	상품 수정
	public void modifyProduct(Product product) {
		int index = DBConnecter.products.indexOf(product);
		if(index != -1) {
			DBConnecter.products.set(index, new Product(product));
		}
	}
	
//	상품 삭제
	public void deleteProduct(Product product) {		
		DBConnecter.products.remove(product);
	}
	
	
//	상품 조회
	public Product findProduct(long id){
		Product product = null;
		for(Product data : DBConnecter.products) {
			if(product.getId() == id) {
				product = new Product(data);
			}
		}
		return product;
	}
	
	
//  상품 목록
	public List<Product> findAll() {
		ArrayList<Product> products = new ArrayList<Product>();
		for(Product product : DBConnecter.products) {
			products.add(product);
		}
		return products;
	}
}
