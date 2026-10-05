import java.awt.Desktop; 
import java.io.IOException; 
import java.net.URI; 
import java.net.URISyntaxException; 

public class WebOpener { 
  public static void main(String[] args) { 
    String url = "https://community-chow-down.lovable.app/#browse"; 

    // Check if the Desktop API is supported on the current platform 
    if (Desktop.isDesktopSupported()) { 
      Desktop desktop = Desktop.getDesktop(); 
      try { 
        // Open the URL in the default browser 
        desktop.browse(new URI(url)); 
      } catch (IOException | URISyntaxException e) {
        e.printStackTrace();
      } 
    } else { 
      System.out.println("Desktop is not supported on this platform.");
    } 
  } 
}
