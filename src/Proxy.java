package kmatter;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Proxy
{

    public void registerRenderInformation ()
    {

    }

    public void addNames ()
    {
    }

    public static String getMinecraftVersion ()
    {
        return Loader.instance().getMinecraftModContainer().getVersion();
    }
}