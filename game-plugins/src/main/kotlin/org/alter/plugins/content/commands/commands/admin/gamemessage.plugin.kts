import org.alter.game.model.priv.Privilege

/**
 * @author Fritz <frikkipafi@gmail.com>
 */

on_command("gamemessage", Privilege.ADMIN_POWER, description = "Gamemessage for everyone") {
    val args = player.getCommandArgs()
    val text = args[0]
    player.world.players.forEach {
        it.message("$text.", ChatMessageType.GAME_MESSAGE)
    }
}
