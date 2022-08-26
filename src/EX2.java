public class EX2 {
    public static void main(String[] args) {
        int balance = 40;
        int money = 1356;
        int bonus;

        if (money > 1000) {
            bonus = money / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = balance + money + bonus;
        System.out.println("Ваш баланс равен: " + totalBalance);
        System.out.println("Бонусов начислено: " + bonus);
    }
}
