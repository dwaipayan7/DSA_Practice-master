package Trie;

public class TriePractice {

    static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }

    static void insert(TrieNode root, String key) {
        TrieNode currNode = root;
        for (int i = 0; i < key.length(); i++) {
            char curr = key.charAt(i);
            if (currNode.children[curr - 'a'] == null) {
                TrieNode newNode = new TrieNode();
                currNode.children[curr - 'a'] = newNode;
            }
            currNode = currNode.children[curr - 'a']; // Navigate to the next node
        }
        currNode.isEndOfWord = true; // Mark the end of the word
    }

    static boolean search(TrieNode root, String key) {
        TrieNode currNode = root;
        for (int i = 0; i < key.length(); i++) {
            char curr = key.charAt(i);
            if (currNode.children[curr - 'a'] == null) return false;
            currNode = currNode.children[curr - 'a'];
        }
        return currNode.isEndOfWord; // Return true if it's the end of the word
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();

        // Insert words into the Trie
        insert(root, "apple");
        insert(root, "app");
        insert(root, "bat");
        insert(root, "ball");

        // Search for words in the Trie
        System.out.println(search(root, "apple")); // true
        System.out.println(search(root, "app"));   // true
        System.out.println(search(root, "bat"));   // true
        System.out.println(search(root, "ball"));  // true
        System.out.println(search(root, "batman")); // false
        System.out.println(search(root, "cat"));   // false
    }
}
