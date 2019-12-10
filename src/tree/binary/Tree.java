package src.tree.binary;

/**
 * @author liuboren
 * @Title: 二叉搜索树类
 * @Description:
 * @date 2019/11/28 9:38
 */
public class Tree {
    // 根节点
    Node root;

    public Tree(Node root) {
        this.root = root;
    }

    /*新增数据*/
    public void insertData(Node node) {
        int currentSortData = root.sortData;
        Node currentNode = root;
        Node currentLeftNode = root.leftNode;
        Node currentRightNode = root.rightNode;
        int insertSortData = node.sortData;
        while (true) {
            if (insertSortData < currentSortData) {
                if (currentLeftNode == null) {
                    currentNode.leftNode = node;
                    break;
                } else {
                    currentNode = currentNode.leftNode;
                    currentSortData = currentNode.sortData;
                }
            } else {
                if (currentRightNode == null) {
                    currentNode.rightNode = node;
                    break;
                } else {
                    currentNode = currentNode.rightNode;
                    currentSortData = currentNode.sortData;
                }
            }

        }
        System.out.println("root = " + root);
    }


    public void query(int sortData) {
        Node currentNode = root;
        while (true) {
            if (sortData != currentNode.sortData) {
                if (sortData < currentNode.sortData) {
                    if (currentNode.leftNode != null) {
                        currentNode = currentNode.leftNode;
                    } else {
                        System.out.println("对不起没有查询到数据");
                    }
                } else {
                    if (currentNode.rightNode != null) {
                        currentNode = currentNode.rightNode;
                    } else {
                        System.out.println("对不起没有查询到数据");
                    }
                }
            } else {
                System.out.println("二叉树中有该数据");
            }
        }
    }

    public boolean delete(int deleteData) {
        Node curr = root;
        Node parent = root;
        boolean isLeft = true;
        while (deleteData != curr.sortData) {
            if (deleteData <= curr.sortData) {
                isLeft = true;
                if (curr.leftNode != null) {
                    parent = curr;
                    curr = curr.leftNode;
                }
            } else {
                isLeft = false;
                if (curr.rightNode != null) {
                    parent = curr;
                    curr = curr.rightNode;
                }
            }
            if (curr == null) {
                return false;
            }
        }
        // 删除节点没有子节点的情况
        if (curr.leftNode == null && curr.rightNode == null) {
            if (curr == root) {
                root = null;
            } else if (isLeft) {
                parent.leftNode = null;
            } else {
                parent.rightNode = null;
            }
            //删除节点只有左节点
        } else if (curr.rightNode == null) {
            if (curr == root) {
                root = root.leftNode;
            } else if (isLeft) {
                parent.leftNode = curr.leftNode;
            } else {
                parent.rightNode = curr.leftNode;
            }
            //如果被删除节点只有右节点
        } else if (curr.leftNode == null) {
            if (curr == root) {
                root = root.rightNode;
            } else if (isLeft) {
                parent.leftNode = curr.rightNode;
            } else {
                parent.rightNode = curr.rightNode;
            }
        } else {
            Node successor = getSuccessor(curr);
            if (curr == root) {
                root = successor;
            } else if (curr == parent.leftNode) {
                parent.leftNode = successor;
            } else {
                parent.rightNode = successor;
            }
            successor.leftNode = curr.leftNode;
        }
        return true;

    }

    public Node getSuccessor(Node delNode) {
        Node curr = delNode.rightNode;
        Node successor = curr;
        Node sucParent = null;
        while (curr != null) {
            sucParent = successor;
            successor = curr;
            curr = curr.leftNode;
        }
        if (successor != delNode.rightNode) {
            sucParent.leftNode = successor.rightNode;
            successor.rightNode = delNode.rightNode;
        }
        return successor;
    }


    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
