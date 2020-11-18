package one.uclass.example

import io.micronaut.runtime.Micronaut.build

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("one.uclass.example")
        .start()
}
