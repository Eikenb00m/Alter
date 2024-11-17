package org.alter.plugins.content.npcs.humans

val soldier_npc_list =
    listOf(
        Npcs.SOLDIER_5421,
    )


soldier_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 5
            respawnDelay = 50
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 22
            attack = 26
            strength = 25
            defence = 26
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
            attack = Animation.HUMAN_SLASH_SWORD_ATTACK
            block = Animation.HUMAN_DEFEND
            death = Animation.HUMAN_DEATH
        }

        sound {
            attackSound = Sound.HUMAN_ATTACK
            blockSound = Sound.HUMAN_BLOCK_1
            deathSound = Sound.HUMAN_DEATH
        }
    }
}
