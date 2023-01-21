package Home.work9;

public class DemoCompany {
    public static void main(String[] args) {

        CompanySP companySP = new CompanySP("Nike", "1902.01.24", "12554633",
                "Denni", 2500.45, 4800.12);

        System.out.println(companySP.toString());

        System.out.println("Profit = " + companySP.getProfit());

        companySP.invoice();

    }
}
