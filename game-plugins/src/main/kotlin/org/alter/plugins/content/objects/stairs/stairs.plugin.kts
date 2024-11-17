package org.alter.plugins.content.objects.stairs

/**Magic Guild */

on_obj_option(obj = Objs.STAIRCASE_15645, option = "climb-Up") {
    when(player.tile.height) {
        1 -> {
            player.moveTo(x = 2591, z = 3087, 2)
        }
        else ->  player.moveTo(x = 2591, z = 3092, 1)
    }
}
on_obj_option(obj = Objs.STAIRCASE_15648, option = "climb-down") {
    when(player.tile.height) {
        1 -> {
            player.moveTo(x = 2591, z = 3088, 0)
        }
        else ->  player.moveTo(x = 2591, z = 3083, 1)
    }
}

/**Yanille Dungeon*/
on_obj_option(obj = Objs.STAIRCASE_16664, option = "Climb-Down") {
    when (player.tile.regionId) {
        10804 -> { //legends guild
            player.moveTo(x = 2727, z = 9774)
        }

        else -> player.moveTo(2602, 9479)
    }
}

on_obj_option(obj = Objs.STAIRCASE_16665, option = "Climb-Up") {
    when (player.tile.regionId) {
        10904 -> { //legends guild
            player.moveTo(x = 2723, z = 3375)
        }

        else -> player.moveTo(2606, 3079)
    }

}