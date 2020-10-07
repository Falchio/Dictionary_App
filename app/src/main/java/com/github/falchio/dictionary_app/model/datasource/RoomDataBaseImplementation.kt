package com.github.falchio.dictionary_app.model.datasource

import com.github.falchio.dictionary_app.model.data.SearchResult
import io.reactivex.Observable

class RoomDataBaseImplementation : DataSource<List<SearchResult>> {

    override fun getData(word: String): Observable<List<SearchResult>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
