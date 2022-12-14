package lab4.myQuest.locations

import lab4.functionality.Location
import lab4.functionality.Player

class Ceil : Location("Потолок", { it.name + " стал недолюбливать этот потолок." }) {
    init {
        locations.add(Floor())
    }

    override fun enter(player: Player): String {
        player.damage()
        return ""
    }
}