package org.alter.plugins.content.area.yanille.shops

import org.alter.game.model.shop.PurchasePolicy
import org.alter.plugins.content.mechanics.shops.CoinCurrency

create_shop("Yanille General Store", CoinCurrency(), purchasePolicy = PurchasePolicy.BUY_TRADEABLES) {
    items[0] = ShopItem(Items.TINDERBOX, 5, 0, 1, 1, 10)
    items[1] = ShopItem(Items.HAMMER, 5, 0, 1,1,10)
    items[2] = ShopItem(Items.KNIFE, 5, 0,1,1,10)
    items[3] = ShopItem(Items.BRONZE_AXE, 5, 0, 30, 1, 20)
    items[4] = ShopItem(Items.BRONZE_PICKAXE, 5, 0, 30, 1, 20)
    items[5] = ShopItem(Items.CHISEL, 5, 0, 1, 1, 10)
    items[6] = ShopItem(Items.SHEARS, 5, 0,1,1, 10)
    items[7] = ShopItem(Items.BUCKET, 50, 0, 2, 1,25)
    items[8] = ShopItem(Items.ANTIDRAGON_SHIELD, 2, 100, 1100, 1, 100)
}
