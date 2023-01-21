package Home.work9;

public class Company {
    private String nameCompany;
    private String dateCreate;
    private String bullstat;

    public Company() {
    }

    public Company(String name, String dateCreate, String bullstat) {
        this.nameCompany = name;
        this.dateCreate = dateCreate;
        if (!(bullstat.length() == 10)) {
            this.bullstat = "not valid bullstat";
        } else {
            this.bullstat = bullstat;
        }
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getBullstat() {
        return bullstat;
    }

    public void setBullstat(String bullstat) {
        if (!(bullstat.length() == 10)) {
            this.bullstat = "not valid bullstat";
        } else {
            this.bullstat = bullstat;
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "nameCompany='" + nameCompany + '\'' +
                ", dateCreate='" + dateCreate + '\'' +
                ", bullstat='" + bullstat + '\'' +
                '}';
    }
}
