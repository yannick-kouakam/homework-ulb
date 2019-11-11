package template;

import java.util.ArrayList;
import java.util.List;

public class Node<T> extends Tree {
    private final T value;
    private List<Node> children;

    public Node(T value) {
        super();
        this.value = value;
        children = new ArrayList<>(degree);
    }


    public boolean info() {
        return false;
    }


    public void ins(T value, int ind) {

    }

    public void del(int ind) {

    }
}
