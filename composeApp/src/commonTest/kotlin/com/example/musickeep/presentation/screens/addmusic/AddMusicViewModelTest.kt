package com.example.musickeep.presentation.screens.addmusic

import kotlin.test.Test
import kotlin.test.assertEquals

class AddMusicViewModelTest {

    @Test
    fun `initial state should be empty`() {
        val viewModel = AddMusicViewModel()
        val state = viewModel.uiState.value
        
        assertEquals("", state.title)
        assertEquals("", state.artist)
        assertEquals("", state.genre)
    }

    @Test
    fun `updating title should update state`() {
        val viewModel = AddMusicViewModel()
        viewModel.onTitleChange("Hype Boy")
        
        assertEquals("Hype Boy", viewModel.uiState.value.title)
    }
}
