package com.liktorn.letsmodreboot.configuration;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        // Create the configuration object from the coniguration file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            // Load the configuration file
            configuration.load();

            // Read in properties from configuration file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is en example configuration").getBoolean(true);
        }
        catch (Exception e)
        {
            // Log the exception
        }
        finally
        {
            // Save the configuration file
            configuration.save();
        }

        System.out.println("Configuration test " + configValue);
    }
}
