public class Hello {    
    public static void main(String[] args) throws Exception {
        String text = "Hello World!" + "\n";
        for(int i = 0; i < text.length(); i++){
            System.out.print(text.charAt(i));
            Thread.sleep(100);
        }
        String h = "Hello Everyone!";
        for(int i = 0; i < h.length(); i++){  
            System.out.print(h.charAt(i));
            Thread.sleep(100);
        }
    }
}
