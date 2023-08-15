package com.singhakxhay.leetcode.easy.palindrome

class Solution {
  fun isPalindrome(x: Int): Boolean {
    if (x < 0 || x != 0 && x % 10 == 0) {
      return false
    }

    var y = 0
    var xCopy = x
    while (y < xCopy) {
      y = (xCopy % 10) + (y * 10)
      xCopy /= 10
    }

    return (y == xCopy) || (y / 10 == xCopy)
  }
}
