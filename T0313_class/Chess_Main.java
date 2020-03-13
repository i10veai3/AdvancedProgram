public class Chess_Main {
    
    public static void main(String[] args) {
        Chess chess1 = new Chess();
        chess1.setName("King");
        chess1.setColor("Red");
        Chess chess2 = new Chess();
        chess2.setName("Elephants");
        Chess chess3 = new Chess();
        chess3.setName("Pawns");
        System.out.println(chess1.showInfo());
        
    }
}