package trie;

import template.Node;

public class NodeCharacter extends Node<Character> {
    boolean isRelevant;

    public NodeCharacter(Character value) {
        super(value);
    }
}
