package op.hackathon.one_pizza.onepizzahackathon.service;

import op.hackathon.one_pizza.onepizzahackathon.model.Customer;
import java.util.Comparator;

/**
 *
 * @author amine gasa
 */
public class CustomerComparator implements Comparator<Customer>{
    
    @Override
    public int compare(Customer customer1, Customer customer2) {

        if(customer1.getDislikedIngredients().size() == customer2.getDislikedIngredients().size()){
            return customer1.getLikedIngredients().size()-customer2.getLikedIngredients().size();
        }
        
       return customer1.getDislikedIngredients().size() - customer2.getDislikedIngredients().size();
    }
}
