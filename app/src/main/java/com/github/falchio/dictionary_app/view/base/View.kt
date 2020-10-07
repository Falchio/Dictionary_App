package com.github.falchio.dictionary_app.view.base

import com.github.falchio.dictionary_app.model.data.DataModel

interface View {

    fun renderData(dataModel: DataModel)

}
