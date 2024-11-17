package org.alter.plugins.content.npcs.demons

val jungledemon_npc_list =
    listOf(
        Npcs.JUNGLE_DEMON,
    )


jungledemon_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 6
            respawnDelay = 500
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 170
            attack = 170
            strength = 170
            defence = 170
            magic = 170
            ranged = 1
        }

        bonuses {
            defenceStab = 0
            defenceSlash = 50
            defenceCrush = 0
            defenceMagic = 50
            defenceRanged = 0
        }

        anims {
            attack = Animation.DEMON_ATTACK
            block = Animation.DEMON_HIT
            death = Animation.DEMON_DEATH
        }

        sound {
            attackSound = Sound.DEMON_ATTACK
            blockSound = Sound.DEMON_HIT
            deathSound = Sound.DEMON_DEATH
        }
    }
}
