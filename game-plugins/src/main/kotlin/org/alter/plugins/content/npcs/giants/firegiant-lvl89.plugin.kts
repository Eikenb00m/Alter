package org.alter.plugins.content.npcs.giants

val firegiant_npc_list =
    listOf(
        Npcs.FIRE_GIANT_2076,
        Npcs.FIRE_GIANT_2077,
        Npcs.FIRE_GIANT,

    )


firegiant_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 5
            respawnDelay = 30
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 111
            attack = 65
            strength = 65
            defence = 65
            magic = 1
            ranged = 1
        }

        bonuses {
            defenceStab = 0
            defenceSlash = 3
            defenceCrush = 2
            defenceMagic = 0
            defenceRanged = 0
        }

        anims {
            attack = Animation.FIRE_GIANT_ATTACK
            block = Animation.FIRE_GIANT_HIT
            death = Animation.FIRE_GIANT_DEATH
        }

        sound {
            attackSound = Sound.FIRE_GIANT_ATTACK
            blockSound = Sound.GIANT_HIT
            deathSound = Sound.GIANT_DEATH
        }
    }
}
