package carpetextension;

import carpet.api.settings.Rule;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CarpetExtensionSettings {
    public static final Logger LOGGER = LogManager.getLogger("carpet-extension");
    // extension category
    public static final String EXTENSION = "extension";

    // example int setting
    @Rule(
            desc = "Your extension settings",
            categories = EXTENSION,
            options = {"1", "2", "3"}
    )
    public static int extensionInt = 1;
}
