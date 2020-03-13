public class Hero_Main {
    
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.setName("Warrior");
        hero1.setSkill("Hit");
        Hero hero2 = new Hero();
        hero2.setName("Magician");
        Hero hero3 = new Hero();
        hero3.setName("Archer");
        System.out.println(hero1.showInfo());
        
    }
}