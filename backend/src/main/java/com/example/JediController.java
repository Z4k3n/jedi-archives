package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jedis")
public class JediController {

    @GetMapping
    public List<Jedi> findAll(){
        System.out.println("findAll");
        return List.of(
                new Jedi(1L, "Anakin"),
                new Jedi(2L, "Luke"),
                new Jedi(3L, "Yoda")
        );
    }

    @GetMapping("/{id}")
    public Jedi findById(@PathVariable Long id){
        System.out.println("findById " + id);
        return new Jedi(id, "Jedi example");
    }


}
