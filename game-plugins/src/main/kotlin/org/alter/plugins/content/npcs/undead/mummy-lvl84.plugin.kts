package org.alter.plugins.content.npcs.undead

val mummy_npc_list =
    listOf(
        Npcs.MUMMY_949,
        Npcs.MUMMY_950,
        Npcs.MUMMY_951,
        Npcs.MUMMY_952,
        Npcs.MUMMY_953,
    )


mummy_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 4
            respawnDelay = 10
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 90
            attack = 90
            strength = 30
            defence = 90
            magic = 1
            ranged = 1
        }

        bonuses {
            defenceStab = 90
            defenceSlash = 90
            defenceCrush = 30
            defenceMagic = 90
            defenceRanged = 0
        }

        anims {
            attack = Animation.MUMMY_ATTACK
            block = Animation.MUMMY_BLOCK
            death = Animation.MUMMY_DEATH
        }

        sound {
            attackSound = Sound.SKELETON_ATTACK
            blockSound = Sound.ARMED_SKELETON_HIT
            deathSound = Sound.SKELETON_DEATH
        }
    }
}
