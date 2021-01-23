package cn.xtb.h2021.design.iterator;

/**
 * @Description 书架，实现集合接口
 * @Author wjgful
 * @Date 2021/1/23
 */
public class BookShelf implements Aggregate{
    private Book[] books;
    private int last=0;
    private final static int DEFAULT_INITIAL_SIZE=8;

    public BookShelf(){
        this.books=new Book[DEFAULT_INITIAL_SIZE];
    }

    public BookShelf(int initialSize){
        this.books=new Book[initialSize];
    }

    public Book getBookAt(int index){
        return this.books[index];
    }

    public void addBook(Book book){
        this.books[last++]=book;
        //last++;
    }

    public int getSize(){
        return last;
    }


    @Override
    public MyIterator myiterator() {
        return new BookShelfIterator(this);
    }
}
