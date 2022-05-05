package op.hackathon.one_pizza.onepizzahackathon.model;

import java.util.List;

/**
 *
 * @author amine gasa
 */
public class Customer {
    private List<String> likedIngredients;
    private List<String> dislikedIngredients;

    public Customer(List<String> likedIngredients, List<String> dislikedIngredients) {
        this.likedIngredients = likedIngredients;
        this.dislikedIngredients = dislikedIngredients;
    }

    public List<String> getLikedIngredients() {
        return likedIngredients;
    }

    public List<String> getDislikedIngredients() {
        return dislikedIngredients;
    }
    
}