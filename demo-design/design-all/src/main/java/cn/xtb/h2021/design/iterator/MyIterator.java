package cn.xtb.h2021.design.iterator;

/**
 * 表示遍历集合的接口
 *
 * @author wjgful
 * @param <T>
 */
public interface MyIterator<T> {
    /**
     * 判断是否有下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 返回集合中的元素，并且后移动一个位置
     *
     * @return
     */
    T next();
}
