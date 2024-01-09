# leetcode_jan09
LEETCODE PROBLEMS
## Q1 Leaf Similar Trees
Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
<img width="344" alt="image" src="https://github.com/Poorvaahuja/leetcode_jan09/assets/122693422/7894a38a-0a98-4fe2-aba8-2d7f3366c494">

For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
Two binary trees are considered leaf-similar if their leaf value sequence is the same.
Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
<img width="454" alt="image" src="https://github.com/Poorvaahuja/leetcode_jan09/assets/122693422/9a41420f-14ad-4878-8f32-12ea962f114f">

## Q2 
You are given an integer matrix isWater of size m x n that represents a map of land and water cells.
If isWater[i][j] == 0, cell (i, j) is a land cell.
If isWater[i][j] == 1, cell (i, j) is a water cell.
You must assign each cell a height in a way that follows these rules:
The height of each cell must be non-negative.
If the cell is a water cell, its height must be 0.
Any two adjacent cells must have an absolute height difference of at most 1. A cell is adjacent to another cell if the former is directly north, east, south, or west of the latter (i.e., their sides are touching).
Find an assignment of heights such that the maximum height in the matrix is maximized.
Return an integer matrix height of size m x n where height[i][j] is cell (i, j)'s height. If there are multiple solutions, return any of them.
<img width="460" alt="image" src="https://github.com/Poorvaahuja/leetcode_jan09/assets/122693422/e2815741-f880-40e9-8b12-a97a3fcd2e53">
