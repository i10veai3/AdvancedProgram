public class Hero{

    private String name,skill,gender,arms,difficulty;

    public Hero(){
        System.out.println("The Hero appear!");
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }
    public void setSkill(String newSkill){
        this.skill = newSkill;
    }

    public String getSkill(){
        return this.skill;
    }

    public String showInfo(){
        String all = this.name +" "+ this.skill +" "+ this.gender +" "+ this.arms +" "+ this.difficulty;
        return all;
    }

}