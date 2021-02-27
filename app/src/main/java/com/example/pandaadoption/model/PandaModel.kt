package com.example.pandaadoption.model

import androidx.annotation.DrawableRes
import com.example.pandaadoption.R

data class PandaModel(
    @DrawableRes val image: Int,
    val name: String,
    val location: String,
    val age: String,
    var adopted: Boolean = false,
    val story: String = "",
)

fun getListOfPandas(): MutableList<PandaModel> {
    return mutableListOf(
        PandaModel(
            R.drawable.panda_1,
            "Luisa",
            "Davenport, California",
            "2 years old",
            story = "Luisa is one of the many youngsters living in Davenport, she's very curious and always tries to find a way to mess with her friends."
        ),
        PandaModel(
            R.drawable.panda_2,
            "Tery",
            "Pardubice, Czechia",
            "24 years old",
            story = "Tery is the only panda living in the Europe as of now. She's very intelligent and always tries to help others, even when she just could sit and eat her bamboo all day long."
        ),
        PandaModel(
            R.drawable.panda_3,
            "Mrs. Columbus",
            "Manilla, Philippines",
            "8 years old",
            story = "Always up in the trees, always eager to find some undiscovered places, no wonder she's named after Christopher Columbus. She might seem quite sad at times, nothing that a bamboo wouldn't solve."
        ),
        PandaModel(
            R.drawable.panda_4,
            "Sissi",
            "Ulaanbaatar, Mongolia",
            "12 years old",
            story = "Sissi is a classic teenager, always staring at boys and eating. She never got a chance to date a boy, maybe because she's always too shy to approach them."
        ),
        PandaModel(
            R.drawable.panda_5,
            "Claude",
            "Wuhan, China",
            "10 years old",
            story = "Clause is aaaaalways too bored to do anything. She just lays on her branch all day, coming down only to eat her bamboo, given to her by the zoo caretakers. "
        ),
        PandaModel(
            R.drawable.panda_6,
            "Darwin",
            "Datong, China",
            "4 years old",
            story = "Darwin is a energetic young fellow. She always runs, jumps around and falls of the trees. Sometimes the falls seem scary, but Darwin is up on his feet sooner than you'd think."
        ),
        PandaModel(
            R.drawable.panda_7,
            "Starla",
            "Xi'an, China",
            "6 years old",
            story = "Starla... classic Starla. She's always sleeping. We've never seen her awake actually. Wait.. is she, is she even alive?"
        ),
        PandaModel(
            R.drawable.panda_8,
            "Booker",
            "Atlanta, Georgia",
            "17 years old",
            story = "Booker dreams of being an architect, he once saw some construction workers at the zoo expanding his their pens. He always says, that no dream is too big to be impossible."
        ),
        PandaModel(
            R.drawable.panda_9,
            "Bexley",
            "Adelaide, Australia",
            "42 years old",
            story = "Bexley's the oldest panda currently in Australia, His legs hurt so he cannot wander around the woods to feed himself. Or does he just pretending to not have to?"
        ),
        PandaModel(
            R.drawable.panda_10,
            "Banks",
            "San Juan, Puerto Rico",
            "15 years old",
            story = "Banks is a creative soul, you might think this painting was painted by a human, but you would be wrong. No one can really explain how he did it, but the result is obvious."
        ),
        PandaModel(
            R.drawable.panda_11,
            "Poe",
            "Nicosia, Cyprus",
            "5 years old",
            story = "Poe always hurts himself falling of things, his pen needed to be specially adapted, so it's safe for him, but he can still trip over his own legs.."
        ),
        PandaModel(
            R.drawable.panda_12,
            "Rahul",
            "Cairo, Egypt",
            "9 years old",
            story = "You might think that Cairo is not really good place for pandas to live in, in fact it really isn't. Rahul actually got lost in Chinese woods and went too far in wrong direction."
        ),
        PandaModel(
            R.drawable.panda_13,
            "Nes",
            "Abuja, Nigeria",
            "4 years old",
            story = "Nes just loves to explore. She always follows the caretakers and waits if some mysterious items fall out of their pockets. She actually collects and hides them under her bed."
        ),
        PandaModel(
            R.drawable.panda_14,
            "Cosmo",
            "Chicago, United States",
            "1 year old",
            story = "Cosmo is just so adorable. Despite his age, he always climbs trees with such an agility. Even the teenagers around him should be ashamed!"
        ),
        PandaModel(
            R.drawable.panda_15,
            "Genesis",
            "Cancun, Mexico",
            "27 years old",
            story = "Genesis is Cosmo's proud mom, she's always a bit scared, when she sees him climbing those trees, but fortunately, he never fell of it."
        ),
    )
}