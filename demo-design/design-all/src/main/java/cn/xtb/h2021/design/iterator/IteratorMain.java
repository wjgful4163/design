package cn.xtb.h2021.design.iterator;

import org.assertj.core.util.Lists;

import java.util.Iterator;
import java.util.List;

/**
 * @Description 测试迭代器设计模式的实现
 * @Author wjgful
 * @Date 2021/1/23
 */
public class IteratorMain {
    public static void main(String[] args) {
        System.out.println("自己实现的迭代器模式");
        //自己实现的迭代器模式
        BookShelf bookShelf=new BookShelf(4);
        bookShelf.addBook(new Book("A book"));
        bookShelf.addBook(new Book("B book"));
        bookShelf.addBook(new Book("C book"));
        bookShelf.addBook(new Book("D book"));

        MyIterator myiterator = bookShelf.myiterator();
        while(myiterator.hasNext()){
            Book book = (Book)myiterator.next();
            System.out.println(book.getName());

        }

        System.out.println();
        System.out.println("JDK list集合中的迭代器");

        //JDK list集合中的迭代器
        List<Book> list= Lists.newArrayList();
        list.add(new Book("1-book"));
        list.add(new Book("2-book"));
        list.add(new Book("3-book"));
        list.add(new Book("4-book"));

        Iterator<Book> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }

    }
}
