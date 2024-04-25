package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
public class Product {
  
    // @ID This annotation specifies 
    // the primary key of the entity.
    @Id 
  
    // @GeneratedValue This annotation 
    // is used to specify the primary 
    // key generation strategy to use
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private long productId;
    private String productName;
    private String productDesc;

    public Product() {
        super();
    }
    public Product(Long productId, String productName, String productDesc) {
        super();
        this.productId=productId;
        this.setProductName(productName);
        this.setProductDesc(productDesc);
    }
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	 
	
	}
	


