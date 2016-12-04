package com.manib.types

trait Cache[K, V] {
	def get(key: K): V
	def put(key: K, value: V)
	def delete(key: K)
}

class CoolCache extends Cache[String, String] {
	
	var dict: Map[String, String] = Map()
	
	def put(key: String, value: String) = {
		dict += (key -> value)
	}
	
	def get(key: String) = {
		dict(key)
	}
	
	def delete(key: String) {
		dict -= key	
	}
}

object CoolCache {
	
	def main(args: Array[String]): Unit = {
	  val words = Array("A", "B", "C", "D", "E")
	  
	  val obj = new CoolCache
	  
	  for (i <- 1 to words.length) {
	 	  obj.put(i.toString(), words(i-1))
	  }
	  
	  for (i <- 1 to words.length) {
	 	  println(i + " -> " + obj.get(i.toString()))
	  }
	}
}