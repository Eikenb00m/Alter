package org.alter.plugins.content.area.yanille.chat

arrayOf(Npcs.AUBURY_11435).forEach { aubury ->

    if (npcHasOption(npc = aubury, option = "trade")) {
        on_npc_option(npc = aubury, option = "trade") { open_shop(player) }
    }

    if (npcHasOption(npc = aubury, option = "talk-to")) {
        on_npc_option(npc = aubury, option = "talk-to", lineOfSightDistance = 1) { player.queue { dialog() } }
    }

    if (npcHasOption(npc = aubury, option = "teleport")) {
        on_npc_option(npc = aubury, option = "teleport", lineOfSightDistance = 1) {
            player.queue {
                val npc = player.getInteractingNpc()
                player.lock = LockState.FULL
                //npc.forceChat("Senventior Disthine Molenko")
                npc.graphic(108, 10)
                wait(3)
                player.graphic(110, 125)
                wait(2)
                player.moveTo(3087, 3499, 0)
                player.lock = LockState.NONE
            }
        }
    }
}

suspend fun QueueTask.dialog() {
    chatNpc("Do you want to buy magic equipment?")
    when (options()) {
        1 -> open_shop(player)
        2 -> no_thank_you()
        3 -> teleport_me()
    }
}

suspend fun QueueTask.options(): Int =
    options(
        "Yes please!",
        "Oh, it's a rune shop. No thank you then.",
        "Can you teleport me to Edgeville?",
    )


fun open_shop(p: Player) {
    p.openShop("Aubury's Magic Shop.")
}

suspend fun QueueTask.no_thank_you() {
    chatPlayer("Oh, it's a magic equipment shop. No thank you, then.", animation = 568)
    chatNpc("Well, if you find someone who does want magic equipment, please send them my way.", animation = 554)
}

suspend fun QueueTask.teleport_me() {
    chatPlayer("Can you teleport me to the Edgeville?", animation = 568)
        player.queue {
            val npc = player.getInteractingNpc()
            player.lock = LockState.FULL
            //npc.forceChat("Senventior Disthine Molenko")
            npc.graphic(108, 10)
            wait(3)
            player.graphic(110, 125)
            wait(2)
            player.moveTo(3087, 3499, 0)
            player.lock = LockState.NONE
        }
    }
