package homeworks.session14;

import java.util.*;

public class FrequentItems {
    private Map<String, Integer> frequnecy = new HashMap<>();

    public void addPurchase(List<String> cart){
        for (String product : cart){
            if (frequnecy.containsKey(product))
                frequnecy.put(product, frequnecy.get(product) + 1);
            else frequnecy.put(product, 1);
        }
    }

    public List<String> getTop(int k){
        Map<String, Integer> copyMap = new HashMap<>(frequnecy);
        List<String> result = new ArrayList<>();

        if (frequnecy.isEmpty() || k <= 0)
            return result;

        while (!copyMap.isEmpty() && result.size() < k){
            int max = 0;
            for (int freq : copyMap.values()){
                if (freq > max)
                    max = freq;
            }

            List<String> remove = new ArrayList<>();
            for (String product : copyMap.keySet()){
                if (copyMap.get(product) == max){
                    result.add(product);
                    remove.add(product);
                }
            }
            for (String product : remove){
                copyMap.remove(product);
            }
        }
        return result;
    }

    static void main(String[] args) {
        FrequentItems items = new FrequentItems();
        List<List<String>> shopingCarts = Arrays.asList(
                Arrays.asList("P1", "P2", "P3"),
                Arrays.asList("P2", "P3", "P4"),
                Arrays.asList("P2", "P3"),
                Arrays.asList("P5")
        );
        for (List<String> cart : shopingCarts){
            items.addPurchase(cart);
        }
        int k = 2;
        List<String> topItems = items.getTop(k);
        System.out.println("Top " + k + " product is: " );
        System.out.println(topItems);
    }
}
