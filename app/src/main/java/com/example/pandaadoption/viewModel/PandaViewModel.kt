package com.example.pandaadoption.viewModel

import androidx.lifecycle.ViewModel
import com.example.pandaadoption.model.PandaModel
import com.example.pandaadoption.model.getListOfPandas

class PandaViewModel : ViewModel() {

    private var _pandas: MutableList<PandaModel> = mutableListOf()
    private var _selectedPanda: PandaModel? = null

    init {
        _pandas = getListOfPandas()
    }

    fun fetchListOfPandas() = _pandas

    fun selectPanda(panda: PandaModel) {
        _selectedPanda = panda
    }

    fun getSelectedPanda() = _selectedPanda

    fun changePandaAdoptionStatus() {
        _pandas.find { it.name == _selectedPanda?.name }?.let {
            it.adopted = !it.adopted
        }
    }

    fun getAdoptionButtonString(): String =
        if (_selectedPanda?.adopted == false) "Adopt ${_selectedPanda?.name?.toUpperCase()} <3" else "I've changed my mind :("
}