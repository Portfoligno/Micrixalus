
package object micrixalus {
  type Throwable = java.lang.Throwable
  type Exception = java.lang.Exception
  type Error = java.lang.Error

  type RuntimeException = java.lang.RuntimeException
  type NullPointerException = java.lang.NullPointerException
  type ClassCastException = java.lang.ClassCastException
  type IndexOutOfBoundsException = java.lang.IndexOutOfBoundsException
  type ArrayIndexOutOfBoundsException = java.lang.ArrayIndexOutOfBoundsException
  type UnsupportedOperationException = java.lang.UnsupportedOperationException
  type IllegalArgumentException = java.lang.IllegalArgumentException
  type NoSuchElementException = java.util.NoSuchElementException
  type NumberFormatException = java.lang.NumberFormatException

  type MatchError = scala.MatchError
  type NotImplementedError = scala.NotImplementedError
  type ScalaReflectionException = scala.ScalaReflectionException
  type UninitializedFieldError = scala.UninitializedFieldError


  type Seq[+A] = scala.collection.immutable.Seq[A]
  val Seq = scala.collection.immutable.Seq

  type IndexedSeq[+A] = scala.collection.immutable.IndexedSeq[A]
  val IndexedSeq = scala.collection.immutable.IndexedSeq

  type List[+A] = scala.collection.immutable.List[A]
  val List = scala.collection.immutable.List
  val Nil = scala.collection.immutable.Nil
  type ::[+A] = scala.collection.immutable.::[A]
  val :: = scala.collection.immutable.::
  val +: = scala.collection.+:
  val :+ = scala.collection.:+

  type LazyList[+A] = scala.collection.immutable.LazyList[A]
  val LazyList = scala.collection.immutable.LazyList
  val #:: = scala.collection.immutable.LazyList.#::

  type Vector[+A] = scala.collection.immutable.Vector[A]
  val Vector = scala.collection.immutable.Vector

  type Array[T] = scala.Array[T]
  val Array = scala.Array


  type StringBuilder = scala.collection.mutable.StringBuilder
  val StringBuilder = scala.collection.mutable.StringBuilder

  type Range = scala.collection.immutable.Range
  val Range = scala.collection.immutable.Range

  type Either[+A, +B] = scala.util.Either[A, B]
  val Either = scala.util.Either
  type Left[+A, +B] = scala.util.Left[A, B]
  val Left = scala.util.Left
  type Right[+A, +B] = scala.util.Right[A, B]
  val Right = scala.util.Right

  type Option[+A] = scala.Option[A]
  val Option = scala.Option
  type Some[+A] = scala.Some[A]
  val Some = scala.Some
  type None = scala.None.type
  val None = scala.None


  type <:<[-From, +To] = scala.<:<[From, To]
  type =:=[From, To] = scala.=:=[From, To]
  type DummyImplicit = scala.DummyImplicit
  val DummyImplicit = scala.DummyImplicit
  type ValueOf[T] = scala.ValueOf[T]

  type Any = scala.Any
  type AnyRef = scala.AnyRef
  type AnyVal = scala.AnyVal
  type Nothing = scala.Nothing
  type Null = scala.Null

  type Singleton = scala.Singleton
  type Unit = scala.Unit

  type Boolean = scala.Boolean
  val Boolean = scala.Boolean
  type Byte = scala.Byte
  val Byte = scala.Byte
  type Char = scala.Char
  val Char = scala.Char
  type Double = scala.Double
  val Double = scala.Double
  type Float = scala.Float
  val Float = scala.Float
  type Int = scala.Int
  val Int = scala.Int
  type Long = scala.Long
  val Long = scala.Long
  type Short = scala.Short
  val Short = scala.Short

  val Function = scala.Function
  type PartialFunction[-A, +B] = scala.PartialFunction[A, B]

  type Product = scala.Product

  type Specializable = scala.Specializable
  val Specializable = scala.Specializable

  type StringContext = scala.StringContext
  val StringContext = scala.StringContext

  type Symbol = scala.Symbol
  val Symbol = scala.Symbol


  type deprecated = scala.deprecated
  type deprecatedInheritance = scala.deprecatedInheritance
  type deprecatedName = scala.deprecatedName
  type deprecatedOverriding = scala.deprecatedOverriding

  type inline = scala.inline
  type noinline = scala.noinline

  type native = scala.native
  type specialized = scala.specialized
  type throws[T <: Throwable] = scala.throws[T]
  type transient = scala.transient
  type unchecked = scala.unchecked
  type volatile = scala.volatile
}
