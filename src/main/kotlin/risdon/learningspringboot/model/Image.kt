package risdon.learningspringboot.model

import org.springframework.data.annotation.Id

data class Image (@Id var id: String? = null, var name: String? = null )
