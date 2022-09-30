package adhdmc.petutils;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class PetUtils extends JavaPlugin {
    private static Plugin instance;
    private static MiniMessage miniMessage = MiniMessage.miniMessage();

    @Override
    public void onEnable() {
        instance = this;
    }

    public static Plugin getInstance(){
        return instance;
    }

    public static MiniMessage getMiniMessage() {
        return miniMessage;
    }
}
