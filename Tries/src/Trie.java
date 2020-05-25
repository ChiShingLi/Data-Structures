import java.util.HashMap;
import java.util.Map;

public class Trie {
    TrieNode root;

    public class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;

        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        //set current pointer for traversing the tree
        TrieNode current = root;

        //insert & check all character one by one
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            TrieNode node = current.children.get(ch);

            //if the letter doesn't exists
            if (node == null) {

                //create one and link it
                node = new TrieNode();
                current.children.put(ch, node);
            }
            //move on the to next node (newly created one)
            current = node;
        }
        //the word is now completed and is whole string
        current.endOfWord = true;
    }

    public boolean search(String word) {
        //root pointer for navigation
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i); //get letter

            //check if letter exists
            TrieNode node = current.children.get(ch);
            if (node == null) {
                return false;
            } else {
                //move to the next node & check the letter
                current = node;
            }
        }

        //at the end of the loop, return true if endOfWord is true
        if (current.endOfWord == true) {
            return true;
        } else {
            return false;
        }
    }


}
