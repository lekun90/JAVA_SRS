import java.util.Stack;
import javax.swing.tree.TreeNode;

public class Zadanie_3 {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.push(root.left);
        s2.push(root.right);
        while (!s1.isEmpty() && !s2.isEmpty()) {
            TreeNode node1 = s1.pop();
            TreeNode node2 = s2.pop();
            if (node1 == null && node2 == null) {
                continue;
            }
            else if (node1 == null || node2 == null) {
                return false;
            }
            else if (node1.val != node2.val) {
                return false;
            }
            s1.push(node1.left);
            s2.push(node2.right);
            s1.push(node1.right);
            s2.push(node2.left);
        }
        return true;
    }


}
