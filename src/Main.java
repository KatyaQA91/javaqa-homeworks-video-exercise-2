public class Main {
    public static void main(String[] args) {

        int balanceUpTo;        // баланс до
        int balanceAfter;       // баланс после
        int totalBonuses;       // итого бонусов
        int refill;             // пополнение счета
        int bonus;              // стоймость 1-ого бонуса

        bonus = 100;
        balanceUpTo = 100;
        refill = 5000;
        totalBonuses = refill / bonus;

        if (refill < 1000) {

            balanceAfter = balanceUpTo + refill;
            System.out.println("Вам начисленно 0 Бонусных рублей");
        } else {
            balanceAfter = balanceUpTo + refill + totalBonuses;
            System.out.println("Вам начисленно " + totalBonuses + " Бонусных рублей");
        }

        System.out.println("Ваш баланс " + balanceAfter);
    }
}