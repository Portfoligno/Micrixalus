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
  val Map = immutable.Map
  val Set = immutable.Set
  val -> = Tuple2

  type OptManifest[T] = reflect.OptManifest[T]
  type Manifest[T] = reflect.Manifest[T]
  val Manifest = reflect.Manifest
  val NoManifest = reflect.NoManifest
  @inline def manifest[T](implicit m: Manifest[T]): Manifest[T] = m
  @inline def optManifest[T](implicit m: OptManifest[T]): OptManifest[T] = m

  @inline def identity[A](x: A): A = x
  @inline def implicitly[T](implicit e: T): T = e
  @inline def locally[T](@deprecatedName("x") x: T): T = x
  @inline def ??? : Nothing = throw new NotImplementedError

  @inline implicit def micrixalusArrowAssoc[A](self: A): Predef.ArrowAssoc[A] =
    new Predef.ArrowAssoc(self)
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

  @inline implicit def $conforms[A]: A => A = <:<.refl
}
