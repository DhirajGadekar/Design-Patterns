public class AndroidAppButton implements Button {
    
    @Override
    public void onDoubleTap() {

        System.out.println("Android app use onDoubleTap Button");
    }

    @Override
    public void onLongPressed() {
        
        System.out.println("Android app use onLongPressed Button");
    }
   
    @Override
    public void onPressed() {
        
        System.out.println("Android app use onPressed Button");
    }
}
