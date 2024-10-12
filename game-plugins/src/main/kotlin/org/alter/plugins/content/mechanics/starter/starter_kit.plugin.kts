package org.alter.plugins.content.mechanics.starter

import org.alter.game.model.attr.NEW_ACCOUNT_ATTR

on_login {
    if (player.attr[NEW_ACCOUNT_ATTR] ?: return@on_login) {
        with(player.inventory) {
            add(Items.BRONZE_SWORD)
            add(Items.BRONZE_DAGGER)
        }
        player.setVarbit(4070, 1)
    }
}
