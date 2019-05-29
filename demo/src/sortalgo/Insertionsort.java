package sortalgo;

import javafx.scene.layout.StackPane;
import java.util.ArrayList;
import javafx.animation.*;

public class Insertionsort{
    public SequentialTransition insertionsort(int[] arr, ArrayList<StackPane> list, double speed){
        Swap sw = new Swap();
        SequentialTransition st = new SequentialTransition();
        int temp;
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    st.getChildren().add(sw.swap(list.get(j - 1), list.get(j), list, speed));
                }
            }
        }
        return st;
    }
}
