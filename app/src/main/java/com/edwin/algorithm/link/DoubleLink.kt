package com.edwin.algorithm.link

/**
 * 创建者    edwin
 * 创建时间  2017/11/7
 * 描述      双链表
 *
 * <p>
 * 更新者      edwin
 * 更新时间    ${TODO}
 * 更新描述    ${TODO}
 */

class DoubleLink<T> {

    /**
     * 表头
     */
    var mHead: DNode<T>? = null

    /**
     * 链表中的个数
     */
    var mCount: Int = 0

    /**
     * 直接初始化当前对象
     */
    init {
        mHead = DNode(null, null, null)
        mHead!!.mPrev = mHead
        mHead!!.mNext = mHead
        mCount = 0
    }

    /**
     * 获取链表长度
     */
    fun size(): Int {
        return mCount
    }

    /**
     * 判断是否为空
     */
    fun isEmpty(): Boolean {
        return mCount == 0
    }

    /**
     * 获取第position位置的节点
     */
    fun getNode(position: Int): DNode<T>? {
        if (mCount < 0 || position > mCount) {
            throw IndexOutOfBoundsException("您输入的位置不存在")
        }

        //正向查找
        if (position <= mCount / 2) {
            var node = mHead!!.mNext
            for (index: Int in 0 until position) {
                node = node!!.mNext
            }
            return node
        }

        //反向查找
        var node = mHead!!.mPrev
        val rIndex = mCount - position - 1
        for (index: Int in 0 until rIndex) {
            node = node!!.mPrev
        }
        return node
    }


}