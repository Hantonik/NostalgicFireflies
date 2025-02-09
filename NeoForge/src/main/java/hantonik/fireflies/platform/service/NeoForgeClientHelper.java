package hantonik.fireflies.platform.service;

import net.irisshaders.iris.pipeline.programs.ShaderAccess;
import net.minecraft.client.renderer.CompiledShaderProgram;
import net.neoforged.fml.ModList;

public final class NeoForgeClientHelper implements IClientHelper {
    @Override
    public CompiledShaderProgram getParticleTranslucentShader() {
        return ModList.get().isLoaded("iris") || ModList.get().isLoaded("oculus") ? ShaderAccess.getParticleTranslucentShader() : IClientHelper.super.getParticleTranslucentShader();
    }
}
