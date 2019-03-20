package risdon.learningspringboot.bootstrap

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import reactor.core.publisher.Flux
import risdon.learningspringboot.model.Chapter
import risdon.learningspringboot.repository.ChapterRepository

@Configuration
class LoadDatabase {

    @Bean
    fun commandLineRunner(repository: ChapterRepository) =  CommandLineRunner{
        Flux.just(
                Chapter(name = "Quick Start"),
                Chapter(name = "Reactive programming"),
                Chapter(name = "...and more")
        )
        .flatMap { repository.save(it) }
        .subscribe { println(it) }
    }

}