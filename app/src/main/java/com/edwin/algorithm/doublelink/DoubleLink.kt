package com.edwin.algorithm.doublelink

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
    public fun size(): Int {
        return mCount
    }

    /**
     * 判断是否为空
     */
    public fun isEmpty(): Boolean {
        return mCount == 0
    }

    /**
     * 获取第position位置的节点
     * @param position 要获取的节点的位置
     */
    public fun getNode(position: Int): DNode<T>? {
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

    /**
     * 获取第一个位置的节点
     */
    public fun getFirst(): DNode<T>? {
        return getNode(0)
    }

    /**
     * 获取最后一个节点
     */
    public fun getLast(): DNode<T>? {
        return getNode(mCount - 1)
    }

    /**
     * 将节点插入到第index位置之前
     */
    public fun insert(index: Int, value: T) {
        if (index == 0) {
            val node = DNode(value, mHead!!.mPrev, mHead!!.mNext)
            mHead!!.mPrev = node
            mHead!!.mNext = node
            mCount++
            return
        }

        val iNode = getNode(index)
        val tNode = DNode(value, iNode!!.mPrev, iNode)
        iNode.mPrev!!.mNext = tNode
        iNode.mPrev = tNode
        mCount++
        return
    }

    /**
     * 将数据插入第一个位置
     */
    public fun insertFirst(t: T) {
        insert(0, t)
    }

    /**
     * 将节点添加到末尾
     * @param t 数据
     */
    public fun appendLast(t: T) {
        val node = DNode(t, mHead!!.mPrev, mHead)
        mHead!!.mPrev!!.mNext = node
        mHead!!.mPrev = node
        mCount++
    }

    /**
     * 删除index对应位置的节点
     */
    public fun del(index: Int) {
        var node = getNode(index)
        node!!.mPrev!!.mNext = node.mNext
        node!!.mNext!!.mPrev = node.mPrev
        node = null
        mCount--
    }

    /**
     * 删除第一个位置的节点
     */
    public fun deleteFirst() {
        del(0)
    }

    /**
     * 删除最后一个节点
     */
    public fun deleteLast() {
        del(mCount - 1)
    }
}