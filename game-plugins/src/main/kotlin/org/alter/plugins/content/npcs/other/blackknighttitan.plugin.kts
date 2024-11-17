package org.alter.plugins.content.npcs.other

val blackknightitan_npc_list =
    listOf(
        Npcs.BLACK_KNIGHT_TITAN_6360,
    )


blackknightitan_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 7
            respawnDelay = 500
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 142
            attack = 91
            strength = 100
            defence = 91
            magic = 1
            ranged = 1
        }

        bonuses {
            defenceStab = 18
            defenceSlash = 27
            defenceCrush = 18
            defenceMagic = 1000
            defenceRanged = 1000
        }

        anims {
            attack = Animation.BLACK_KNIGHT_TITAN_ATTACK
            block = Animation.BLACK_KNIGHT_TITAN_DEFEND
            death = Animation.BLACK_KNIGHT_TITAN_DEATH
        }

        sound {
            attackSound = Sound.TROLL_ATTACK
            blockSound = Sound.TROLL_HIT
            deathSound = Sound.TROLL_DEATH
        }
    }
}
