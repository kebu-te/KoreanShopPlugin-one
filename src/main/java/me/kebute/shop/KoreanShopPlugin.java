package me.kebute.shop;

import org.bukkit.plugin.java.JavaPlugin;

public class KoreanShopPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("KoreanShopPlugin이 활성화되었습니다.");
    }

    @Override
    public void onDisable() {
        getLogger().info("KoreanShopPlugin이 비활성화되었습니다.");
    }
}
