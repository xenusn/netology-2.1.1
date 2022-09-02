public class Main {
    public static void main(String[] args) {
        int ticket = 1000;
        short bonusBase = 20;
        short totalTickets = 5;
        int bonusTotal = (ticket * totalTickets) / bonusBase;

        System.out.println ("Бонусных миль начисленно: " + bonusTotal);

    }

}
