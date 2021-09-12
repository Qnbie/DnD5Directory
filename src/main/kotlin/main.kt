import data.commonmodels.APIResourceList
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import apicontroller.characterdata.AbilityScoresAPI

suspend fun main() {
    val client = HttpClient(CIO) {
        install(JsonFeature) {
            serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                prettyPrint = true
                isLenient = true
            })
        }
    }

    val reqer = AbilityScoresAPI(client)
    val response: APIResourceList = reqer.getResourceList()
    println(response.results[3].name)
    client.close()
}