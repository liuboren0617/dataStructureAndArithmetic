package linked;

/**
 * @author liuboren
 * @Title: 链表类
 * @Description:
 * @date 2019/11/20 19:31
 */
public class LinkList {
    private Link first;
    private Link last;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    // 新增链节点方法
    public void insertFirst(int data) {
        Link newLink = new Link(data);
        newLink.setNextLink(first);
        if (isEmpty()) {
            last = newLink;
        }
        first = newLink;

    }
}
