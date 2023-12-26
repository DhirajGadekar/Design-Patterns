public class IOSAppButton implements Button {
    
    @Override
    public void onDoubleTap() {

        System.out.println("ios app use onDoubleTap Button");
    }

    @Override
    public void onLongPressed() {
        
        System.out.println("ios app use onLongPressed Button");
    }
   
    @Override
    public void onPressed() {
        
        System.out.println("ios app use onPressed Button");
    }
}
