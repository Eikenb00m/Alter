package org.alter.plugins.content.skills.thieving.pickpocket

import org.alter.api.cfg.Items
import org.alter.api.cfg.Npcs
import org.alter.game.model.weight.impl.WeightItem
import org.alter.game.model.weight.impl.WeightItemSet

// Rarity weighting
private const val ALWAYS = 0
private const val COMMON = 256
private const val UNCOMMON = 32
private const val RARE = 8
private const val VERY_RARE = 1

/**
 * @property npcIds an array of NPC npcIds for them to pickpocket
 * @property experience the amount of experienceerience given per pickpocket
 * @property reqLevel the level requirement to pickpocket that npc
 * @property rewards a weighted set of possible item rewards
 * @property damage damage range when getting stunned
 * @property stunTicks the amount of time that the npc stuns the player for
 */
enum class PickpocketNpc(
    val npcIds: IntArray,
    val experience: Double,
    val reqLevel: Int,
    val npcName: String? = null,
    val rewards: Array<WeightItem>,
    val damage: IntRange,
    val stunTicks: Int,
) {

    FARMER(
        npcIds =
            intArrayOf(
                Npcs.FARMER_3243,
                Npcs.FARMER_3244,
                Npcs.FARMER_3114,
            ),
        experience = 800.0,
        reqLevel = 10,
        rewards =
            arrayOf(
                WeightItem(item = Items.FEATHER, amount = 3..7, weight = COMMON),
                WeightItem(item = Items.FEATHER, amount = 8..12, weight = UNCOMMON),
                WeightItem(item = Items.FEATHER, amount = 25..45, weight = RARE),
                WeightItem(item = Items.FEATHER, amount = 51..72, weight = VERY_RARE),
            ),
        damage = 2..2,
        stunTicks = 8,
    ),
    MASTER_FARMER(
        npcIds =
            intArrayOf(
                Npcs.MASTER_FARMER_5730,
                Npcs.MASTER_FARMER_5731,
                Npcs.MARTIN_THE_MASTER_GARDENER,
            ),
        experience = 1200.0,
        reqLevel = 70,
        rewards =
            arrayOf(
                WeightItem(item = Items.FEATHER, amount = 15..23, weight = COMMON),
                WeightItem(item = Items.FEATHER, amount = 24..35, weight = UNCOMMON),
                WeightItem(item = Items.FEATHER, amount = 36..45, weight = RARE),
                WeightItem(item = Items.FEATHER, amount = 51..72, weight = VERY_RARE),
            ),
        damage = 2..2,
        stunTicks = 8,
    ),
    ;

    val rewardSet = WeightItemSet().apply { rewards.forEach { reward -> add(reward) } }

    companion object {
        val values = enumValues<PickpocketNpc>()
    }
}
