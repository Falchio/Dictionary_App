package com.github.falchio.dictionary_app.presenter

import com.github.falchio.dictionary_app.model.data.DataModel
import com.github.falchio.dictionary_app.view.base.View

interface Presenter<T : DataModel, V : View> {

    fun attachView(view: V)

    fun detachView(view: V)

    fun getData(word: String, isOnline: Boolean)
}
