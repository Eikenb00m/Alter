package org.alter.plugins.content.npcs.other

val arzinianavatarofmagic_lvl75_npc_list =
    listOf(
        Npcs.ARZINIAN_AVATAR_OF_MAGIC_1235,
    )


arzinianavatarofmagic_lvl75_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 4
            respawnDelay = 500
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 70
            attack = 10
            strength = 50
            defence = 75
            magic = 75
            ranged = 0
        }

        bonuses {
            defenceStab = 40
            defenceSlash = 40
            defenceCrush = 40
            defenceMagic = 15
            defenceRanged = 10
        }

        anims {
            attack = Animation.HUMAN_STAFF_BASH
            block = Animation.HUMAN_STAFF_DEFEND
            death = Animation.HUMAN_DEATH
        }

        sound {
            attackSound = Sound.HUMAN_ATTACK
            blockSound = Sound.HUMAN_HIT
            deathSound = Sound.HUMAN_DEATH
        }
    }
}
