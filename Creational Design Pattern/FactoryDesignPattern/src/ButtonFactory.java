
public class ButtonFactory {
    
    public static Button createButton(String appType) {

        if(appType.trim().equalsIgnoreCase("Android")) {

            return new AndroidAppButton();
        } else if(appType.trim().equalsIgnoreCase("ios")) {

            return new IOSAppButton();
        } else if(appType.trim().equalsIgnoreCase("web")) {

            return new WebAppButton();
        }
        throw new IllegalAppTypeException("Unsupported type");
    } 
}
