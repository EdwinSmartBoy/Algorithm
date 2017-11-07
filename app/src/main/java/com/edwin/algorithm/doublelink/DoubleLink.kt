package com.edwin.algorithm.doublelink

/**
 * 创建者    edwin
 * 创建时间  2017/11/7
 * 描述      双链表
 *
 *
 * 更新者      edwin
 * 更新时间    ${TODO}
 * 更新描述    ${TODO}
 */


class DoubleLink<T> {

    // 表头
    var mHead: DNode<T>? = null
    // 节点个数
    var mCount: Int? = 0

    constructor() {
        // 创建“表头”。注意：表头没有存储数据！
        mHead = DNode(null, null, null)
        mHead!!.prev = mHead
        mHead!!.next = mHead
        // 初始化“节点个数”为0
        mCount = 0
    }
}
