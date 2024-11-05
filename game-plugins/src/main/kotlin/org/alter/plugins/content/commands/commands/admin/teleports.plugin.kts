package org.alter.plugins.content.commands.commands.admin

import org.alter.game.model.priv.Privilege


on_command("home", Privilege.ADMIN_POWER, description = "Teleports you home") {
    val home = world.gameContext.home
    player.moveTo(home)
}
on_command("edge", Privilege.ADMIN_POWER, description = "Teleports you to Edgeville") {
    player.moveTo(Tile(x = 3087, z = 3499, height = 0))
}
on_command("yanille", Privilege.ADMIN_POWER, description = "Teleports you to Yanille") {
    player.moveTo(Tile(x = 2606, z = 3093, height = 0))
}
on_command("gnome", Privilege.ADMIN_POWER, description = "Teleports you to the Gnome Stronghold") {
    player.moveTo(Tile(x = 2461, z = 3443, height = 0))
}
on_command("legends", Privilege.ADMIN_POWER, description = "Teleports you to the Legends Guild") {
    player.moveTo(Tile(x = 2728, z = 3347, height = 0))
}
on_command("seers", Privilege.ADMIN_POWER, description = "Teleports you to Seers Village") {
    player.moveTo(Tile(x = 2726, z = 3432, height = 0))
}
on_command("cath", Privilege.ADMIN_POWER, description = "Teleports you to Catherby") {
    player.moveTo(Tile(x = 2752, z = 3384, height = 0))
}
on_command("tav", Privilege.ADMIN_POWER, description = "Teleports you to Taverley") {
    player.moveTo(Tile(x = 2891, z = 3454, height = 0))
}
on_command("fish", Privilege.ADMIN_POWER, description = "Teleports you to the Fishing Guild") {
    player.moveTo(Tile(x = 2544, z = 3352, height = 0))
}
on_command("ardy", Privilege.ADMIN_POWER, description = "Teleports you to Ardounge") {
    player.moveTo(Tile(x = 2661, z = 3306, height = 0))
}
on_command("wardy", Privilege.ADMIN_POWER, description = "Teleports you to West Ardounge") {
    player.moveTo(Tile(x = 2539, z = 3306, height = 0))
}
on_command("dragon", Privilege.ADMIN_POWER, description = "Teleports you to the Dragon (Smoke) Dungeon") {
    player.moveTo(Tile(x = 3235, z = 9312, height = 0))
}
on_command("essence", Privilege.ADMIN_POWER, description = "Teleports you to the Essence Mine") {
    player.moveTo(Tile(x = 2910, z = 4833, height = 0))
}