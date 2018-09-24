public class Shop {
    public static void main(String[] args) {
        Ball b1 = new Ball("Тенисный " , 8);
        Ball b2 = new Ball("Баскетбольный ", 30);
        Ball b3 = new Ball("Волейбольный ");
        b3.setDiametet(20);
        System.out.println(b1);
        b1.intoBallType();
        b2.intoBallType();
        b3.intoBallType();
    }
}
