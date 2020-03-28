/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;
    private ArrayList<Integer> arrayList;

    public MyBinarySearchTree() {
        arrayList = new ArrayList<>();
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }


}
