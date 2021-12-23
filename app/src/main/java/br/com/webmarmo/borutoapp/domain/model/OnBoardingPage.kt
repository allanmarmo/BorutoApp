package br.com.webmarmo.borutoapp.domain.model

import androidx.annotation.DrawableRes
import br.com.webmarmo.borutoapp.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val descriptor: String
) {
    object First : OnBoardingPage(
        image = R.drawable.greetings,
        title = "Greetings",
        descriptor = "Are you a Boruto fan? Because if you are then we have a great news for you!"
    )

    object Second : OnBoardingPage(
        image = R.drawable.explore,
        title = "Explore",
        descriptor = "Find your favorite heroes and learn some of the things that you didn´t know about."
    )

    object Third : OnBoardingPage(
        image = R.drawable.power,
        title = "Power",
        descriptor = "Check out your hero´s power and see how much are they strong comparing to others."
    )
}
