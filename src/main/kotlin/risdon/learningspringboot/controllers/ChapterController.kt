package risdon.learningspringboot.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import risdon.learningspringboot.model.Chapter
import risdon.learningspringboot.repository.ChapterRepository

@RestController
class ChapterController (val repository: ChapterRepository) {

    @GetMapping("/chapters")
    fun greeting(): Flux<Chapter> {
        return repository.findAll()
    }
}