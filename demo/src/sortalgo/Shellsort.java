package sortalgo;

import javafx.scene.layout.StackPane;
import java.util.ArrayList;
import javafx.animation.*;


public class Shellsort {
    public SequentialTransition shellsort(int[] arr, ArrayList<StackPane> list, double speed) {
        Swap sw = new Swap();
        SequentialTransition st = new SequentialTransition();
        int temp;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    temp = arr[j];
                    arr[j] = arr[j - gap];
                    arr[j - gap] = temp;
                    st.getChildren().add(sw.farswap(list.get(j - gap), list.get(j), list, speed));
                    j -= gap;
                }
            }
        }
        return st;
    }
}
