package verifyavl;

public class VerifyAVL {
    public static boolean verifyAVL(AVLNode root) {

        if (root == null) {
            return true;
        }


        if (root.left != null && root.left.key >= root.key) {
            return false;
        }

        if (root.right != null && root.right.key <= root.key) {
            return false;
        }


        int balanceFactor = height(root.left) - height(root.right);

        if (balanceFactor > 1 || balanceFactor < -1) {
            return false;
        }


        if (root.height != 1 + Math.max(height(root.left), height(root.right))) {
            return false;
        }


        return verifyAVL(root.left) && verifyAVL(root.right);
    }

    private static int height(AVLNode node) {
        return node == null ? -1 : node.height;
    }


}
