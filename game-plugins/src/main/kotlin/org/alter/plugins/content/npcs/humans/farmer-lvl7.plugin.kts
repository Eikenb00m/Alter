package org.alter.plugins.content.npcs.humans

val farmer_npc_list =
    listOf(
        Npcs.FARMER_3114,
    )


farmer_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 6
            respawnDelay = 25
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 12
            attack = 3
            strength = 4
            defence = 8
            magic = 1
            ranged = 1
        }

        bonuses {
            defenceStab = 0
            defenceSlash = 0
            defenceCrush = 0
            defenceMagic = 0
            defenceRanged = 0
        }

        anims {
            attack = Animation.HUMAN_SPEAR_STAB
            block = Animation.HUMAN_DEFEND
            death = Animation.HUMAN_DEATH
        }

        sound {
            attackSound = Sound.FARMERSFORK_STAB
            blockSound = Sound.HUMAN_HIT
            deathSound = Sound.HUMAN_DEATH
        }
    }
}
