package com.example.SDJ3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/data")
public class APIController
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping(value = "/animals")
    public List<Map<String, Object>> getAnimals()
    {
        return jdbcTemplate.queryForList("SELECT * FROM animals");
    }

    @GetMapping(value = "/products")
    public List<Map<String, Object>> getProducts()
    {
        return jdbcTemplate.queryForList("SELECT * FROM products");
    }
    /*
    public List<Products> getProducts() {
        return productRepo.findAll();
    }

     */
    @GetMapping(value = "/allData")
    public List<Map<String, Object>> getAllData() {
        String sql = "SELECT animals.animal_id, products.product_id, animals.animal_reg_no, " +
                " products.product_reg_no, animals.origin FROM " +
        " animals JOIN products ON animals.animal_id = products.animal_id ORDER BY " +
        " animals.animal_id;";

        return jdbcTemplate.queryForList(sql);
    }
}