package homeworks.session14;

import java.util.*;

public class FrequentItems {
   private Map<String, Integer> frequency = new HashMap<>();

   public void addPurchase(List<String> cart){
       for (String product : cart) {
           if (frequency.containsKey(product)) {
               frequency.put(product, frequency.get(product) + 1);
           } else {
               frequency.put(product, 1);
           }
       }
   }

    public List<String> getTop(int k) {
        List<String> result = new ArrayList<>(); // lista cu produsele cele mai frecvente

        if (result.isEmpty() || k <= 0)
            return result;

        Map<String, Integer> copyMap = new HashMap<>(frequency);
        while (!copyMap.isEmpty() && result.size() < k) {
            int max = 0;
            for (int freq : copyMap.values()) {
                if (freq > max) {
                    max = freq;
                }
            }

            List<String> toRemove = new ArrayList<>();
            for (String product : copyMap.keySet()) {
                if (copyMap.get(product) == max) {
                    result.add(product);
                    toRemove.add(product);
                }
            }

            for (String product : toRemove) {
                copyMap.remove(product);
            }
        }
        return result;
    }

    static void main(String[] args) {
        FrequentItems history = new FrequentItems();
        List<List<String>> shoppingCarts = Arrays.asList(
                Arrays.asList("P1", "P2", "P3"),
                Arrays.asList("P2", "P3", "P4"),
                Arrays.asList("P2", "P3"),
                Arrays.asList("P5")
        );

        for (List<String> cart : shoppingCarts) {
            history.addPurchase(cart);
        }

        int k = 2;
        List<String> topItems = history.getTop(k);
        System.out.println("Top " + k + "products is: ");
        System.out.println(topItems);
    }
}
