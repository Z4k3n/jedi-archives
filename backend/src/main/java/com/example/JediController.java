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
    public List<Jedi> findAll() {
        System.out.println("findAll");
        return List.of(
                new Jedi(1L, "Anakin", "Knight", "Blue", "Tatooine", "Obi-Wan Kenobi", "Ahsoka Tano", 23, 5),
                new Jedi(2L, "Luke", "Master", "Green", "Tatooine", "Yoda", "Ben Solo", 53, 5),
                new Jedi(3L, "Yoda", "Grand Master", "Green", "Unknown", "N/A", "Luke Skywalker", 900, 5)
        );
    }

    @GetMapping("/{id}")
    public Jedi findById(@PathVariable Long id) {
        System.out.println("findById " + id);
        return new Jedi(id, "Jedi example", "Rank example", "Color example", "Homeworld example", "Master example", "Padawan example", 100, 3);
    }
}
