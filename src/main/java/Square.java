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
                // Variables to help center the label and handle whitespace
                int labelLength = label.length();
                label = label.replace("", " ").trim();
                int paddingNeeded = height - labelLength;
                int paddingFront = Math.floorDiv(paddingNeeded, 2);
                // Create and print label row
                String newRow = str.repeat(paddingFront) + label + " " + str.repeat(paddingNeeded-paddingFront); 
                System.out.println(newRow);
            }
        }
    }   
}
