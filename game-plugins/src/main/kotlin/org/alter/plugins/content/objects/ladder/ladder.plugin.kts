package org.alter.plugins.content.objects.ladder

/**Stairs*/

val stairs =
    arrayOf(
        Objs.STAIRCASE_16672,
        Objs.STAIRCASE_16673,
        Objs.STAIRCASE_16671,
    )

stairs.forEach { stairs ->
    if (objHasOption(obj = stairs, option = "climb")) {
        on_obj_option(obj = stairs, option = "climb") {
            climbstairs(player)
        }
    }
    if (objHasOption(obj = stairs, option = "climb-up")) {
        on_obj_option(obj = stairs, option = "climb-up") {
            climbupstairs(player)
        }
    }
    if (objHasOption(obj = stairs, option = "climb-down")) {
        on_obj_option(obj = stairs, option = "climb-down") {
            climbdownstairs(player)
        }
    }
}

/**Ladders*/

val ladders =
    arrayOf(
        Objs.LADDER_12964,
        Objs.LADDER_12965,
        Objs.LADDER_16683,
        Objs.LADDER_12966,
        Objs.LADDER_16679,
        Objs.LADDER_16684,
        Objs.LADDER_16681
    )

ladders.forEach { ladder ->
    if (objHasOption(obj = ladder, option = "climb")) {
        on_obj_option(obj = ladder, option = "climb") {
            climbladder(player)
        }
    }
    if (objHasOption(obj = ladder, option = "climb-up")) {
        on_obj_option(obj = ladder, option = "climb-up") {
            climbupladder(player)
        }
    }
    if (objHasOption(obj = ladder, option = "climb-down")) {
        on_obj_option(obj = ladder, option = "climb-down") {
            climbdownladder(player)
        }
    }
}

/**Function for ladders.*/

fun climbupladder(player: Player) {
    player.queue {
        player.animate(828)
        player.lock()
        wait(2)
        player.moveTo(player.tile.x, player.tile.z, player.tile.height + 1)
        player.unlock()
    }
}

fun climbdownladder(player: Player) {
    player.queue {
        player.animate(828)
        player.lock()
        wait(2)
        player.moveTo(player.tile.x, player.tile.z, player.tile.height - 1)
        player.unlock()
    }
}

fun climbladder(player: Player) {
    player.queue {
        when (options("Climb up the ladder.", "Climb down the ladder")) {
            1 -> climbupladder(player)
            2 -> climbdownladder(player)
        }
    }
}

/**Function for stairs.*/

fun climbupstairs(player: Player) {
    player.moveTo(player.tile.x, player.tile.z, player.tile.height + 1)
}

fun climbdownstairs(player: Player) {
    player.moveTo(player.tile.x, player.tile.z, player.tile.height - 1)
}

fun climbstairs(player: Player) {
    player.queue {
        when (options("Climb up the stairs.", "Climb down the stairs.")) {
            1 -> climbupstairs(player)
            2 -> climbdownstairs(player)
        }
    }
}

/**Trapdoors.*/

on_obj_option(Objs.TRAPDOOR_14880, option = "climb-down") {
    player.moveTo(3210, 9616, 0)
}

/**Other Ladders*/
on_obj_option(obj = Objs.LADDER_17384, option = "Climb-Down") {
    when(player.tile.regionId) {
        11317 -> { // Water obelisk
            player.moveTo(x = 2842, z = 9823)
        }

        else -> player.moveTo(2594, 9486)
    }
}
on_obj_option(obj = Objs.LADDER_17385, option = "Climb-Up")
{
    when(player.tile.regionId) {
        11418 -> { // IceQueen Dungeon
            player.moveTo(x = 2846, z = 3516)
        }
        11673 -> { // Taverley Dungeon
            player.moveTo(x = 2884, z = 3398)
        }
        11417 -> { // Water obelisk
            player.moveTo(x = 2842, z = 3423)
        }

        else ->  player.moveTo(x = 2594, z = 3086) //Magic Guild
    }
}