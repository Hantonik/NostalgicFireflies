package hantonik.fireflies.platform.service;

import net.fabricmc.loader.api.FabricLoader;
import net.irisshaders.iris.pipeline.programs.ShaderAccess;
import net.minecraft.client.renderer.CompiledShaderProgram;

public final class FabricClientHelper implements IClientHelper {
    @Override
    public CompiledShaderProgram getParticleTranslucentShader() {
        return FabricLoader.getInstance().isModLoaded("iris") ? ShaderAccess.getParticleTranslucentShader() : IClientHelper.super.getParticleTranslucentShader();
    }
}
