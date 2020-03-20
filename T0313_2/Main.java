import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList <Hero> heroList = new ArrayList<Hero>();
        String str = "";
        while (true){
            System.out.println("---->>");
            str = scn.nextLine();

            if(str.equals("N")){
                break;
            }
            heroList.add(new Hero(scn.nextLine()));
        }
        for (int i=0;i<heroList.size();i++){
            System.out.println(i +"---->>"+ heroList.get(i).getName());
        }
        //System.out.println(Hero.showInfo());
        
    }
}
