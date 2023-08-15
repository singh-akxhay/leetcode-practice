package com.singhakxhay.leetcode.easy.palindrome

import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

class SolutionTest {
  private lateinit var solution: Solution

  @BeforeTest
  fun init() {
    solution = Solution()
  }

  @Test
  fun testCase1() {
    val num = 121

    val result = solution.isPalindrome(num)
    val expected = true

    assert(result == expected)
  }

}
