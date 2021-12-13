/*
* Author: Sarah Spence
* Date: 12/9/2020
* Title: Project one for Liberty University
*/

public class Shape {

    String label;
    int row;
    int height;
    String type;
    char symbol;

    // Class constructor. Initialize defaults
    public Shape() {
        this.label = "LU";
        this.row = 4;
    }

    /* Class setters */
    // Set label
    public void setLabel(String label) {
        // The label cannot exceed the width of the shape.
        this.label = label;
    }

    // Set label row
    public void setRow(int row){
        // The row must make sure the label does not exceed the width. Confirm in driver?
        this.row = row;
    }
    // Set height
    public void setHeight(int height){
        // Height must be greater than 0.
        if (height <= 0){
            throw new IllegalArgumentException("The height must be greater than zero and cannot be null.");
        }
        else{
            this.height = height;
        }
    }
    // Set type
    public void setType(String type){
        /*if (type == null) {
            throw new IllegalArgumentException("The shape type cannot be null.");
        }
        else if (!(type.equalsIgnoreCase("triangle")) || !(type.equalsIgnoreCase("square")) || !(type.equalsIgnoreCase("diamond"))){
            throw new IllegalArgumentException("Please choose a supported type: Triangle, Square, or Diamond");
        }*/
        
        this.type = type;
    
    }
    // Set symbol
    public void setSymbol(char symbol){
        this.symbol = symbol;
    }

    /* Class getters */
    // Get label
    public String getLabel(){
        return this.label;
    }
    // Get label row    
    public int getRow(){
        return this.row;
    }
    // Get height
    public int getHeight(){
        return this.height;
    }
    // Get type
    public String getType(){
        return this.type;
    }
    // Get symbol
    public char getSymbol(){
        return this.symbol;
    }
}
