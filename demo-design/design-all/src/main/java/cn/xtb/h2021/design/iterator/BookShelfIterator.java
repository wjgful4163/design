package cn.xtb.h2021.design.iterator;

/**
 * @Description 遍历书架实现类
 * @Author wjgful
 * @Date 2021/1/23
 */
public class BookShelfIterator implements MyIterator<Book>{
    private BookShelf bookShelf;
    private int index=0;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf=bookShelf;
    }

    /**
     * 判断书架中还有没有下一本书
     * @return true/存在，false/不存在
     */
    @Override
    public boolean hasNext() {
        return this.index< this.bookShelf.getSize();
    }

    /**
     * 返回迭代器当前所指向的值，并且迭代器指向下一本书
     * @return
     */
    @Override
    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}
