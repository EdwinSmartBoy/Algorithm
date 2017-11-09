package com.edwin.algorithm.tree

/**
 * 创建者    edwin
 * 创建时间  2017/11/9
 * 描述      ${TODO}
 *
 * <p>
 * 更新者      edwin
 * 更新时间    ${TODO}
 * 更新描述    ${TODO}
 */

data class BSNode<T : Comparable<T>>(var key: T                 // 关键字(键值)
                                , var parent: BSNode<T>    // 父结点
                                , var left: BSNode<T>      // 左孩子
                                , var right: BSNode<T>)    // 右孩子