
public class LowestCommonAncestor2 {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node LCA2(Node root, int n1, int n2) {
    
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftlca = LCA2(root.left, n1, n2);
        Node rightlca = LCA2(root.right, n1, n2);

        // leftLCA = val, rightLCA = null
        if (rightlca == null) {
            return leftlca;
        }

        // leftLCA = null, rightLCA = val
        if (leftlca == null) {
            return rightlca;
        }

        return root;
    }
    public static void main(String[] args) {
        /*
                            1
                           / \
                          2   3
                         / \ / \
                        4  5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 2, n2 = 3;
        System.out.println("Lowest Common Ancestor : " + LCA2(root, n1, n2).data);
    }
}

// Approach 2:
// Time Complexity: O(n), Space Complexity: O(1) -> No auxilary space needed