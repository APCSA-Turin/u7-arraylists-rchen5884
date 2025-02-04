package U7T3;
import java.util.ArrayList;

public class CustomerCheck {
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices() {
        double total = 0.0;
        for (MenuItem item : check) {
            total += item.getPrice();
        }
        return total;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        boolean apply = true;
        for (MenuItem item : check) {
            if (item.isDailySpecial()) {
                apply = false;
                break;
            }
        }
        if (totalPrices() < 40.0) {
            apply = false;
        }

        return apply;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        int customers = 0;
        double discount = 0;
        double tip = 0;

        double total = totalPrices();

        for (MenuItem item : check) {
            if (item.isEntree()) {
                customers++;
            }
        }

        if (couponApplies()) {
            discount = total * .25;
        }

        if (customers >= 6) {
            tip = total * .2;
        }

        return total + tip - discount;
    }
}