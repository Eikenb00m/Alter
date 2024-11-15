package org.alter.plugins.content.npcs.creatures

import org.alter.plugins.content.combat.isBeingAttacked

/**
 *  @author <a href="https://github.com/CloudS3c">Cl0ud</a>
 *  @author <a href="https://www.rune-server.ee/members/376238-cloudsec/">Cl0ud</a>
 *
 */
val cow_npc_list =
    listOf(
        Npcs.OGRE,
    )


cow_npc_list.forEach {
    set_combat_def(it) {
        configs {
            attackSpeed = 6
            respawnDelay = 18
            poisonChance = 0.0
            venomChance = 0.0
        }
        stats {
            hitpoints = 60
            attack = 43
            strength = 43
            defence = 43
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
            attack = Animation.OGRE_ATTACK
            block = Animation.OGRE_DEFEND
            death = Animation.OGRE_DEATH
        }

        sound {
            attackSound = Sound.ZOGRE_ATTACK
            blockSound = Sound.ZOGRE_HIT
            deathSound = Sound.ZOGRE_DEATH
        }
    }
}
