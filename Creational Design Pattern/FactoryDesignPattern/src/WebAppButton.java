public class WebAppButton implements Button{
    
    @Override
    public void onDoubleTap() {

        System.out.println("Web App use onDoubleTap Button");
    }

    @Override
    public void onLongPressed() {
        
        System.out.println("Web App use onLongPressed Button");
    }
   
    @Override
    public void onPressed() {
        
        System.out.println("Web App use onPressed Button");
    }
}
