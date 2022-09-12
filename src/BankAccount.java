public class BankAccount {
    private int amount;

    public int getAmount() {
        return amount;
    }
        public String deposit(int sum) {
            amount = +sum;
            return "вы по полнимли щет на: " + sum;
        }

    public String withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Сука ты истратила все: " +  amount, amount);

        }
        amount = amount - sum;
        return "Успешно. Вы сняли 6000. осталось: " + amount;
    }

}
