package com.github.falchio.dictionary_app.view.main

import com.github.falchio.dictionary_app.presenter.Interactor
import com.github.falchio.dictionary_app.model.data.DataModel
import com.github.falchio.dictionary_app.model.data.SearchResult
import com.github.falchio.dictionary_app.model.repository.Repository
import io.reactivex.Observable

class MainInteractor(
    private val remoteRepository: Repository<List<SearchResult>>,
    private val localRepository: Repository<List<SearchResult>>
) : Interactor<DataModel> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<DataModel> {
        return if (fromRemoteSource) {
            remoteRepository.getData(word).map { DataModel.Success(it) }
        } else {
            localRepository.getData(word).map { DataModel.Success(it) }
        }
    }
}
