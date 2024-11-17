package org.alter.plugins.content.npcs.trolls.dad

val dad_npc_list =
    listOf(
        Npcs.DAD_6391,
    )


dad_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 8
            respawnDelay = 50
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 120
            attack = 60
            strength = 120
            defence = 50
            magic = 1
            ranged = 1
        }

        bonuses {
            defenceStab = 25
            defenceSlash = 25
            defenceCrush = 40
            defenceMagic = 200
            defenceRanged = 200
        }

        anims {
            attack = Animation.TROLL_ATTACK
            block = Animation.TROLL_DEFEND
            death = Animation.TROLL_DEATH
        }

        sound {
            attackSound = Sound.TROLL_ATTACK
            blockSound = Sound.TROLL_HIT
            deathSound = Sound.TROLL_DEATH
        }
    }
}
