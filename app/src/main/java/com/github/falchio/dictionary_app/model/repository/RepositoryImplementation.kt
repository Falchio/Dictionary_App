package com.github.falchio.dictionary_app.model.repository

import com.github.falchio.dictionary_app.model.data.SearchResult
import com.github.falchio.dictionary_app.model.datasource.DataSource
import io.reactivex.Observable

class RepositoryImplementation(private val dataSource: DataSource<List<SearchResult>>) :
    Repository<List<SearchResult>> {

    override fun getData(word: String): Observable<List<SearchResult>> {
        return dataSource.getData(word)
    }
}
