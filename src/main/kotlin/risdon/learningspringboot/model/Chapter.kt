package risdon.learningspringboot.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Chapter (@Id var id: String? = null, val name: String)
