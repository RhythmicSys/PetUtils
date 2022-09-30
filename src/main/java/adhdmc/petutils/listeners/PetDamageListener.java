package adhdmc.petutils.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Tameable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.projectiles.ProjectileSource;

public class PetDamageListener implements Listener {

    @EventHandler
    public void onPetDamage(EntityDamageByEntityEvent damageEvent){
        Entity damager = damageEvent.getDamager();
        if(!(damageEvent.getEntity() instanceof Tameable pet)) return;
        if(!pet.isTamed()) return;
        Player owner = (Player) pet.getOwner();
        if(damager instanceof Projectile projectile) {
            ProjectileSource shooter = projectile.getShooter();
            if (!(shooter instanceof Player playerShooter)) return;
            if (playerShooter != owner) return;
            damageEvent.setCancelled(true);
            return;
        }
        if(!(damager instanceof Player damagingPlayer)) return;
        if(damagingPlayer != owner) return;
        damageEvent.setCancelled(true);
    }
}
