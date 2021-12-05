package com.kwolkowski.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary211 {

    TrieNode trie;

    public WordDictionary211() {
        trie = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = trie;

        for (char ch : word.toCharArray()) {
            if (!node.children.containsKey(ch)) {
                node.children.put(ch, new TrieNode());
            }
            node = node.children.get(ch);
        }
        node.word = true;
    }

    public boolean search(String word) {
        return search(word, trie);
    }

    private boolean search(String word, TrieNode curr) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.children.containsKey(c)) {
                curr = curr.children.get(c);
            } else {
                if (c == '.') {
                    for (Character character : curr.children.keySet()) {
                        TrieNode child = curr.children.get(character);
                        if (search(word.substring(i), child)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return curr.word;
    }

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean word = false;

        public TrieNode() {
        }
    }
}
