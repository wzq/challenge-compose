package com.example.androiddevchallenge

import androidx.annotation.IdRes


data class Dog(
    val name: String,
    @IdRes val imageRes: Int,
    val desc: String,
    var isAdopt: Boolean = false
)

val dogs = listOf(
    Dog(
        name = "English Cream Golden Retriever",
        imageRes = R.drawable.dog1,
        desc = "Most people are familiar with the widely popular family pet, the Golden Retriever. As one of the three most popular dog breeds in America, the Golden Retriever is often chosen as a family dog because of its easygoing nature, friendliness and intelligence. Because of the breed’s affectionate personality, and readiness to perform, Golden Retrievers are regularly portrayed in TV and movies. Many people fondly recall Buddy the Dog, the Golden Retriever who played Comet on Full House."
    ),
    Dog(
        name = "Long Haired German Shepherd",
        imageRes = R.drawable.dog2,
        desc = "Known for the intelligence and protective nature, German Shepherds are one of the most popular breeds around. They’re beautiful dogs that have the unique distinction of being a working-class breed. You can see these pups serving in the military or accompanying police officers on the job.",
        isAdopt = true
    ),
    Dog(
        name = "Corgi Husky Mix",
        imageRes = R.drawable.dog3,
        desc = "The Husky Corgi Mix, also known as the Horgi or Siborgi, is the cross between either the Pembroke Welsh Corgi or the Cardigan Welsh Corgi and the Siberian Husky. While it can be difficult to know exactly how the Horgi will turn out due to the fact they are a crossbreed, this small to medium sized breed is a loyal and loving dog that makes an excellent family pet. They are active and intelligent too, making them relatively easy to train and a great dog to be around."
    ),
    Dog(
        name = "Feist Dog",
        imageRes = R.drawable.dog4,
        desc = "Choosing the right dog or puppy for your home and family is difficult because you need to consider factors such as the pup’s activity level and temperament as well as how much time you have for training. One dog you may not consider because you never heard of the breed before is the Feist. These dogs go by other names such as Treeing Feist or Mountain Feist and are common in the American South. Many people love how cute the dogs are and how much they resemble Jack Russell pups. Before you decide to buy a Feist puppy, use our article to learn everything you need to know about this breed."
    ),
    Dog(
        name = "The Mountain Cur Working Dog",
        imageRes = R.drawable.dog5,
        desc = "The Mountain Cur breed, also known as Mountain Kerr, is one of the rarest breed of dogs. These dogs are energetic and enthusiastic, and love to be outdoors. They have an interesting history that links them to the early settlers that colonized the southern United States, and are known for being very protective over their owners and for being excellent hunting dogs. The word “Cur” refers to working dogs, bred to herd, hunt and guard their owner’s property and is also the umbrella term for various dogs that share highly similar traits and purposes."
    ),
    Dog(
        name = "The Puggle",
        imageRes = R.drawable.dog6,
        desc = "The Puggle is a cross breed dog with Pug and Beagle parents. They are loving and affectionate with big personalities, making them a very popular dog across the US. Their social nature means they are good with both adults and kids, making them the perfect family pet."
    ),
    Dog(
        name = "The Red Nose Pitbull",
        imageRes = R.drawable.dog7,
        desc = "The Red Nose Pitbull is a variety of the popular American Pitbull Terrier breed. Just like the Blue Nose Pitbull, Red Nose Pitbulls are intelligent and active. Unfortunately, they are surrounded by a lot of controversies because they fall into the Pitbull breed, but when trained right they can be sweet, loving and perfect pets. Read on to find out more about the Red Nose Pitbull and whether they’re the dog for you."
    ),
    Dog(
        name = "The Sheepadoodle",
        imageRes = R.drawable.dog8,
        desc = "A Sheepadoodle is not a pure dog breed and is a cross between a male Old English Sheepdog and a female Poodle. This breed is very popular because of their obedient, friendly and loving temperament. They are very easy to train and are kid friendly, making them the perfect family dog. Sheepadoodles love to exercise and are a very loyal companion to their owner. Read on below to see whether a Sheepadoodle is the right dog for you."
    ),
    Dog(
        name = "The Presa Canario",
        imageRes = R.drawable.dog9,
        desc = "Big dogs take a lot of time and investment, not to mention space, but they can also give you plenty back in return. This is certainly true of the Presa Canario, which is a Molosser-type dog breed. You might know this dog as a Canary Mastiff (or Perro de Presa Canario or Dogo Canario) due to where they originated in the Canary Islands which are part of Spain."
    ),
    Dog(
        name = "The Chiweenie",
        imageRes = R.drawable.dog10,
        desc = "Purebred miniature toy breeds make for teeny, adorable dogs. Yet something magical comes to life when you mix two of these pure breeds together, and it’s called a Chiweenie. You may have an inkling of at least one of the breeds that make up this mixed miniature pup, but for everything you don’t already know about the Chiweenie, you will find it all here."
    ),
)