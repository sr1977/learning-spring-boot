package risdon.learningspringboot.repository

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import risdon.learningspringboot.model.Chapter

interface ChapterRepository : ReactiveCrudRepository<Chapter, String>