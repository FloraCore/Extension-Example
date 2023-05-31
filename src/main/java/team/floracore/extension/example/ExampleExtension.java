package team.floracore.extension.example;

import org.floracore.api.FloraCore;
import org.floracore.api.FloraCoreProvider;
import org.floracore.api.extension.Extension;

/**
 * FloraCore拓展例示主类
 *
 * @author xLikeWATCHDOG
 */
public class ExampleExtension implements Extension {
    private static FloraCore floraCore;

    public static FloraCore getFloraCore() {
        return floraCore;
    }

    @Override
    public void load() {
        floraCore = FloraCoreProvider.get();
        System.out.println("Extension Load Successful!");
    }

    @Override
    public void unload() {
        System.out.println("Extension Unload Successful!");
    }
}
