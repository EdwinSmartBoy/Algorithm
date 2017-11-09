package com.edwin.algorithm.queue

/**
 * 创建者    edwin
 * 创建时间  2017/11/9
 * 描述      队列 特点 先进先出
 *
 * <p>
 * 更新者      edwin
 * 更新时间    ${TODO}
 * 更新描述    ${TODO}
 */

class ArrayQueue(size: Int) {

    var mArray: Array<Int?> = arrayOfNulls(size)
    var mCount: Int = 0

    /**
     * @param value 添加数据到队列中
     */
    fun add(value: Int) {
        mArray[mCount++] = value
    }

    /**
     * 获取第一个值
     */
    fun front(): Int? {
        return mArray[0]
    }

    /**
     * 获取队首元素,并将该元素从队列中删除
     */
    fun pop(): Int? {
        //获取队首元素
        val ret = mArray[0]
        //移除元素
        mCount--
        //调整当前队列中的元素位置
        for (index in 1..mCount) {
            mArray[index - 1] = mArray[index]
        }
        return ret
    }

    /**
     * 获取栈长度
     */
    fun size(): Int {
        return mCount
    }

    /**
     * 栈是否为空
     */
    fun isEmpty(): Boolean {
        return mCount == 0
    }
}