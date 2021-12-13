import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        String type = "";
        int height = 0;
        String label = "LU";
        int row = 4;
        char symbol;

        Scanner scnr = new Scanner(System.in);

        
        boolean runAgain = true;
        
        while(runAgain){
            String anotherShape = "";
            boolean validType = false;
            boolean validHeight = false;
            boolean validEnd = false;
            boolean validRow = false;
            boolean validLabel = false;
            boolean validAdd = false;
            String addLabel = "";

            // Determine shape type
            while(validType == false){
                System.out.println("Select a Shape: Triangle, Diamond, or Square.");
                type = scnr.next();
                if(type.equalsIgnoreCase("triangle") || type.equalsIgnoreCase("square") || type.equalsIgnoreCase("diamond")){
                    validType = true;
                }
            }
            
            // Determine shape height
            System.out.println("Enter a height (integer greater than 3 or greater than 4 for diamonds): ");
            if (scnr.hasNextInt()){
                height = scnr.nextInt();
            }
            while(validHeight == false){
                if((type.equalsIgnoreCase("diamond") && height > 4)){
                    validHeight = true;
                }
                else if((type.equalsIgnoreCase("square") || type.equalsIgnoreCase("triangle")) && height > 3){
                    validHeight = true;
                }
                else{
                    System.out.println("Please enter a valid height (Integer greater than 3 or greater than 4 for diamonds).");
                    if (scnr.hasNextInt()){
                        height = scnr.nextInt();
                    }
                }
                
            }
            
            // Determine the ASCII character to use for drawing
            System.out.println("Enter a symbol (this will truncate input if longer than one symbol): ");
            // Truncate input if longer than a character
            symbol = scnr.next().charAt(0);

            // Add custom label?
            System.out.println("Would you like to add a custom label (Y/N)?");
            addLabel = scnr.next();
            if(addLabel.equalsIgnoreCase("y") || addLabel.equalsIgnoreCase("n")){
                validAdd = true;
            }
            while(validAdd == false){
                System.out.println("Invalid Input: Please enter Y or N.");
                addLabel = scnr.next();
                if(addLabel.equalsIgnoreCase("y") || addLabel.equalsIgnoreCase("n")){
                    validAdd = true;
                }
            }
            
            if(addLabel.equalsIgnoreCase("y")){
                while(validRow == false || validLabel == false){
                    System.out.println("On which row should the label appear? Must be less than the height and fit on the row.");
                    if(scnr.hasNextInt()){
                        row = scnr.nextInt();
                    }
                    else{
                        scnr.next();
                    }
                    System.out.println("Please enter a label that fits on the specified row: ");
                    label = scnr.next();

                    if(type.equalsIgnoreCase("square")){
                        if(row <= height && label.length() <= height){
                            validRow = true;
                            validLabel = true;
                        }
                    }
                    else if(type.equalsIgnoreCase("triangle")){
                        if(row <= height && label.length() < row){
                            validRow = true;
                            validLabel = true;
                        }
                    }
                    else if(type.equalsIgnoreCase("diamond")){
                        boolean bottomHalf = false;
                        if(row > Math.floorDiv(height, 2)){
                            bottomHalf = true;
                        }
                        if(bottomHalf == false && row <= height && label.length() < row){
                            validRow = true;
                            validLabel = true;

                        }
                        else if(bottomHalf == true && row <= height && label.length() <= Math.floorDiv(row, 2)){
                            validRow = true;
                            validLabel = true;
                        }
                    }
                }
            }
          
            
            // Instantiate and print shapes
            if(type.equalsIgnoreCase("square")){
                Square square = new Square();
                square.setHeight(height);
                square.setSymbol(symbol);
                square.setLabel(label);
                square.setRow(row);
                square.printSquare();
            }
            if(type.equalsIgnoreCase("triangle")){
                Triangle triangle = new Triangle();
                triangle.setHeight(height);
                triangle.setSymbol(symbol);
                triangle.setLabel(label);
                triangle.setRow(row);
                triangle.printTriangle();
            }

            if(type.equalsIgnoreCase("diamond")){
                Diamond diamond = new Diamond();
                diamond.setHeight(height);
                diamond.setSymbol(symbol);
                diamond.setLabel(label);
                diamond.setRow(row);
                diamond.printDiamond();
            }
            
            // Draw another shape?
            System.out.println("Would you like to draw another shape? (Y/N)");
            anotherShape = scnr.next();
            if(anotherShape.equalsIgnoreCase("y") || anotherShape.equalsIgnoreCase("n")){
                validEnd = true;
            }
            while(validEnd == false){
                System.out.println("Invalid Input: Please enter Y or N.");
                anotherShape = scnr.next();
            }
                
            // Update loop variable
            if(anotherShape.equalsIgnoreCase("N")) {
                runAgain = false;
            }

        }
        scnr.close();
    }
      
}
