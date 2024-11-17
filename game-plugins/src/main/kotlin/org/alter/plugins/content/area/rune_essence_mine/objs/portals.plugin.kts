package org.alter.plugins.content.area.rune_essence_mine.objs

on_obj_option(Objs.PORTAL_34774, "use") {
    val obj = player.getInteractingGameObj()

    player.queue {
        player.lock()
        wait(1)
        player.animate(714)
        player.graphic(111, 110)
        wait(4)

        player.animate(-1)
        player.moveTo(2591, 3087)
        player.unlock()
    }
}
