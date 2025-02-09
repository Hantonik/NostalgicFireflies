package hantonik.fireflies.platform.service;

public interface IPlatformHelper {
    String getModVersion(String modId);

    boolean isModLoaded(String modId);
}
