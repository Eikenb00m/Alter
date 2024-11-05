package org.alter.plugins.content.mechanics.starter

import org.alter.game.model.attr.NEW_ACCOUNT_ATTR

on_login {
    if (player.attr[NEW_ACCOUNT_ATTR] ?: return@on_login) {
        with(player.inventory) {
            add(Items.BRONZE_SWORD)
            add(Items.WOODEN_SHIELD)
            add(Items.COINS_995, 25)
        }
        player.setVarbit(4070, 1)
    }
}
