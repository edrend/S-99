package com.home

object P1{
	def last[T](l:List[T]):T = {
		l match{
			case h::Nil => h
			case h::t => last(t)
		}
	}
}
object P2{
	def penultimate[T](l:List[T]):T = {
		l match{
			case h::t::Nil => h
			case h::t => penultimate(t)
		}
	}
}
object P3{
	def nth[T](i:Int, l:List[T]):T = {
		l match {
			case h::t if i==0 => h
			case h::t => nth(i-1,t)
		}
	}
}
object P4{
	def length[T](l:List[T]):Int = {
		l match {
			case Nil => 0
			case h::t => 1+length(t)
		}
	}
}
object P5{
	def reverse[T](l:List[T]):List[T] = {
		def rev(l:List[T], r:List[T]):List[T] = {
			l match {
				case Nil => r
				case h::t => rev(t,h::r)
			}
		}
		rev(l,Nil)
	}
}
object P6{
	def isPalindrome[T](l:List[T]):Boolean={
		l == l.reverse
	}
}
object P7{
	def flatten(l:List[Any]):List[Any] = {
		def flat(c:Any, l:List[Any]):List[Any]={
			c match {
				case m:List[Any] => flatten(m):::flatten(l)
				case h=> h::flatten(l)
			}
		}
		l match {
			case h::t => flat(h,t)
			case Nil => Nil
		}
	}
}
object P8{
	def compress[T](l:List[T]):List[T] ={
		def comp(c:Option[T], l:List[T]):List[T]={
			l match {
				case h::t=> 
					if (c.isDefined && c.get == h) 
						comp(c, t) 
					else 
						h::comp(Some(h),t)
				case Nil =>Nil
			}
		}
		comp(None,l)
	}	
	def compress2[T](l:List[T]):List[T] ={
		l match {
			case a::b::t=>  if (a == b) compress(a::t) else compress(a::b::t) 
			case Nil =>Nil
		}
	}	
}
object P9{
	def pack[T](l:List[T]):List[List[T]] ={
		l match{
			case a::b::t => 
				if (a==b) {
					val r = pack(a::t)
					(a::r.head)::r.tail
				}
				else List(a)::pack(b::t)
			case a::Nil => List(List(a))
			case Nil=>Nil
		}
	}
}
object P10{
  def encode[T](l:List[T]):List[(Int, T)]={
    val packed = P9.pack(l)
    packed.map(e=>(e.length,e(0)))
  }
}
object P11{
  def encodeModified[T](l:List[T]):List[Any] = {
    P9.pack(l).map(e=>{
    if(e.length>1)
      (e.length,e(0))
    else
      e(0)
    })
  }
}