package risdon.learningspringboot.controllers

import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import risdon.learningspringboot.model.Chapter
import risdon.learningspringboot.model.Image
import risdon.learningspringboot.repository.ChapterRepository

@RestController
class ImageController () {

    @GetMapping("/images")
    fun images(): Flux<Image> {
        return Flux.just(
                Image("1", "Chapter 1.jpg"),
                Image("2", "Chapter 2.jpg"),
                Image("3", "Chapter 3.jpg")
        )
    }

    @PostMapping("/images")
    fun create(@RequestBody images: Flux<Image>): Mono<Void> {
       return images.map {
           println("We will save $it to a database soon")
           it
       }
       .then()
    }
}