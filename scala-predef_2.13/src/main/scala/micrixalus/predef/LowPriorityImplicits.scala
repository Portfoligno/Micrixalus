package micrixalus.predef

import scala._
import scala.collection.{immutable, mutable}

private[predef] abstract class LowPriorityImplicits extends LowPriorityImplicits2 {
  @inline implicit def byteWrapper(x: Byte): runtime.RichByte = new runtime.RichByte(x)
  @inline implicit def shortWrapper(x: Short): runtime.RichShort = new runtime.RichShort(x)
  @inline implicit def intWrapper(x: Int): runtime.RichInt = new runtime.RichInt(x)
  @inline implicit def charWrapper(c: Char): runtime.RichChar = new runtime.RichChar(c)
  @inline implicit def longWrapper(x: Long): runtime.RichLong = new runtime.RichLong(x)
  @inline implicit def floatWrapper(x: Float): runtime.RichFloat = new runtime.RichFloat(x)
  @inline implicit def doubleWrapper(x: Double): runtime.RichDouble = new runtime.RichDouble(x)
  @inline implicit def booleanWrapper(x: Boolean): runtime.RichBoolean = new runtime.RichBoolean(x)

  @inline implicit def genericWrapArray[T](xs: Array[T]): mutable.ArraySeq[T] = Predef.genericWrapArray(xs)
  @inline implicit def wrapRefArray[T <: AnyRef](xs: Array[T]): mutable.ArraySeq.ofRef[T] = Predef.wrapRefArray(xs)

  @inline implicit def wrapIntArray(xs: Array[Int]): mutable.ArraySeq.ofInt = Predef.wrapIntArray(xs)
  @inline implicit def wrapDoubleArray(xs: Array[Double]): mutable.ArraySeq.ofDouble = Predef.wrapDoubleArray(xs)
  @inline implicit def wrapLongArray(xs: Array[Long]): mutable.ArraySeq.ofLong = Predef.wrapLongArray(xs)
  @inline implicit def wrapFloatArray(xs: Array[Float]): mutable.ArraySeq.ofFloat = Predef.wrapFloatArray(xs)
  @inline implicit def wrapCharArray(xs: Array[Char]): mutable.ArraySeq.ofChar = Predef.wrapCharArray(xs)
  @inline implicit def wrapByteArray(xs: Array[Byte]): mutable.ArraySeq.ofByte = Predef.wrapByteArray(xs)
  @inline implicit def wrapShortArray(xs: Array[Short]): mutable.ArraySeq.ofShort = Predef.wrapShortArray(xs)
  @inline implicit def wrapBooleanArray(xs: Array[Boolean]): mutable.ArraySeq.ofBoolean = Predef.wrapBooleanArray(xs)
  @inline implicit def wrapUnitArray(xs: Array[Unit]): mutable.ArraySeq.ofUnit = Predef.wrapUnitArray(xs)

  @inline implicit def wrapString(s: String): immutable.WrappedString = Predef.wrapString(s)
}

private[predef] abstract class LowPriorityImplicits2 {
  @deprecated("Implicit conversions from Array to immutable.IndexedSeq are implemented by copying; Use the more efficient non-copying ArraySeq.unsafeWrapArray or an explicit toIndexedSeq call", "2.13.0")
  implicit def copyArrayToImmutableIndexedSeq[T](xs: Array[T]): IndexedSeq[T] =
    Predef.copyArrayToImmutableIndexedSeq(xs)
}
