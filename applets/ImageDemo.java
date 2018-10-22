import java.applet.*;
import java.awt.*;
import java.net.*;
public class ImageDemo extends Applet
{
private Image image;
private AppletContext context;
public void init()
{
context = this.getAppletContext();
String imageURL = this.getParameter("image");
if(imageURL == null)
{
	imageURL = "photo0013.jpg";
}
try{
URL url=new URL(this.getDocumentBase(),imageURL);
image = context.getImage(url);
}
catch(MalformedURLException e)
{
e.printStackTrace();
context.showStatus("could not load image!");
}
}
public void paint(Graphics g){
context.showStatus("display image");
g.drawImage(image,0,0,200,84,null);
g.drawString("www.javalicense.com",35,100);

}
}
