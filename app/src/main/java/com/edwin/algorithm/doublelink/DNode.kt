package com.edwin.algorithm.doublelink

/**
 * 创建者    edwin
 * 创建时间  2017/11/7
 * 描述      双链表节点
 *
 * <p>
 * 更新者      edwin
 * 更新时间    ${TODO}
 * 更新描述    ${TODO}
 */

class DNode<T>(value: T?, prev: DNode<T>?, next: DNode<T>?) {

/**
 * 当前节点的上一个节点
 */
var mPrev: DNode<T>? = prev

/**
 * 当前节点的下一个节点
 */
var mNext: DNode<T>? = next

/**
 * 节点值
 */
var mValue: T? = value

}