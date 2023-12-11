package com.example.mongocrud.mongocrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service 
public class ProductService {
	@Autowired
    private ProductRepo db;

    public List<Product> getall() {
        return db.findAll();
    }

    public Optional<Product> getbyid(String id) {
        Optional<Product> p = db.findById(id);
        return p;
    }

public Product updateP(Product p , String id){
    Product oldp = db.findById(id).orElseThrow();
    oldp.setProduct_name(p.getProduct_name());
    oldp.setProduct_price(p.getProduct_price());

    return db.save(oldp);
}

    public Product save(Product p) {
        return db.save(p);
    }

    public void del(String id) {
        db.deleteById(id);
    }


}
