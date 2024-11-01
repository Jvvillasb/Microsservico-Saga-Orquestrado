package br.com.microservices.orchestrated.paymentservice.core.dto;

public class OrderProduct {

	private Product product;
	private int quantity;
	
	public OrderProduct() {
		
	}
	
	public OrderProduct(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
		
}
