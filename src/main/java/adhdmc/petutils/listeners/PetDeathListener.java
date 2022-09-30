package adhdmc.petutils.listeners;

import org.bukkit.entity.Player;
import org.bukkit.entity.Tameable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class PetDeathListener implements Listener {

    @EventHandler
    public void onPetDeath(EntityDeathEvent deathEvent){
        if(!(deathEvent.getEntity() instanceof Tameable pet)) return;
        if(!pet.isTamed()) return;
        Player owner = (Player) pet.getOwner();


    }
}
