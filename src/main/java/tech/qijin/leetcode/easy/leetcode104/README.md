LeetCode104. [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

### 题目分析
这道题非常简单，是个典型的DP问题。

将root节点去掉后，会发现原来root节点的左右两个子节点分别成了独立的子树。

整个root的深度 = max(root左子树的深度, root右子树的深度) + 1

左右两个子树的深度求解与root一模一样。

这种情况就非常适合使用递归算法。

### 解答

递归

循环