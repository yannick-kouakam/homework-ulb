package dictionary;

import common.Operation;
import template.Node;

public class Dictionary implements Operation<Node> {
    @Override
    public boolean search(Node elmt) {
        return false;
    }

    @Override
    public boolean ins(Node elmt) {
        return false;
    }

    @Override
    public boolean del(Node elmt) {
        return false;
    }
}
