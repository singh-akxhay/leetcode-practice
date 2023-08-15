package com.singhakxhay.leetcode.easy.palindrome

class Solution {
  fun isPalindrome(x: Int): Boolean {
    // If number is negative then it cannot be palindrome
    if (x < 0) {
      return false
    }

    // If number is btw 0-9 then is it palindrome
    if (x < 10) {
      return true
    }

    // If number is 2-digit or more
    val numString = x.toString()
    return numString == numString.reversed()
  }
}
