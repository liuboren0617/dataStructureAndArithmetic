package tree.binary;

/**
 * @author liuboren
 * @Title: 节点类
 * @Description:
 * @date 2019/11/28 9:33
 */
public class Node {
    // 用来进行排序的关键字数组
    int sortData ;

    // 其他类型的数据
    int other;

    // 该节点的左子节点
    Node leftNode;

    // 该节点的右子节点
    Node rightNode;

    public static void main(String[] args) {
        Node node = new Node();
        System.out.println("node.leftNode = " + node.leftNode);
        System.out.println(node.leftNode);
    }



}
