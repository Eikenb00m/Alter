package org.alter.plugins.content.area.yanille.objs

import org.alter.api.cfg.Objs

//TODO Close doors

val DOORS = intArrayOf(Objs.MAGIC_GUILD_DOOR, Objs.MAGIC_GUILD_DOOR_1733)

DOORS.forEach { obj ->
    on_obj_option(obj, "Open", lineOfSightDistance = 2) {
        val door = player.getInteractingGameObj() ?: return@on_obj_option
        val doorX = door.tile.x

        player.lock()

        world.queue {
            when (doorX) {
                2597 -> {
                    val doorObj1 = world.getObject(Tile(2597, 3087), 0)
                    val doorObj2 = world.getObject(Tile(2597, 3088), 0)
                    if (doorObj1 != null && doorObj2 != null) {
                        world.openDoor(doorObj1, Objs.MAGIC_GUILD_DOOR, invertRot = true)
                        world.openDoor(doorObj2, Objs.MAGIC_GUILD_DOOR_1733)
                    }
                }
                2584 -> {
                    val doorObj1 = world.getObject(Tile(2584, 3087), 0)
                    val doorObj2 = world.getObject(Tile(2584, 3088), 0)
                    if (doorObj1 != null && doorObj2 != null) {
                        world.openDoor(doorObj1, Objs.MAGIC_GUILD_DOOR)
                        world.openDoor(doorObj2, Objs.MAGIC_GUILD_DOOR_1733, invertRot = true)
                    }
                }
            }
        }

        player.unlock()
    }
}

