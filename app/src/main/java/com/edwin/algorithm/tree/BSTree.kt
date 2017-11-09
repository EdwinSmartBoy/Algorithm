package com.edwin.algorithm.tree

/**
 * 创建者    edwin
 * 创建时间  2017/11/9
 * 描述      二叉树
 *
 * <p>
 * 更新者      edwin
 * 更新时间    ${TODO}
 * 更新描述    ${TODO}
 */

class BSTree<T : Comparable<T>> {

    /**
     * 前序遍历
     */
    fun preOrder(tree: BSNode<T>?) {
        tree?.let {
            print("${tree.key} ")
            preOrder(tree.left)
            preOrder(tree.right)
        } ?: print("当前二叉树为空!")
    }

    /**
     * 中序遍历
     */
    fun inOrder(tree: BSNode<T>?) {
        tree?.let {
            inOrder(tree.left)
            print("${tree.key} ")
            inOrder(tree.right)
        } ?: print("当前二叉树为空!")
    }

    /**
     * 后序遍历
     */
    fun postOrder(tree: BSNode<T>?) {
        tree?.let {
            postOrder(tree.left)
            postOrder(tree.right)
            print("${tree.key} ")
        } ?: print("当前二叉树为空!")
    }

    /**
     * 二叉查找树查找节点   递归版
     */
    fun search(x: BSNode<T>?, key: T): BSNode<T>? {

        if (x == null) {
            return x
        }

        x.let {
            val cmp = key.compareTo(x.key)
            return when {
                cmp < 0 -> {
                    search(x.left, key)
                }
                cmp > 0 -> {
                    search(x.right, key)
                }
                else -> {
                    x
                }
            }
        }
    }

    /**
     * 二叉查找树找节点 非递归版
     */
    fun search1(node: BSNode<T>?, key: T): BSNode<T>? {
        var no: BSNode<T>? = node
        while (no != null) {
            val cmp = key.compareTo(no.key)
            no = when {
                cmp < 0 -> no.left
                cmp > 0 -> no.right
                else -> return no
            }
        }
        return no
    }

    /**
     * 获取二叉查找树最大值的节点
     * @param tree 某个节点
     */
    fun maximum(tree: BSNode<T>?): BSNode<T>? {
        var node = tree
        if (node == null) {
            return null
        }
        while (node!!.right != null) {
            node = node.right
        }
        return node
    }

    /**
     * 查找最小结点：返回tree为根结点的二叉树的最小结点。
     */
    fun minimum(tree: BSNode<T>?): BSNode<T>? {
        var node = tree
        if (node == null) {
            return null
        }
        while (node!!.left != null) {
            node = node.left
        }
        return node
    }
}