package net.litecj702.UserService.item.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
class ItemController {
    @GetMapping
    Mono<?> home(){
        return null;
    }

    //87
    @PostMapping
    Mono<String> addToCart(@PathVariable String id){
        return null;
    }
}
