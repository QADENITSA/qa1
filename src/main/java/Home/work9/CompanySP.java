package Home.work9;

public class CompanySP extends Company implements Invoiceable {

    private String nameBoss;
    private double initialCapital;
    private double actualCapital;

    public CompanySP() {
    }


    public CompanySP(String nameBoss, double initialCapital, double actualCapital) {
        this.nameBoss = nameBoss;
        this.initialCapital = initialCapital;
        this.actualCapital = actualCapital;
    }

    public CompanySP(String name, String dateCreate, String bullstat, String nameBoss, double initialCapital, double actualCapital) {
        super(name, dateCreate, bullstat);
        this.nameBoss = nameBoss;
        this.initialCapital = initialCapital;
        this.actualCapital = actualCapital;
    }

    public String getNameBoss() {
        return nameBoss;
    }

    public void setNameBoss(String nameBoss) {
        this.nameBoss = nameBoss;
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        this.initialCapital = initialCapital;
    }

    public double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(double actualCapital) {
        this.actualCapital = actualCapital;
    }

    public double getProfit() {
        double profit = actualCapital - initialCapital;
        return profit;
    }


    @Override
    public void invoice() {
        System.out.println("\n" +
                "\tФактура" + "\n" +
                "Клиент\t[Име на клиента]" +
                "[Фирма]\n" +
                "ИД № на клиента\t[ИД на клиента]\n" +
                "Адрес\t[Адрес]" +
                "[Град, област, пощенски код]\n" +
                "Телефон\t[Телефон]\n" +
                "\n" +
                "Получател\t[Име на получател]" +
                "[Фирма]\n" +
                "Адрес\t[Адрес]" +
                "[Град, област, пощенски код]\n" +
                "Телефон\t[Телефон]\n" +
                "\n" +
                "Сума за плащане\t[Изберете дата]\n" +
                "Продавач\t[Име на продавача]\n" +
                "Условия на плащане\t[Условия]\n" +
                "Дата на доставка\t[Изберете дата]\n" +
                "Начин на доставка\t[Начин на доставка]\n" +
                "Условия на доставка\t[Условия]\n" +
                "\n");
    }

    @Override
    public String toString() {
        return '\n' +
                "Name Company=" + getNameCompany() + '\n' +
                "Date Create = " + getDateCreate() + '\n' +
                "Bullstat = " + getBullstat() + '\n' +
                "Name Boss = " + nameBoss + '\n' +
                "Initial Capital = " + initialCapital + '\n' +
                "Actual Capital = " + actualCapital + '\n';
    }
}
