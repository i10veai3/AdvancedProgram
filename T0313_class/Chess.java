public class Chess{

    private String name,color,x,y,quantity;

    public Chess(){
        System.out.println("The Chess object are created!");
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }

    public String getColor(){
        return this.color;
    }

    public String showInfo(){
        String all = this.name +" "+ this.color +" "+ this.x +" "+ this.y +" "+ this.quantity;
        return all;
    }

}