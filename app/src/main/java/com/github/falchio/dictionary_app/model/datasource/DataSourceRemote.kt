package com.github.falchio.dictionary_app.model.datasource

import com.github.falchio.dictionary_app.model.data.SearchResult
import io.reactivex.Observable

class DataSourceRemote(private val remoteProvider: RetrofitImplementation = RetrofitImplementation()) :
    DataSource<List<SearchResult>> {

    override fun getData(word: String): Observable<List<SearchResult>> = remoteProvider.getData(word)
}
