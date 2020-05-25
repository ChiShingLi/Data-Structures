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

 


}
