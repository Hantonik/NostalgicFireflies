package hantonik.fireflies.platform.service;

import net.fabricmc.loader.api.FabricLoader;

public final class FabricPlatformHelper implements IPlatformHelper {
    @Override
    public String getModVersion(String modId) {
        return FabricLoader.getInstance().getModContainer(modId).orElseThrow().getMetadata().getVersion().getFriendlyString();
    }

    @Override
    public boolean isModLoaded(String modId) {
        return FabricLoader.getInstance().isModLoaded(modId);
    }
}
