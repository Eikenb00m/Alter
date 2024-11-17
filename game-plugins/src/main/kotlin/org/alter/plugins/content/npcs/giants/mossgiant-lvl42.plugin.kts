package org.alter.plugins.content.npcs.giants

val mossgiant_npc_list =
    listOf(
        Npcs.MOSS_GIANT,
    )


mossgiant_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 6
            respawnDelay = 30
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 60
            attack = 30
            strength = 30
            defence = 30
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
            attack = Animation.MOSS_GIANT_ATTACK
            block = Animation.MOSS_GIANT_HIT
            death = Animation.MOSS_GIANT_DEATH
        }

        sound {
            attackSound = Sound.MOSS_GIANT_ATTACK
            blockSound = Sound.GIANT_HIT
            deathSound = Sound.GIANT_DEATH
        }
    }
}
