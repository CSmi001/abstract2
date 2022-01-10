public class CustomerManager {
    BaseDatabaseManager databaseManager; // it is strategy
    public void getCustomers(){
        databaseManager.getData();
    }
}
