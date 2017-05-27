import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Browser {
	public static void main(String[] args,String site) throws IOException, URISyntaxException {
		
		Desktop d = Desktop.getDesktop();
		d.browse(new URI(site));
	}
}
