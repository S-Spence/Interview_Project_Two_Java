import java.lang.Math;

public class Diamond extends Shape{

    public Diamond(){
        super();
        this.type = "diamond";
    }

    public void printDiamond(){
        int main_split = Math.floorDiv(height, 2);
        String spaces = " ";
        String sym = String.valueOf(symbol) + " "; 
        int label_length = label.length();
        label = label.replace("", " ").trim();

        for (int i = 1; i < height + 1; ++i){
            // Print top half
            if (i != row){
                if(i <= main_split){
                    System.out.println(spaces.repeat(height+1-i) + sym.repeat(i));
                }
                // Print bottom half
                if(i > main_split){
                    System.out.println(spaces.repeat(i) + sym.repeat(height + 1 -i));
                }
            }
            else if (label.length() <= i){
                int split = Math.floorDiv(i, 2);
                // Print label top half
                if(i <= main_split){
                    int padding_front = Math.floorDiv(split, 2);
                    System.out.println(spaces.repeat(height+1-i) + sym.repeat(padding_front) + label + " " + sym.repeat(i - label_length - padding_front));
                }
                // Print label bottom half
                if(i > main_split){
                    int padding_front = Math.floorDiv(split, 2)-1;
                    System.out.println(spaces.repeat(i) + sym.repeat(padding_front) + label + " " + sym.repeat(Math.max(height+1-i - label_length - padding_front, 0)));
                }
            }  
        }
    } 
}
