public class Student{

    private String name,ID,high,weight,gender;

    public Student() {
        System.out.println("Student has been registered!");
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }
    public void setID(String newID){
        this.ID = newID;
    }

    public String getID(){
        return this.ID;
    }

    public String showInfo(){
        String all = this.name +" "+ this.ID +" "+ this.high +" "+ this.weight +" "+ this.gender;
        return all;
    }
}