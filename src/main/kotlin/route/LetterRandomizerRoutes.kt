package route

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import services.LetterRandomizer

val randomizer = LetterRandomizer()

fun Route.letterRandomizerRouting() {
    route("/letterRandomizer") {
        get {
            val randomLetter = randomizer.getRandomLetter()

            call.respond(randomLetter)
        }
    }
}

fun Application.registerLetterRandomizerRoutes() {
    routing {
        letterRandomizerRouting()
    }
}