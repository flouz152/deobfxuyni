package optimize.optimizemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Simple Forge entrypoint that wires the legacy precompiled client classes
 * into a standard 1.12.2 Forge mod. The heavy lifting still happens inside the
 * original client bytecode that lives under {@code src/main/resources}; this
 * class merely exposes a conventional mod container so that Forge can discover
 * and bootstrap it at runtime.
 */
@Mod(modid = OptimizeModForge.MOD_ID, name = OptimizeModForge.NAME, version = OptimizeModForge.VERSION)
public final class OptimizeModForge {

    static final String MOD_ID = "optimizemod";
    static final String NAME = "Optimize Mod";
    static final String VERSION = "1.0.0";

    private static final Logger LOGGER = LogManager.getLogger(NAME);

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        LOGGER.info("OptimizeModForge initialized – legacy modules are ready.");
    }
}
