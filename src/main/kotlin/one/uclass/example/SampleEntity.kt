package one.uclass.example

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "entities")
@IdClass(CompositeKey::class)
data class SampleEntity(
    @Id
    @Column(name = "generic_id")
    var genericId: Long,
    @Id
    @GeneratedValue
    var id: Long,
    var name: String,
)

@Repository
interface SampleEntityRepository : JpaRepository<SampleEntity, CompositeKey> {
    fun findByGenericIdAndId(genericId: Long, id: Long): Optional<SampleEntity>
}
