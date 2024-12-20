package ec.brooke.kanoho;

import ec.brooke.kanoho.commands.TestCommand;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class Kanoho implements ModInitializer {
    public static EphemeralityManager ephemerality;

    @Override
    public void onInitialize() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> TestCommand.register(dispatcher));
        ephemerality = new EphemeralityManager();
    }
}
