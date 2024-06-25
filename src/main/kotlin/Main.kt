
import java.net.http.HttpRequest


fun main(args: Array<String>) {
    val client: HttpClient = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder()
        .uri(URI.create("http://foo.com/"))
        .build()
}