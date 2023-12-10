package com.Library.Manage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.mongodb.core.MongoTemplate;


import java.util.List;

@RestController
@RequestMapping("api/call/shop")
@CrossOrigin()
public class Shopcontroller {
    @Autowired
    Shoprepo repo;
    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping()
    public List<Shop> getAllPosts()
    {
        return repo.findAll();
    }
    @PostMapping ("/add")
    public Shop Additem(@RequestBody Shop shop){
        return repo.save(shop);
    }
}
