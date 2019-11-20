package linked;

/**
 * @author liuboren
 * @Title: 链节点
 * @Description:
 * @date 2019/11/20 19:30
 */
public class Link {
    //  保存的数据
    public int data;

    // 指向的下一个链节点
    public Link nextLink;

    public Link(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Link getNextLink() {
        return nextLink;
    }

    public void setNextLink(Link nextLink) {
        this.nextLink = nextLink;
    }
}
