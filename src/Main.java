public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        int [] moneyWeek = new int[5];
        moneyWeek[0] = 112370;
        moneyWeek[1] = 82370;
        moneyWeek[2] = 134370;
        moneyWeek[3] = 56370;
        moneyWeek[4] = 162370;
        int sum = 0;
        for (int i : moneyWeek) {
            sum+=i;
        }
        System.out.println("Сумма трат в месяц составила " + sum + " рублей.");

        //Task 2
        System.out.println("Task 2");
        int maxMoneyWeek = 0;
        for (final int i : moneyWeek) {
            if (i>maxMoneyWeek) {
                maxMoneyWeek = i;
            }
        }
        int minMoneyWeek = maxMoneyWeek;
        for (final int i : moneyWeek) {
            if (i<minMoneyWeek) {
                minMoneyWeek = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " +minMoneyWeek+ " рублей. " +
                "Максимальная сумма трат за неделю составила " +maxMoneyWeek+ " рублей.");

    }
}