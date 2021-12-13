public class Square extends Shape {

    public Square(){
        super();
        this.type = "square";
    }

    public void printSquare(){
        // Print square
        for (int i = 1; i < height + 1; ++i){
            String str = String.valueOf(symbol) + " ";
            if (i != row){
                System.out.println(str.repeat(height));
            }
            else{
                int split = Math.floorDiv(i, 2);
                int padding_front = Math.floorDiv(split, 2);
                int label_length = label.length();
                label = label.replace("", " ").trim();
                String new_row = str.repeat(padding_front) + label + " " + str.repeat(i-label_length-padding_front); 
                System.out.println(new_row);
            }
        }


    }

    
}
