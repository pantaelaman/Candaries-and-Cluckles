package slowcube;
import net.canarymod.plugin.Plugin;
import net.canarymod.logger.Logman;
import net.canarymod.Canary;
import net.canarymod.commandsys.*;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.world.position.Location;
import com.pragprog.ahmine.ez.EZPlugin;

public class SlowCube extends EZPlugin {
  
  @Command(aliases = { "slowcube" },
            description = "slowcube plugin",
            permissions = { "*" },
            toolTip = "/slowcube")
  public void slowcubeCommand(MessageReceiver caller, String[] parameters) {
    if (caller instanceof Player) { 
      Player me = (Player)caller;
      // Put your code after this line:
		
      // ...and finish your code before this line.
    }
  }
}
