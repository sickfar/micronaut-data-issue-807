package one.uclass.example

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class DataTest {

    @Inject
    lateinit var sampleEntityRepository: SampleEntityRepository

    @Test
    fun testCreateRead() {
        val savedEntity = sampleEntityRepository.save(
            SampleEntity(
            genericId = 1,
            id = 0,
            name = "New entity",
        )
        )
        assertTrue(savedEntity.id > 0)
        val found = sampleEntityRepository.findByGenericIdAndId(1, savedEntity.id)
        assertTrue(found.isPresent)
        val foundById = sampleEntityRepository.findById(CompositeKey(1, savedEntity.genericId))
        assertTrue(foundById.isPresent)
    }

}