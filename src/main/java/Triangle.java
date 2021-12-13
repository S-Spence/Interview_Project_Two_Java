public class Triangle extends Shape {

    public Triangle() {
        super();
        this.type = "triangle";
    }

    public void printTriangle(){
        // Helper variables
        String spaces = " ";
        String sym = String.valueOf(symbol) + " ";
        int labelLength = label.length();
        label = label.replace("", " ").trim();
        
        // Print triangle
        for(int i = 1; i < height+1; ++i){
            if (i != row){
                System.out.println(spaces.repeat(height+1-i) + sym.repeat(i));
            }
            else{
                int padding = i - labelLength;
                int paddingFront = Math.floorDiv(padding, 2);
                System.out.println(spaces.repeat(height+1-i) + sym.repeat(paddingFront) + label + " " + sym.repeat(padding - paddingFront));
            }
        }
    }  
}
