package Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Logg {

    final Logger LOGGER = LogManager.getLogger();

}