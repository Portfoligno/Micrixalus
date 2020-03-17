package micrixalus

import scala._
import scala.collection.{ArrayOps, IndexedSeq, StringOps, immutable}

package object predef extends predef.LowPriorityImplicits {
  //@inline def classOf[T] = Predef.classOf[T] // Does not work
  @inline def valueOf[T](implicit vt: ValueOf[T]): T = vt.value
  type String = java.lang.String
  type Class[T] = java.lang.Class[T]

  type Function[-A, +B] = A => B
  type Map[K, +V] = immutable.Map[K, V]
  type Set[A] = immutable.Set[A]
  @inline def Map = immutable.Map
  @inline def Set = immutable.Set
  @inline def -> = Tuple2

  type OptManifest[T] = reflect.OptManifest[T]
  type Manifest[T] = reflect.Manifest[T]
  @inline def Manifest = reflect.Manifest
  @inline def NoManifest = reflect.NoManifest
  @inline def manifest[T](implicit m: Manifest[T]): Manifest[T] = m
  @inline def optManifest[T](implicit m: OptManifest[T]): OptManifest[T] = m

  @inline def identity[A](x: A): A = x
  @inline def implicitly[T](implicit e: T): T = e
  @inline def locally[T](@deprecatedName("x") x: T): T = x
  @inline def ??? : Nothing = throw new NotImplementedError

  @inline implicit def micrixalusArrowAssoc[A](self: A): Predef.ArrowAssoc[A] =
    new Predef.ArrowAssoc(self)
  @inline implicit def micrixalusSeqCharSequence(sequenceOfChars: IndexedSeq[Char]): Predef.SeqCharSequence =
    new Predef.SeqCharSequence(sequenceOfChars)
  @inline implicit def micrixalusArrayCharSequence(arrayOfChars: Array[Char]): Predef.ArrayCharSequence =
    new Predef.ArrayCharSequence(arrayOfChars)
  @inline implicit def augmentString(x: String): StringOps =
    new StringOps(x)

  @inline def print(x: Any): Unit = Console.print(x)
  @inline def println(): Unit = Console.println()
  @inline def println(x: Any): Unit = Console.println(x)

  @inline implicit def genericArrayOps[T](xs: Array[T]): ArrayOps[T] = new ArrayOps(xs)
  @inline implicit def booleanArrayOps(xs: Array[Boolean]): ArrayOps[Boolean] = new ArrayOps(xs)
  @inline implicit def byteArrayOps(xs: Array[Byte]): ArrayOps[Byte] = new ArrayOps(xs)
  @inline implicit def charArrayOps(xs: Array[Char]): ArrayOps[Char] = new ArrayOps(xs)
  @inline implicit def doubleArrayOps(xs: Array[Double]): ArrayOps[Double] = new ArrayOps(xs)
  @inline implicit def floatArrayOps(xs: Array[Float]): ArrayOps[Float] = new ArrayOps(xs)
  @inline implicit def intArrayOps(xs: Array[Int]): ArrayOps[Int] = new ArrayOps(xs)
  @inline implicit def longArrayOps(xs: Array[Long]): ArrayOps[Long] = new ArrayOps(xs)
  @inline implicit def refArrayOps[T <: AnyRef](xs: Array[T]): ArrayOps[T] = new ArrayOps(xs)
  @inline implicit def shortArrayOps(xs: Array[Short]): ArrayOps[Short] = new ArrayOps(xs)
  @inline implicit def unitArrayOps(xs: Array[Unit]): ArrayOps[Unit] = new ArrayOps(xs)

  @inline implicit def byte2Byte(x: Byte): java.lang.Byte = x.asInstanceOf[java.lang.Byte]
  @inline implicit def short2Short(x: Short): java.lang.Short = x.asInstanceOf[java.lang.Short]
  @inline implicit def char2Character(x: Char): java.lang.Character = x.asInstanceOf[java.lang.Character]
  @inline implicit def int2Integer(x: Int): java.lang.Integer = x.asInstanceOf[java.lang.Integer]
  @inline implicit def long2Long(x: Long): java.lang.Long = x.asInstanceOf[java.lang.Long]
  @inline implicit def float2Float(x: Float): java.lang.Float = x.asInstanceOf[java.lang.Float]
  @inline implicit def double2Double(x: Double): java.lang.Double = x.asInstanceOf[java.lang.Double]
  @inline implicit def boolean2Boolean(x: Boolean): java.lang.Boolean = x.asInstanceOf[java.lang.Boolean]
  @inline implicit def Byte2byte(x: java.lang.Byte): Byte = x.asInstanceOf[Byte]
  @inline implicit def Short2short(x: java.lang.Short): Short = x.asInstanceOf[Short]
  @inline implicit def Character2char(x: java.lang.Character): Char = x.asInstanceOf[Char]
  @inline implicit def Integer2int(x: java.lang.Integer): Int = x.asInstanceOf[Int]
  @inline implicit def Long2long(x: java.lang.Long): Long = x.asInstanceOf[Long]
  @inline implicit def Float2float(x: java.lang.Float): Float = x.asInstanceOf[Float]
  @inline implicit def Double2double(x: java.lang.Double): Double = x.asInstanceOf[Double]
  @inline implicit def Boolean2boolean(x: java.lang.Boolean): Boolean = x.asInstanceOf[Boolean]

  @inline implicit def $conforms[A]: A => A = <:<.refl
}
