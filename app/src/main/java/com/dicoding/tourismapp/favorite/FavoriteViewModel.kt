package com.dicoding.tourismapp.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dicoding.tourismapp.core.domain.usecase.TourismUseCase
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class FavoriteViewModel @Inject constructor(tourismUseCase: TourismUseCase) : ViewModel() {
    val favoriteTourism = tourismUseCase.getFavoriteTourism().asLiveData()
}
