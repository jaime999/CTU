package lab2

object ObjSetEmpty extends ObjSet {
  def contains(e: Int): Boolean = false
  def including(e: Int): ObjSet = null
  def excluding(e: Int): ObjSet = null
  def union(s: ObjSet): ObjSet = null
  def intersection(s: ObjSet): ObjSet = null
  def diff(s: ObjSet): ObjSet = null
  def filter(p: Int => Boolean): ObjSet = null
  def map(f: Int => Int): ObjSet = null
  def forall(p: Int => Boolean): Boolean = false
  def foreach(f: Int => Unit): Unit = null
}

/*class ObjSetNode(val e: Int, left: ObjSet, right: ObjSet) extends ObjSet {

}*/

