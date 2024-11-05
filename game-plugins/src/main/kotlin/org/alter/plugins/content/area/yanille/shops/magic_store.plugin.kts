package org.alter.plugins.content.area.yanille.shops

import org.alter.plugins.content.mechanics.shops.CoinCurrency

create_shop("Aubury's Magic Shop.", CoinCurrency(), purchasePolicy = PurchasePolicy.BUY_STOCK) {
    items[0] = ShopItem(Items.SARADOMIN_STAFF, 10, 300000, 405000, 1, 50)
    items[1] = ShopItem(Items.GUTHIX_STAFF, 10, 300000, 405000, 1, 50)
    items[2] = ShopItem(Items.ZAMORAK_STAFF, 10, 300000, 405000, 1, 50)
}
