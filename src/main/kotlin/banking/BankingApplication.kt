package banking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankingAppApplication

fun main(args: Array<String>) {
    runApplication<BankingAppApplication>(*args)
}