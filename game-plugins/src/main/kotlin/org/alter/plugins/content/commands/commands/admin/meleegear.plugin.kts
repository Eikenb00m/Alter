import org.alter.game.model.priv.Privilege

on_command("meleegear", Privilege.ADMIN_POWER, description = "Fills your inventory with food") {
    player.inventory.add(item = Items.SKELETAL_TOP, amount = 1)
    player.inventory.add(item = Items.SKELETAL_BOTTOMS, amount = 1)
    player.inventory.add(item = Items.DRAGON_FULL_HELM, amount = 1)
    player.inventory.add(item = Items.DRAGON_BOOTS, amount = 1)
    player.inventory.add(item = Items.BARROWS_GLOVES, amount = 1)
    player.inventory.add(item = Items.FIRE_CAPE, amount = 1)
    player.inventory.add(item = Items.ABYSSAL_WHIP, amount = 1)
    player.inventory.add(item = Items.RING_OF_WEALTH, amount = 1)
    player.inventory.add(item = Items.AMULET_OF_FURY, amount = 1)
}
