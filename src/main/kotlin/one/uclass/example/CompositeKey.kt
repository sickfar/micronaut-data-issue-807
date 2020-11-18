package one.uclass.example

import java.io.Serializable

data class CompositeKey(
    var genericId: Long,
    var id: Long
): Serializable {
    constructor() : this(genericId = 0, id = 0)
}