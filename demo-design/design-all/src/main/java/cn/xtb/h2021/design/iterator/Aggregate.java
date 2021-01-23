package cn.xtb.h2021.design.iterator;

/**
 * 表示集合接口
 * @author wjgful
 * @date 2021/1/23
 */
public interface Aggregate {
     /**
      * 迭代遍历元素
      * @return
      */
      MyIterator myiterator();
}
