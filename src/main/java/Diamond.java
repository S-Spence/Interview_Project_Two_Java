import java.lang.Math;

public class Diamond extends Shape{

    public Diamond(){
        super();
        this.type = "diamond";
    }

    public void printDiamond(){
        int mainSplit = Math.floorDiv(height, 2);
        String spaces = " ";
        String sym = String.valueOf(symbol) + " "; 
        int labelLength = label.length();
        label = label.replace("", " ").trim();

        for (int i = 1; i < height + 1; ++i){
            // Print top half
            if (i != row){
                if(i <= mainSplit){
                    System.out.println(spaces.repeat(height+1-i) + sym.repeat(i));
                }
                // Print bottom half
                if(i > mainSplit){
                    System.out.println(spaces.repeat(i) + sym.repeat(height + 1 -i));
                }
            }
            else {
                int split = Math.floorDiv(i, 2);
                // Print label top half
                if(i <= mainSplit){
                    int padding = i - labelLength;
                    int paddingFront = Math.floorDiv(padding, 2);
                    System.out.println(spaces.repeat(height+1-i) + sym.repeat(paddingFront) + label + " " + sym.repeat(padding - paddingFront));
                }
                // Print label bottom half
                if(i > mainSplit){
                    int padding_front = Math.floorDiv(split, 2)-1;
                    System.out.println(spaces.repeat(i) + sym.repeat(padding_front) + label + " " + sym.repeat(Math.max(height+1-i - labelLength - padding_front, 0)));
                }
            }  
        }
    } 
}
