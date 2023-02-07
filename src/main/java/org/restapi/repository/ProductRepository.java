package org.restapi.repository;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.restapi.entety.Product;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductRepository implements PanacheRepository<Product> {
}