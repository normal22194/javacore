package homeworks.employee;

public class CompanyStorage {

    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company){
        for (int i = 0; i < size; i++) {
            if (companies[i].equals(company)) {
                System.out.println("company already exists");
                return;
            }
        }
        if (size == companies.length){
            extend();
        }

        companies[size++] = company;
    }
    private void extend() {
        Company[] newCompanies = new Company[companies.length + 10];

        for (int i = 0; i < size; i++) {
            newCompanies[i] = companies[i];
        }

        companies = newCompanies;
    }

    public void printAll() {
        if (size == 0){
            System.out.println("no companies found");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
            System.out.println("---------------");
        }
    }
    public Company getById(String id){
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equals(id)){
                return companies[i];
            }
        }

        return null;
    }
}
