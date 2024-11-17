package org.alter.plugins.content.npcs.animals

/**
 *  @author <a href="https://github.com/CloudS3c">Cl0ud</a>
 *  @author <a href="https://www.rune-server.ee/members/376238-cloudsec/">Cl0ud</a>
 *
 */
val cow_npc_list =
    listOf(
        Npcs.GIANT_RAT_2858,
    )


cow_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 4
            respawnDelay = 18
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 5
            attack = 2
            strength = 3
            defence = 2
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
            attack = Animation.GIANT_CRYPT_RAT_ATTACK
            block = Animation.GIANT_CRYPT_RAT_DEFEND
            death = Animation.GIANT_CRYPT_RAT_DEATH
        }

        sound {
            attackSound = Sound.RAT_ATTACK
            blockSound = Sound.RAT_HIT
            deathSound = Sound.RAT_DEATH
        }
    }
}
