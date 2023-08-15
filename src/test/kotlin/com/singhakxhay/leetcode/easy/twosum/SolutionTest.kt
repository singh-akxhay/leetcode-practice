package com.singhakxhay.leetcode.easy.twosum

import Solution
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
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    val result = solution.twoSum(nums, target)
    val expected = intArrayOf(0, 1)

    assert(result.contentEquals(expected))
  }

  @Test
  fun testCase2() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = -3

    val result = solution.twoSum(nums, target)
    val expected = intArrayOf()

    assert(result.contentEquals(expected))
  }
}