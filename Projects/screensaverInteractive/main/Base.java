package Projects.screensaverInteractive.main;

public class Base {

    private Window window;
    private Element element;

    public Base(){
        element = new Element();
        window = new Window(element);
    }
}
