package org.alter.plugins.content.npcs.humans

val watchman_npc_list =
    listOf(
        Npcs.WATCHMAN_5420,
    )


watchman_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 4
            respawnDelay = 50
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 22
            attack = 31
            strength = 31
            defence = 31
            magic = 1
            ranged = 1
        }

        bonuses {
            defenceStab = 24
            defenceSlash = 14
            defenceCrush = 19
            defenceMagic = -4
            defenceRanged = 16
        }

        anims {
            attack = Animation.HUMAN_PUNCH
            block = Animation.HUMAN_DEFEND
            death = Animation.HUMAN_DEATH
        }

        sound {
            attackSound = Sound.HUMAN_ATTACK
            blockSound = Sound.HUMAN_HIT
            deathSound = Sound.HUMAN_DEATH
        }
    }
}
