public class Main {
    public static void main(String[] args) {
        Trie myTrie = new Trie();


        myTrie.insert("hello");

        System.out.println("'abc' exists? " + myTrie.search("abc"));
        System.out.println("'hello' exists? " + myTrie.search("hello"));

    }

}
