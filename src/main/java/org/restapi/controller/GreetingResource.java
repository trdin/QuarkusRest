package org.restapi.controller;

import org.restapi.Service.ProductService;
import org.restapi.entety.Product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
@Path("/init")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @Inject
    private ProductService productService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello, this is begin with Quarkus!!!";
    }

    @POST
    @Path("/add/products")
    @Produces("application/json")
    public Response addProduct(Product product){
        productService.addProduct(product);
        return Response.ok().build();
    }

    @GET
    @Path("/products")
    @Produces("application/json")
    public Response getProduct(){
        List<Product> prod = productService.getProduct();
        return Response.ok(prod).build();
    }
}

