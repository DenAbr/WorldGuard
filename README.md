# ![WorldGuard](http://static.sk89q.com/readme/worldguard-new.png)

WorldGuard lets you and players guard areas of land against griefers and undesirables, as well as tweak and disable various gameplay features of Minecraft.

* Block creeper and wither block damage, falling damage, etc.;
* Disable fire spread, lava fire spread, ice formation, Endermen picking up blocks, etc.;
* Blacklist certain items and blocks so they can't be used;
* Warn moderators when certain items and blocks are used;
* Protect areas of your world so only certain people can build in them;
* Set areas where PVP, TNT, mob damage, and other features are disabled;
* Protect your server from various 'exploits' like magical obsidian creation machines;
* Disable, or enable, various Minecraft features, like sponges from classic;
* Add useful commands like an immediate "STOP ALL FIRE SPREAD" command.
* Enable only features you want! Everything is off by default.

WorldGuard is open source and is available under the GNU Lesser
General Public License v3.

Currently, Bukkit is required to use WorldGuard. You can get a release copy of WorldGuard from the [BukkitDev site](http://dev.bukkit.org/bukkit-plugins/worldguard/).


New features
---------

* Event firing when player creates new region using commands
* Ability to use player names instead of UUIDs (regions.use-player-names-instead-of-uuids setting)
* Optimized yaml storage (separate file for each region with partial saving support)
To change default yaml to new set regions.storage.driver-type to SEPARATED_YAML
* Localization system(planned)