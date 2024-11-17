package org.alter.plugins.content.npcs.humans.battlemage.saradomin

val battlemagesaradomin_npc_list =
    listOf(
        Npcs.BATTLE_MAGE_1611,
    )


battlemagesaradomin_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 4
            respawnDelay = 150
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 120
            attack = 1
            strength = 1
            defence = 1
            magic = 50
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
            attack = Animation.HUMAN_STAFF_BASH
            block = Animation.HUMAN_STAFF_DEFEND
            death = Animation.HUMAN_DEATH
        }

        sound {
            attackSound = Sound.FARMERSFORK_STAB
            blockSound = Sound.HUMAN_HIT
            deathSound = Sound.HUMAN_DEATH
        }
    }
}
