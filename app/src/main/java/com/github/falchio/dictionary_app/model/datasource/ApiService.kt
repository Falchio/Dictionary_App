package com.github.falchio.dictionary_app.model.datasource

import com.github.falchio.dictionary_app.model.data.SearchResult
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("words/search")
    fun search(@Query("search") wordToSearch: String): Observable<List<SearchResult>>
}
