package apdev.apsquid.hellouni;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getName().toLowerCase().equals("hellouni")) {
			
	                sender.sendMessage("Uni says Hello. Now Fuck Off.");
		}
			
		if(command.getName().toLowerCase().equals("helloccm")) {
				
			sender.sendMessage("Ccm says Hi. Now make your code formated.");
		}
				
		if(command.getName().toLowerCase().equals("hellosquid")) {
					
			sender.sendMessage("Rawr.");
		}
					
	}
	
	return false;
	
}

