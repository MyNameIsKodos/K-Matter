package kmatter;

import java.io.File;
import java.util.Set;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class KConfig
{
    public static void initProps (File configBase)
    {
        Configuration config = new Configuration(new File(configBase, DefaultProps.FILE_CONFIG));

        config.load();

        String enabled = "What to enable/disable";
        enablekdecorids = config.get(enabled, "Enable K-Matter Decorative Blocks?", true).getBoolean(true);
        enablespensivepatterns = config.get(enabled, "Enable K-Matter Expensive Patterns? (As of v0.1, this is Diamond and Emeralds ONLY)", true).getBoolean(true);

        String blocks = "Block IDs";
        kdecorids = config.getBlock(blocks, "K-Decor Block ID", 3500).getInt(3500);
        ksynthid = config.getBlock(blocks, "K-Matter Synthesizer Block ID", 3502).getInt(3502);

        String items = "Item IDs";
        kmatterid = config.getItem(items, "K-Matter Item ID", 10000).getInt(10000); //Always add the get thingies afterwards.
        kcoalid = config.getItem(items, "KM-Infused Coal ID", 10001).getInt(10001);
        config.save();
    }

    // Enabled sections?
    public static boolean enablekdecorids;
    public static boolean enablespensivepatterns;

    // #### Block id ints and booleans###
    public static int kdecorids;
    public static int ksynthid;

    // #### Item IDs ints and booleans####
    public static int kmatterid;
    public static int kcoalid;
}