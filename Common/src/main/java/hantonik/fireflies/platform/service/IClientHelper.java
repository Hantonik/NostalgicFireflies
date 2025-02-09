package hantonik.fireflies.platform.service;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.CompiledShaderProgram;
import net.minecraft.client.renderer.CoreShaders;

public interface IClientHelper {
    default CompiledShaderProgram getParticleTranslucentShader() {
        return Minecraft.getInstance().getShaderManager().getProgram(CoreShaders.PARTICLE);
    }
}
