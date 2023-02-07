package org.restapi.Service;

import org.restapi.entety.Product;
import org.restapi.repository.ProductRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ProductService {

    @Inject
    private ProductRepository productRepository;

    public List<Product> getProduct(){
        return productRepository.listAll();
    }

    @Transactional
    public void addProduct(Product product){
        productRepository.persist(product);
    }

}
