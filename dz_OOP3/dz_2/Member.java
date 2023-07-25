package dz_OOP3.dz_2;

public class Member {

    Object Cat;
    private Member next;
    private Member previous;

    public Member(Object Cat) {
        this.Cat = Cat;
    }

    public Object getCat() {
        return Cat;
    }

    public void setData(String Cat) {
        this.Cat = Cat;
    }

    public Member getNext() {
        return next;
    }

    void setNext(Member member){
        next = member;
    }

    void setPrevious(Member member){
        previous = member;
    }

    public Member getPrevious() {
        return previous;
    }
}
