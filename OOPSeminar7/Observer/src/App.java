import Clients.Company;
import Interfaces.iPublisher;
import Menager.JobAgency;
import Observers.Junior;
import Observers.Master;
import Observers.Student;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        iPublisher jobAgency = new JobAgency();

        Company google = new Company(jobAgency, "Google", 50);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 100);

        Master ivanov = new Master("Ivanov");
        Junior sidorov = new Junior("sidorov");
        Student petrov = new Student("Petrov");

        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);

        for (int i = 0; i < 5; i++) {
            google.needEmpoyee();
            geekBrains.needEmpoyee();
        }
    }
}
