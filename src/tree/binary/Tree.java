package tree.binary;

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

    public void delete(int deleteData) {
        Node currentNode = root;
        while (true) {
            // 找到删除节点的情况
            if (deleteData == currentNode.sortData) {
                // todo 这里要分被写没有子节点、有一个子节点、有两个子节点的情况
                if (currentNode.rightNode != null) {
                    currentNode = currentNode.leftNode;
                }

            } else if (deleteData < currentNode.sortData) {
                if (currentNode.leftNode != null) {
                    currentNode = currentNode.leftNode;
                } else {
                    System.out.println("删除的节点不存在");
                    break;
                }
            } else {
                if (currentNode.rightNode != null) {
                    currentNode = currentNode.rightNode;
                } else {
                    System.out.println("删除的节点不存在");
                    break;
                }

            }
        }


    }


    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
