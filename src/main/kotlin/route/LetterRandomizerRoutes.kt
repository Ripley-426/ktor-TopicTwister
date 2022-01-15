package route

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import services.LetterRandomizer

fun Route.letterRandomizerRouting() {
    route("/letterRandomizer") {
        get {
            val randomizer = LetterRandomizer();
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