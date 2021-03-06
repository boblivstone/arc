package me.agent.BukkitArc;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitArc extends JavaPlugin {
	Logger logger = Bukkit.getLogger();

	public void onEnable() {
		this.logger.info("ArcPlug has been enabled!");
		new ListenerClass(this);
	}

	public void onDisable() {
		this.logger.info("Disabling ArcPlug!");
		 /*Bukkit.broadcastMessage(ChatColor.GOLD + "[ArcaneSurvival] " +
		 ChatColor.RESET +
		 "Server plugins reloading! Expect lag for a short while. ");*/
	}

	final String bold = ChatColor.BOLD + "";
	final String gold = ChatColor.GOLD + "";
	final String white = ChatColor.WHITE + "";
	final String yellow = ChatColor.YELLOW + "";
	final String gray = ChatColor.GRAY + "";
	final String dgray = ChatColor.DARK_GRAY + "";
	final String red = ChatColor.RED + "";
	final String black = ChatColor.BLACK + "";
	final String green = ChatColor.GREEN + "";
	final String it = ChatColor.ITALIC + "";
	final String rad = red + bold + ChatColor.MAGIC + " IIIII ";
	final String blue = ChatColor.AQUA + "";
	final String re = ChatColor.RESET + "";
	final String d = ChatColor.STRIKETHROUGH + " ";
	final String spacehelp = "                           ";
	final String space2 = "        ";

	public static final String HR = ChatColor.STRIKETHROUGH
			+ StringUtils.repeat(" ", 20);

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (!(sender instanceof Player))
			//command is run from console
			return true;
		
		Player player = (Player) sender;

		//greylist command
		if (cmd.getName().equalsIgnoreCase("greylist")
				|| (cmd.getName().equalsIgnoreCase("graylist"))) {

			if (player.hasPermission("arcane.trusted"))

				player.sendMessage(ChatColor.GOLD + "[ArcaneSurvival] "
						+ ChatColor.WHITE + "You are on the greylist!");

			else {

				player.sendMessage(gold + "[ArcaneSurvival] " + white + "You are "
						+ red + "not" + white + " on the greylist!");
				player.sendMessage(gold + "[ArcaneSurvival] " + white
						+ "Talk with a staff member to become greylisted.");

			}

			return true;
		}

		if (cmd.getName().equalsIgnoreCase("map")) {

			/* p.sendMessage("");
			 p.sendMessage(gold + bold +
			 "   Supreme Dynmap > > > > > > > > >");
			 p.sendMessage("");
			 p.sendMessage(yellow + it +
			 "     http://www.arcane-minecraft.com/dynmap");
			 p.sendMessage("");*/

			player.sendMessage("");
			player.sendMessage(gold + "           Click here to view our Dynmap:");
			player.sendMessage("");
			player.sendMessage(white + "     http://www.arcane-minecraft.com/dynmap");
			player.sendMessage("");

		}

		if (cmd.getName().equalsIgnoreCase("username")) {

			player.sendMessage(gold + "[ArcaneSurvival] " + gray
					+ player.getDisplayName() + white + " is your username.");

		}

		if (cmd.getName().equalsIgnoreCase("apply")) {

			player.sendMessage("");
			player.sendMessage(gold
					+ "           Click here to apply for build rights:");
			player.sendMessage("");
			player.sendMessage(white
					+ "         http://www.arcane-minecraft.com/apply");
			player.sendMessage("");

		}

		if (cmd.getName().equalsIgnoreCase("Mumble")) {

			player.sendMessage("");
			player.sendMessage(gold + "           Here is our mumble address:");
			player.sendMessage("");
			player.sendMessage(white + "        arcanemc.mumble.com (port 9007)");
			player.sendMessage("");

		}

		if (cmd.getName().equalsIgnoreCase("forum")) {

			player.sendMessage("");
			player.sendMessage(gold + "           Click here to visit our forum:");
			player.sendMessage("");
			player.sendMessage(white + "     http://www.arcane-minecraft.com/forum");
			player.sendMessage("");

		}

		if (cmd.getName().equalsIgnoreCase("bbycake")
				|| cmd.getName().equalsIgnoreCase("bby")) {

			if (player.hasPermission("arcane.bbycake")) {

				player.sendMessage("You are bbycake.");

			} else {

				player.sendMessage("You are not bbycake.");

			}

		}

		if (cmd.getName().equalsIgnoreCase("one")
				|| cmd.getName().equalsIgnoreCase("one")) {

			player.sendMessage("The magic which allowed you to spawn fireworks from thin air has gone.");
			
			 /*Firework fw = (Firework) p1.getWorld().spawn(p1.getLocation(),
			 Firework.class);
			 FireworkEffect effect =
			 FireworkEffect.builder().trail(true).flicker(false).withColor(Color.RED).with(Type.BURST).build();
			 FireworkMeta fwm = fw.getFireworkMeta();
			 fwm.clearEffects();
			 fwm.addEffects(effect);
			
			 Field f;
			
			 try {
			
			 f = fwm.getClass().getDeclaredField("power");
			 } catch (NoSuchFieldException e){
			 e.printStackTrace();
			
			 }
			
			 fw.setFireworkMeta(fwm);
			 return true;*/

		}

		
		if (cmd.getName().equalsIgnoreCase("dclem")) {
			
			Random random = new Random();

			ArrayList<String> smallList = new ArrayList<String>();

			smallList.add("Build a house for a zombie! Zombies are human too.");
			smallList.add("Build a camp in the forest! AKA \"Going Canadian\"?");
			smallList
					.add("Build an entrance to a mine! It's half of the game's name, better make it pretty.");
			smallList
					.add("Build a garden! Remember that opium comes from poppies.");
			smallList.add("Build a graveyard! 2spooky4me?");
			smallList
					.add("Build a time capsule by burying a chest somewhere! Don't forget the \"ayy lmao\" paper in there.");
			smallList
					.add("Build a fountain! Bonus point if it doesn't look phallic.");
			smallList.add("Build a tent! Camping like a boss.");
			smallList.add("Build a dirthouse. Gotta start somewhere, amiright?");

			String smallrandom = smallList
					.get(random.nextInt(smallList.size() - 1));

			ArrayList<String> bigList = new ArrayList<String>();

			bigList.add("Build a lighthouse! No evil shall escape your sight!");
			bigList.add("Build a ship! Agentred will be so jealous of your skills.");
			bigList.add("Build a PvP arena! Watching your friends murder eachother in your own arena is priceless.");
			bigList.add("Build a monument to DClem's glory! Then give him diamonds.");
			bigList.add("Build a treehouse! \"Kids NExt Door\", anyone?");
			bigList.add("Build a watchtower! Wooden if you live in the forest, stone if you live in the mountains, clay if you live in the sea.");
			bigList.add("Build an inn! Don't let any creepers in.");
			bigList.add("Build an Egyptian themed build! Then walk like an Egyptian.");
			bigList.add("Build an Asian themed build! Senpai will surely notice you after that!");
			bigList.add("Build a 1/1 scale replica of a real or fictional build! No inspiration? Just copy.");

			String bigrandom = bigList.get(random.nextInt(bigList.size() - 1));

			ArrayList<String> redList = new ArrayList<String>();

			redList.add("Build a sorting system for your mine! Then give your diamonds to DClem.");
			redList.add("Build a nano farm! Sometimes, smaller can be better.");
			redList.add("Build a 3x3 secret door to a secret part of your base! So fancy!");
			redList.add("Build a \"panic room\" in your base, fully equipped with what you need to survive an apocalypse!");
			redList.add("Build a nether hub with portals to 3 different biomes! A whole new world!");
			redList.add("Build a farm with everything that is farmable! Ain't nobody got time to travel for cacti or vines, amiright?");
			redList.add("Build an armor for mining! Dig it hard, but use blast protection ;D");
			redList.add("Build a fully equipped enchant-station! It's a kind of magic.");
			redList.add("Build a wool farm with every wool type! Then paint with all the colors of the w...wool.");

			String redrandom = redList.get(random.nextInt(bigList.size() - 1));

			ArrayList<String> comList = new ArrayList<String>();

			comList.add("Build a portal and put it on one of the Nether Highways! Orange Highway is the best, just sayin'.");
			comList.add("Build a shop in the Market Ravine! And then shop 'til your drop... in the Ravine.");
			comList.add("Build a road linking up your base to one of the Overworld Roads! A journey of a thousand miles begins with a single step.");
			comList.add("Check Spawn for any eventual griefs! Arcane's equivalent of \"citizen's arrest\"?");
			comList.add("Help a new player find his way around Spawn and Arcane! We were all noobs in the beginning. Except for Agentred, of course.");
			comList.add("Give gifts to 3 players through the mailboxes at Spawn! So nice of you <3");
			comList.add("Open a RolePlay thread on the forum and invent a lore for your village/base/settlement! The People's Republic of Taiga will crush you anyway.");
			comList.add("Fill the gear and food chests at spawn! Nobody likes to die on his/her first night.");
			comList.add("Ask around if anyone wants help with building or ressource gathering, and then help them!");

			String comrandom = comList.get(random.nextInt(bigList.size() - 1));

			String intro = gray + bold + ">" + green + bold + "> ";

			if (args.length == 0) {

				player.sendMessage(intro + gold + bold
						+ "DClem's Anti-Boredom Build Ideas!" + red + bold
						+ " V1.0");
				player.sendMessage(intro + gray + "For " + yellow
						+ "Small Building Ideas," + gray + " Type /dclem "
						+ "small");
				player.sendMessage(intro + gray + "For " + yellow
						+ "Big Building Ideas," + gray + " Type /dclem "
						+ "big");
				player.sendMessage(intro + gray + "For " + yellow
						+ "Redstone Building Ideas," + gray + " Type /dclem "
						+ "redstone");
				player.sendMessage(intro + gray + "For " + yellow
						+ "Community Building Ideas," + gray
						+ " Type /dclem community");

				if (!sender.hasPermission("arcane.dclem")) {

					Bukkit.broadcast(gray + "Player " + red + sender.getName()
							+ gray + " typed command " + red + "/dclem" + gray
							+ ".", "arcane.dclem");
				}
			}

			if (args.length == 1) {

				if (args[0].equalsIgnoreCase("small")) {

					player.sendMessage(intro + gold + "DClem's Build Idea: " + gray
							+ smallrandom);

				}

				if (args[0].equalsIgnoreCase("big")) {

					player.sendMessage(intro + gold + "DClem's Build Idea: " + gray
							+ bigrandom);

				}

				if (args[0].equalsIgnoreCase("redstone")) {

					player.sendMessage(intro + gold + "DClem's Build Idea: " + gray
							+ redrandom);

				}

				if (args[0].equalsIgnoreCase("community")) {

					player.sendMessage(intro + gold + "DClem's Build Idea: " + gray
							+ comrandom);

				}

			}

		}

		if (cmd.getName().equalsIgnoreCase("list")) {

			StringBuilder players = new StringBuilder();

			for (Player p : Bukkit.getOnlinePlayers()) {
				if (players.length() > 0) {
					players.append(", ");
				}

				players.append(p.getDisplayName());
			}
			
			sender.sendMessage(gold + " Online players: " + ChatColor.RESET
					+ Bukkit.getServer().getOnlinePlayers().size() + "/"
					+ Bukkit.getMaxPlayers());
			sender.sendMessage(" " + players.toString());

			return true;

		}

		/*if (cmd.getName().equalsIgnoreCase("imposter") ||
		 cmd.getName().equalsIgnoreCase("imp") &&
		 sender.hasPermission("bukkit.broadcast.admin")){
		
		p.sendMessage(ChatColor.YELLOW + "Fake chat sent.");
		}
		
		 int i;
		 if(args.length >= 2){
		
		 String message = "";
		 for (i = 1; i < args.length; i++) {
		 message = message + args[i] + " ";
		 }
		
		 Bukkit.broadcastMessage("<" + args[0] + "> " + message);*/
		

		if (cmd.getName().equalsIgnoreCase("help") && args.length != 1) {

			player.sendMessage(gray + bold + " ----- " + gold + bold + "Arcane Help"
					+ gray + bold + " ----- ");

			player.sendMessage(gray + " " + gold + "/spawn " + gray
					+ "- Return to the spawn");
			player.sendMessage(gray + " " + gold + "/home " + gray
					+ "- Takes you to your home");
			player.sendMessage(gray + " " + gold + "/pvp " + gray
					+ "- Toggle PvP combat");
			player.sendMessage(gray + " " + gold + "/seen" + gray
					+ " - Seen commands");
			player.sendMessage(gray + " " + gold + "/help lwc " + gray
					+ "- Chest protection help");
			
			/* p.sendMessage(red + "|||||||||||||" + green + bold +
			 " You've Reached the " + yellow + bold +
			 "SUPREME" + green + bold + " Help Menu " + red +
			 "|||||||||||||");
			 p.sendMessage(rad + ChatColor.RESET + " We're here to help!" +
			 rad);
			 p.sendMessage(ChatColor.DARK_PURPLE +
			 "Want to go to the SupremeSpawn?" + red + bold +
			 " TYPE /SPAWN!");
			 p.sendMessage(ChatColor.DARK_PURPLE +
			 "Want to go to your supremeHome?" + red + bold +
			 " TYPE /HOME! BOOM YOU'RE HOME!");
			 p.sendMessage(ChatColor.DARK_PURPLE + "Looking to enable " +
			 green + "Player Versus Player " + ChatColor.DARK_PURPLE +
			 "combat?"
			 + red + bold + " TYPE /PVP!");
			 p.sendMessage(ChatColor.DARK_PURPLE +
			 "Want see when a person has last been online Supreme?" + red +
			 bold + " TYPE /SEEN!");
			 p.sendMessage(ChatColor.DARK_PURPLE + "Chest protection!" +
			 yellow + it + " EZ-PZ-LMN-SQZY" + red + bold +
			 " TYPE /HELP LWC!");
*/
			if (player.hasPermission("arcane.mod")) {

				player.sendMessage(gray + " " + gold + "/help mods" + gray
						+ " - Moderator commands");
			}

		}

		if (args.length == 1) {

			if (args[0].equalsIgnoreCase("lwc")) {
				player.sendMessage(gray + bold + " ----- " + gold + bold
						+ "Help LWC" + gray + bold + " ----- ");
				player.sendMessage(gray + "> " + gold + "/cprivate " + gray
						+ "- Create a protection");
				player.sendMessage(gray + "> " + gold + "/cremove " + gray
						+ "- Remove a protection");
				player.sendMessage(gray + "> " + gold + "/cpublic " + gray
						+ "- Create a public protection");
				player.sendMessage(gray + "> " + gold + "/cinfo " + gray
						+ "- View info on a protection");
				player.sendMessage(gray + "> " + gold + "/cmodify <player> " + gray
						+ "- Add a player to a protection");
				player.sendMessage(gray + "> " + gold + "/lwc flag hopper on" + gray
						+ " - Grant a chest hopper access");
				player.sendMessage(gray
						+ "> Containers you place will lock by default.");
				player.sendMessage(gray + "> View full LWC commands by typing /lwc.");
			}

			/* if(args[0].equalsIgnoreCase("ignore")){
			 p.sendMessage(gray + bold + HR + re + gold + bold +
			 " Help Ignore " + gray + HR);
			 p.sendMessage(gray + "> " + gold + "/ignore <player> " + gray +
			 "- Ignore a player");
			 p.sendMessage(gray + "> " + gold + "/unignore <player> " + gray +
			 "- Unignore a player");
			 p.sendMessage(gray + "> " + gold + "/ignorelist " + gray +
			 "- View your ignore list");
			 }
*/
			if (args[0].equalsIgnoreCase("mods")
					&& sender.hasPermission("arcane.mod")) {
				player.sendMessage(gray + bold + " ----- " + gold + bold
						+ "Help Mods" + gray + bold + " ----- ");
				player.sendMessage(gray + "> " + gold + "/ban " + gray
						+ "- Ban a player" + red + it + "");
				player.sendMessage(gray + "> " + gold + "/kick " + gray
						+ "- Kick a player");
				player.sendMessage(gray + "> " + gold + "/mute " + gray
						+ "- Mute a player");
				player.sendMessage(gray + "> " + gold + "/frz " + gray
						+ "- Freze a player" + red + it + " Agent's favorite");
				player.sendMessage(gray + "> " + gold + "/tp <player> " + gray
						+ "- Teleport to a player");
				player.sendMessage(gray + "> " + gold + "/tp <X Y Z> " + gray
						+ "- Teleport to a location" + "");
				player.sendMessage(gray + "> " + gray + "Next page: /help mods2");
			}

			if (args[0].equalsIgnoreCase("mods2")
					&& sender.hasPermission("arcane.mod")) {
				player.sendMessage(gray + bold + " ----- " + gold + bold
						+ "Help Mods 2" + gray + bold + " ----- ");
				player.sendMessage(gray + "> " + gold + "/vanish " + gray
						+ "- Vanish yourself");
				player.sendMessage(gray + "> " + gold + "/reappear " + gray
						+ "- Turn visible");
				player.sendMessage(gray + "> " + gold + "/co i " + gray
						+ "- Enable the inspection wand");
				player.sendMessage(gray + "> " + gold + "/co l <params> " + gray
						+ "- Perform a lookup");
				player.sendMessage(gray + "> " + gold + "/open " + gray
						+ "- Open an inventory");
				player.sendMessage(gray + "> " + gold + "/a <msg> " + gray
						+ "- Staff chat");
				player.sendMessage(gray + "> " + gray + "Next page: /help mods3");
			}

			if (args[0].equalsIgnoreCase("mods3")
					&& sender.hasPermission("arcane.mod")) {
				player.sendMessage(gray + bold + " ----- " + gold + bold
						+ "Help Mods 3" + gray + bold + " ----- ");
				player.sendMessage(gray + "> " + gold + "/whitelist " + gray
						+ "- Display whitelist commands");
				player.sendMessage(gray + "> " + gold + "/ail " + gray
						+ "- Display IP lookup commands, bra.");
				player.sendMessage(gray + "> " + gold
						+ "/pex group trusted user add <user> " + gray
						+ "- Greylist command");
				player.sendMessage(gray + "> " + gold + "/ultraban " + gray
						+ "- Super special command" + red + it
						+ " in development!");

			}

			// fake unknown command msg - however, any other /help <invalid>
			// would simply return nothing
			else if (!sender.hasPermission("arcane.mod")
					&& args[0].equalsIgnoreCase("mods")) {
				player.sendMessage(gold + "[ArcaneSurvival] " + white
						+ "You do not have permission to do that.");

			}

		}

		return false;

	}

}
