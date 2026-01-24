package homeworks.session16;

import java.util.Collections;
import java.util.List;

public class SwapPosition<T> {
    private List<T> list;

    public SwapPosition(List<T> list) {
        this.list = list;
    }

    public List<T> swap (int p1, int p2){
        Collections.swap(list, p1, p2);
        return list;
    }
}
