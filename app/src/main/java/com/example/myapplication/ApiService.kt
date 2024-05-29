import com.example.myapplication.BooksListResponse
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://gutendex.com"

val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

val retrofit: Retrofit =
    Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL)
        .build()

interface BookApiService {

    @GET("/books")
    suspend fun getBoos(): BooksListResponse
}

object BookApi {
    val retrofitService: BookApiService by lazy {
        retrofit.create(BookApiService::class.java)}}




