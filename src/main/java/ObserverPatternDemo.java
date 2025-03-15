import stockmarket.Stock;
import stockmarket.Investor;
import taskmanagement.Task;
import taskmanagement.TeamMember;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        // ======== HỆ THỐNG GIÁ CỔ PHIẾU =========
        System.out.println("== STOCK MARKET ==");
        Stock appleStock = new Stock("Apple", 150.0);
        Investor investorA = new Investor("Alice");
        Investor investorB = new Investor("Bob");

        appleStock.attach(investorA);
        appleStock.attach(investorB);

        appleStock.setPrice(155.0); // Thông báo đến các nhà đầu tư
        appleStock.setPrice(160.0);

        System.out.println("\n== TASK MANAGEMENT ==");

        // ======== HỆ THỐNG QUẢN LÝ TASK =========
        Task projectTask = new Task("Build API");
        TeamMember dev1 = new TeamMember("Charlie");
        TeamMember dev2 = new TeamMember("David");

        projectTask.attach(dev1);
        projectTask.attach(dev2);

        projectTask.setStatus("In Progress");
        projectTask.setStatus("Completed");
    }
}
