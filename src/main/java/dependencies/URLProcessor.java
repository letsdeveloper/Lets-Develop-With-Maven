package dependencies;

import org.apache.commons.lang3.StringUtils;

public class URLProcessor {

	public static void process(String URL) {
		if (StringUtils.isEmpty(URL)) {
			throw new IllegalArgumentException("no url provided");
		}
	}
}
