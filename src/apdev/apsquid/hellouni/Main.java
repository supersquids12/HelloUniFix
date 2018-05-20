package apdev.apsquid.hellouni;

import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
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
			return true;
		}	
		if(command.getName().toLowerCase().equals("helloccm")) {
				
			sender.sendMessage("Ccm says Hi. Now make your code formated.");
			return true;
		}
		if(command.getName().toLowerCase().equals("hellosquid")) {
					
			sender.sendMessage("Rawr.");
			return true;
		}
		
        if(command.getName().toLowerCase().equals("hello")) {
        	
        	if (args.length < 2) {
    			sender.sendMessage("Use either \\'/hello spam\\' or \\'/hello random\\'");
    			return true;
        	}
        	
        	if (args[0].equalsIgnoreCase("spam")) {
        		for(int x = 0; x < 30; x++) {
				sender.sendMessage("Hello");
        	    	}
			return true;
        	}
        	ArrayList<String> responses = new ArrayList<String>();
        	responses.add("Rawr");
        	responses.add("Ccm says Hi. Now make your code formated.");
        	responses.add("Uni says hello. Now Fuck Off.");
		
        	if (args[0].equalsIgnoreCase("random")) {
			
        		int min = 0, max = responses.size();
        		int randomNum = ThreadLocalRandom.current().nextInt(min, max);
        		sender.sendMessage(responses.get(randomNum));
        		return true;
        		}
        	sender.sendMessage("Use either \'/hello spam\' or \'/hello random\'");
			return true;
        }
        return false;
	}
}
