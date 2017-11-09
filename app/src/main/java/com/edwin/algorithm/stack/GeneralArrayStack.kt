package com.edwin.algorithm.stack

/**
 * 创建者    edwin
 * 创建时间  2017/11/8
 * 描述      栈 特点 先进后出
 *
 * <p>
 * 更新者      edwin
 * 更新时间    ${TODO}
 * 更新描述    ${TODO}
 */

class GeneralArrayStack<T> {

    private var mCount: Int = 0
    private var mArray: Array<Int?>

    companion object {
        private val DEFAULT_SIZE = 12
    }

    /**
     * 默认构造方法
     */
    constructor() : this(DEFAULT_SIZE) {

    }

    /**
     * 用户可传入栈长度
     */
    constructor(size: Int) {
        mCount = 0
        mArray = arrayOfNulls(size)
    }

    /**
     * 将数据压入栈中
     * @param value 数值
     */
    fun push(value: Int) {
        mArray[mCount++] = value
    }

    /**
     * 返回栈顶元素
     */
    fun peek(): Int? {
        return mArray[mCount - 1]
    }

    /**
     * 获取栈顶元素 并将栈顶元素删除
     */
    fun pop(): Int? {
        val value = mArray[mCount - 1]
        mCount--
        return value
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

    /**
     * 输出栈中的内容
     */
    fun printArrayStack() {
        if (isEmpty()) {
            print("Stack is Empty!")
        }
        print("Stack size = " + size())
        for (index in mCount - 1..0) {
            print("Stack[$index] = ${mArray[index]}")
        }
    }

}