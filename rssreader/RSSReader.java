import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.feed.Synd.SyndFeed;
import or.xml.sax.ImputSource;

public class RSSReader {

  public static void main(String[] args) {
	
	if (args.length == 0) {
		System.err.println("usage: java RSSReader URL");
		return;
	}
	
	String feedURL = args[0];
	
	SyndFeedInput feedInput;
	feedInput = new SyndFeedInput();
	
	SyndFeed feed = null;
	
	try {
		feed = feedInput.build(new InputSource(feedURL));
	}
	
	catch (Exception e) {
		System.err.println("Unable to prase feed from: " + args[0]);
		e.printStackTrace();
	}
	
	System.out.println("Found a feed of type " + feed.getFeedType());
	System.out.println("Feed title: " + feed.getTitle());
	
  }
}
