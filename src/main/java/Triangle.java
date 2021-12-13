public class Triangle extends Shape {

    public Triangle() {
        super();
        this.type = "triangle";
    }

    public void printTriangle(){
        String spaces = " ";
        String sym = String.valueOf(symbol) + " ";
        int label_length = label.length();
        label = label.replace("", " ").trim();
        
        // Print triangle
        for(int i = 1; i < height+1; ++i){
            if (i != row){
                System.out.println(spaces.repeat(height+1-i) + sym.repeat(i));
            }
            else{
                if(label.length() <= i){
                    int split = Math.floorDiv(i, 2);
                    int padding_front = Math.floorDiv(split, 2);
                    System.out.println(spaces.repeat(height+1-i) + sym.repeat(padding_front) + label + " " + sym.repeat(i - label_length - padding_front));
                }
            }
        }
    }  
}
