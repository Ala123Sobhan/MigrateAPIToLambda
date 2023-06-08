package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Base {

    private static Logger log = LogManager.getLogger(Base.class.getName());

    public static final String hostName = "https://api.openweathermap.org";

    public static String buildURL(String resource, String queryParameter){
        String url = hostName + resource + queryParameter;
        log.info("URL : " + url);
        return url;
    }

}
