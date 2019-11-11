package template;

import dictionary.Dictionary;

public class Tree<T> extends Dictionary {
    protected int degree;
    private Node<T> root;

    public Tree() {
    }

    public Tree(Node<T> root, int degree) {
        this.root = root;
        this.degree = degree;
    }

}
