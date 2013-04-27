package com.home

import org.junit.Test
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import org.scalatest.junit.JUnitSuite

class SolutionTest extends JUnitSuite {
	@Test
	def lastTest(){
		assertEquals(8, P1.last(List(1, 1, 2, 3, 5, 8)))
	}
	@Test
	def lastButLast(){
		assertEquals(5, P2.penultimate(List(1, 1, 2, 3, 5, 8)))
	}
	@Test
	def nth(){
		assertEquals (2, P3.nth(2, List(1, 1, 2, 3, 5, 8)))
	}
	@Test
	def length(){
		assertEquals (6, P4.length(List(1, 1, 2, 3, 5, 8)))
	}
	@Test
	def reverse(){
		assertEquals (List(8, 5, 3, 2, 1, 1), P5.reverse(List(1, 1, 2, 3, 5, 8)))
	}
	@Test
	def isPalindrome(){
		assertTrue(P6.isPalindrome(List(1, 2, 3, 2, 1)))
	}
	@Test
	def flatten(){
		assertEquals(List(1, 1, 2, 3, 5, 8), P7.flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
	}
	@Test
	def compress(){
		assertEquals(List('a, 'b, 'c, 'a, 'd, 'e), P8.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
	}
	@Test
	def pack(){
		 assertEquals( List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)),
				 P9.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
	}
  @Test
  def runLengthEncodig() {
    assertEquals(
      P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)),
      List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  }
  @Test
  def encodeModified(){
    assertEquals(
      List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)),
      P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}