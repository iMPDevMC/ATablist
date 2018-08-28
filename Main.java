package gq.devmc.tablist;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
 
public class Main extends JavaPlugin implements Listener {
       
		Scroller scroller;

        public void onEnable(){
                scroller = new Scroller("§7Welcome to §9§lAzure §8     §c§l1.8 §8- §c§l1.12 §8    §eOnline Player §7" + Bukkit.getOnlinePlayers().size(), 70, 5, '§');
                getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable(){
                        @Override
                        public void run(){
                                for(Player player : Bukkit.getOnlinePlayers())
                                        TitleManager.setPlayerList(player, scroller.next(), "\n§bStore §7§oSoon!\n§3Website §7Soon!\n§5Discord §7discorg.gg/6tvgznP\n");
                        }
                }, 0L, 3L);
        }
       
}