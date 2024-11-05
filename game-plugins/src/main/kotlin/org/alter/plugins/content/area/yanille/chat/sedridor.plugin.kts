package org.alter.plugins.content.area.yanille.chat

arrayOf(Npcs.ARCHMAGE_SEDRIDOR_11433).forEach { sedridor ->
    

    if (npcHasOption(npc = sedridor, option = "talk-to")) {
        on_npc_option(npc = sedridor, option = "talk-to", lineOfSightDistance = 1) { player.queue { dialog() } }
    }

    if (npcHasOption(npc = sedridor, option = "teleport")) {
        on_npc_option(npc = sedridor, option = "teleport", lineOfSightDistance = 1) {
            player.queue {
                val npc = player.getInteractingNpc()
                player.lock = LockState.FULL
                npc.forceChat("Senventior Disthine Molenko")
                npc.graphic(108, 10)
                wait(3)
                player.graphic(110, 125)
                wait(2)
                player.moveTo(2912, 4833, 0)
                player.lock = LockState.NONE
            }
        }
    }
}

suspend fun QueueTask.dialog() {
    chatNpc("Hello again. What can I do for you?")
    when (options()) {
        1 -> teleport_me()
    }
}

suspend fun QueueTask.options(): Int =
    options(
        "Can you teleport me to Rune Essence Mine?",
    )

suspend fun QueueTask.teleport_me() {
    chatPlayer("Can you teleport me to the Rune Essence Mine?", animation = 568)
    player.queue {
        val npc = player.getInteractingNpc()
        player.lock = LockState.FULL
        npc.forceChat("Senventior Disthine Molenko")
        npc.graphic(108, 10)
        wait(3)
        player.graphic(110, 125)
        wait(2)
        player.moveTo(2912, 4833, 0)
        player.lock = LockState.NONE
    }
}
