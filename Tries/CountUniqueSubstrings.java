public class CountUniqueSubstrings {
    static class Node {
        Node[] children = new Node[26];

        public Node() {
            for (int i = 0 ; i < 26 ; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        int level = 0;
        int len = word.length();
        int idx = 0;

        Node curr = root;
        for (; level < len ; level++) {
            idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
    }

    public static int countNodes(Node root) {    // O (N) N = no. of nodes;
        if (root == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0 ; i < 26 ; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }

        return count + 1;
    }

    public static void main(String[] args) {
        String str = "ababa";
        
        // step 1 : find suffix and insert in Trie
        for (int i = 0 ; i < str.length() ; i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countNodes(root));
    }
}
