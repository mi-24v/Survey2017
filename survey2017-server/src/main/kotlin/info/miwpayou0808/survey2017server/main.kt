package info.miwpayou0808.survey2017server

import org.jetbrains.ktor.application.*
import org.jetbrains.ktor.features.CallLogging
import org.jetbrains.ktor.host.*
import org.jetbrains.ktor.http.*
import org.jetbrains.ktor.jetty.*
import org.jetbrains.ktor.response.*
import org.jetbrains.ktor.routing.*

fun main(args: Array<String>) {
    embeddedServer(Jetty, 8080){
        routing{
            get("/") {
                call.respondText("Hello, doge!", ContentType.Text.Html)
            }
        }
    }.start(wait = true)
}