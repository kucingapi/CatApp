package com.example.catapp.data

import com.example.catapp.R

data class Cat(
    val name: String,
    val description: String,
    val pictureResId: Int
)

val catList = listOf(
    Cat(
        name = "Fluffy",
        description = "Fluffy is a cute and playful cat. She loves to chase after toys and pounce on them with her fluffy paws. Fluffy also enjoys curling up in cozy corners and taking long naps. With her soft fur and adorable meows, she can melt anyone's heart.",
        pictureResId = R.drawable.fluffy
    ),
    Cat(
        name = "Whiskers",
        description = "Whiskers is a friendly and adventurous cat. He loves exploring the outdoors and going on exciting adventures. Whiskers is known for his curious nature and can often be found investigating every nook and cranny. He's always ready to greet new friends with a gentle rub against their legs.",
        pictureResId = R.drawable.whiskers
    ),
    Cat(
        name = "Mittens",
        description = "Mittens is a cuddly and affectionate cat. She loves to snuggle up in your lap and purr contently. With her soft, fuzzy paws, she gives the best massages when she kneads on your lap. Mittens is the perfect companion for cozy evenings and relaxing moments.",
        pictureResId = R.drawable.mittens
    ),
    Cat(
        name = "Oscar",
        description = "Oscar is a mischievous cat who is always up to some playful antics. He loves batting at toys and chasing anything that moves. Oscar has a knack for finding hidden spots and surprising everyone with his clever hiding skills. With his energetic and playful nature, he can turn any ordinary day into an exciting adventure.",
        pictureResId = R.drawable.oscar
    ),
    Cat(
        name = "Socks",
        description = "Socks has the softest fur you've ever felt. She enjoys being pampered and will happily sit still for hours while you brush her luxurious coat. Socks loves gentle cuddles and can often be found curled up on a warm blanket, enjoying a peaceful nap. Her gentle purrs will melt away all your stress.",
        pictureResId = R.drawable.socks
    ),
    Cat(
        name = "Simba",
        description = "Simba is the king of laziness. He loves lounging around in the sun, basking in its warm rays. Simba is an expert at finding the comfiest spots in the house, whether it's a cozy bed or a soft cushion. With his laid-back attitude and calm demeanor, he's the perfect companion for relaxed weekends and lazy afternoons.",
        pictureResId = R.drawable.simba
    ),
    Cat(
        name = "Luna",
        description = "Luna is an adventurous and fearless cat. She loves climbing trees and exploring her surroundings. Luna's agile moves and graceful leaps make her a natural acrobat. She enjoys observing the world from high perches and has a keen eye for spotting birds. With Luna around, there's always excitement and wonder in the air.",
        pictureResId = R.drawable.luna
    ),
    Cat(
        name = "Ginger",
        description = "Ginger is a gentle and affectionate cat. She loves curling up in your lap and receiving gentle strokes. Ginger has a calming presence and can sense when you need some comfort. With her soulful eyes and soft purrs, she can brighten up even the gloomiest of days.",
        pictureResId = R.drawable.ginger
    ),
    Cat(
        name = "Oliver",
        description = "Oliver is a playful and energetic cat who is always up for a game of chase. With lightning-fast reflexes and agile moves, he can effortlessly navigate through obstacles and surprise his playmates. Oliver loves interactive toys that stimulate his hunting instincts, and he will keep you entertained for hours with his amusing antics. When he's not in the mood for play, you can find him basking in the sun or curled up in a cozy spot, recharging for the next adventure.",
        pictureResId = R.drawable.oliver
    ),
    Cat(
        name = "Sleeper",
        description = "Sleeper is a cat who truly lives up to his name. He has mastered the art of napping and can be found snoozing in various cozy spots around the house. Whether it's a soft bed, a warm blanket, or a sunlit windowsill, Sleeper knows how to find the perfect place to catch some Zs. His relaxed and calm demeanor brings a sense of tranquility to the household. If you're looking for a feline companion who knows how to appreciate the joy of a good nap, Sleeper is the perfect choice.",
        pictureResId = R.drawable.sleeper
    )
)
