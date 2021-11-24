
import java.util.Date;
import java.util.HashMap;

public class Visit {

    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date=date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = this.serviceExpense + serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = this.productExpense + productExpense;
    }

    public double getTotalExpense() {
        return  (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()))) +
                (productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType())));

    }

    @Override
    public String toString() {
        return "Visit[" +
                "customer=" + customer +
                ",date=" + date +
                ",serviceExpense=" + serviceExpense +
                ",productExpense=" + productExpense +
                ",totalExpense" + getTotalExpense()+
                ']';
    }
}
