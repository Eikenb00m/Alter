package org.alter.plugins.content.npcs.undead

val santojalon_npc_list =
    listOf(
        Npcs.SAN_TOJALON,
    )


santojalon_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 4
            respawnDelay = 500
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 120
            attack = 86
            strength = 84
            defence = 86
            magic = 0
            ranged = 0
        }

        bonuses {
            defenceStab = 18
            defenceSlash = 22
            defenceCrush = 20
            defenceMagic = -1
            defenceRanged = 20
        }

        anims {
            attack = Animation.SKELETON_SWORD_ATTACK
            block = Animation.SKELETON_DEFEND
            death = Animation.SKELETON_DEATH
        }

        sound {
            attackSound = Sound.SKELETON_ATTACK
            blockSound = Sound.ARMED_SKELETON_HIT
            deathSound = Sound.SKELETON_DEATH
        }
    }
}
