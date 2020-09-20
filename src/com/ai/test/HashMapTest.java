package com.ai.test;

import java.util.HashMap;

/**
 * 笔记
 * 桶
 * 红黑树
 *   1. 又叫平衡二叉树；
 *   2. 最长路径不能超过最短路径的 2 倍；
 *   3. 每一条搜索路径里面必须要保证相同的黑色节点；
 *   4. 任何一条路径里面不能存在两个相同（连续）的红色节点；
 *   5. 所有的节点全部是黑色或者全部是红色，所有的叶子节点都是黑色的；
 *
 * 初始容量为 2 的 n 次幂：原因是为了扩容之后元素整体的移动
 */
/**
 *
 * @Description: 描述
 * @Author: qiaodong
 * @Date: 2020/9/19 13:07
 */
public class HashMapTest {

    public static void main(String[] args) {
        // 这里并没有创建出数组
        HashMap hashMap = new HashMap();
        // 第一次 put 会初始化
        hashMap.put(1, "1");
        // put 的 key 相同将覆盖原来的值
        hashMap.put(1, "2");
        // 插入一个 key 为 17，因为数组容量刚好是 16，所以这里测试一下 17
        hashMap.put(17, "2");
        System.out.println(hashMap);
    }

}
