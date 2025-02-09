package hantonik.fireflies.platform.service;

import net.neoforged.fml.ModList;

public final class NeoForgePlatformHelper implements IPlatformHelper {
    @Override
    public String getModVersion(String modId) {
        return ModList.get().getModContainerById(modId).orElseThrow().getModInfo().getVersion().getQualifier();
    }

    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }
}
