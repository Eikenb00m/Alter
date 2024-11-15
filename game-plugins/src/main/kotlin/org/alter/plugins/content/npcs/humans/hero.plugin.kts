package org.alter.plugins.content.npcs.humans

import org.alter.plugins.content.combat.isBeingAttacked

/**
 *  @author <a href="https://github.com/CloudS3c">Cl0ud</a>
 *  @author <a href="https://www.rune-server.ee/members/376238-cloudsec/">Cl0ud</a>
 *
 */
val cow_npc_list =
    listOf(
        Npcs.HERO_3295,
    )


cow_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 5
            respawnDelay = 30
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 82
            attack = 54
            strength = 55
            defence = 54
            magic = 1
            ranged = 1
        }

        bonuses {
            defenceStab = 87
            defenceSlash = 84
            defenceCrush = 76
            defenceMagic = -10
            defenceRanged = 79
        }

        anims {
            attack = Animation.HUMAN_SLASH_SWORD_ATTACK
            block = Animation.HUMAN_SHIELD_DEFEND
            death = Animation.HUMAN_DEATH
        }

        sound {
            attackSound = Sound.HUMAN_ATTACK
            blockSound = Sound.HUMAN_BLOCK_1
            deathSound = Sound.HUMAN_DEATH
        }
    }
}
