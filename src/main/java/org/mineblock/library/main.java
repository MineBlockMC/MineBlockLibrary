package org.mineblock.library;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    @Override
    public void onLoad() {
        getLogger().info("Available libraries:");
        String[] libraries = {"com.alibaba.fastjson:1.2.76"};
        for(String library : libraries){
            getLogger().info("- " + library);
        }
    }
}
