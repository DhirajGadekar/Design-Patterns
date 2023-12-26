public class App {
    public static void main(String[] args) throws Exception {
        
        Button btn1 = ButtonFactory.createButton("Android");
        btn1.onDoubleTap();
        btn1.onLongPressed();
        btn1.onPressed();

        Button btn2 = ButtonFactory.createButton("ios");
        btn2.onDoubleTap();
        btn2.onLongPressed();
        btn2.onPressed();

        Button btn3 = ButtonFactory.createButton("web");
        btn3.onDoubleTap();
        btn3.onLongPressed();
        btn3.onPressed();

        // Button btn4 = ButtonFactory.createButton("Windows");
        // btn4.onLongPressed();
    }
}
