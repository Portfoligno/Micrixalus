
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
  @inline def Seq = scala.collection.immutable.Seq

  type IndexedSeq[+A] = scala.collection.immutable.IndexedSeq[A]
  @inline def IndexedSeq = scala.collection.immutable.IndexedSeq

  type List[+A] = scala.collection.immutable.List[A]
  @inline def List = scala.collection.immutable.List
  @inline def Nil = scala.collection.immutable.Nil
  type ::[A] = scala.collection.immutable.::[A]
  @inline def :: = scala.collection.immutable.::
  @inline def +: = scala.collection.+:
  @inline def :+ = scala.collection.:+

  type LazyList[+A] = scala.collection.immutable.LazyList[A]
  @inline def LazyList = scala.collection.immutable.LazyList
  @inline def #:: = scala.collection.immutable.LazyList.#::

  type Vector[+A] = scala.collection.immutable.Vector[A]
  @inline def Vector = scala.collection.immutable.Vector

  type Array[T] = scala.Array[T]
  @inline def Array = scala.Array


  type StringBuilder = scala.collection.mutable.StringBuilder
  @inline def StringBuilder = scala.collection.mutable.StringBuilder

  type Range = scala.collection.immutable.Range
  @inline def Range = scala.collection.immutable.Range

  type Either[+A, +B] = scala.util.Either[A, B]
  @inline def Either = scala.util.Either
  type Left[+A, +B] = scala.util.Left[A, B]
  @inline def Left = scala.util.Left
  type Right[+A, +B] = scala.util.Right[A, B]
  @inline def Right = scala.util.Right

  type Option[+A] = scala.Option[A]
  @inline def Option = scala.Option
  type Some[+A] = scala.Some[A]
  @inline def Some = scala.Some
  type None = scala.None.type
  @inline def None = scala.None


  type <:<[-From, +To] = scala.<:<[From, To]
  type =:=[From, To] = scala.=:=[From, To]
  type DummyImplicit = scala.DummyImplicit
  @inline def DummyImplicit = scala.DummyImplicit
  type ValueOf[T] = scala.ValueOf[T]

  type Any = scala.Any
  type AnyRef = scala.AnyRef
  type AnyVal = scala.AnyVal
  type Nothing = scala.Nothing

  type Singleton = scala.Singleton
  type Unit = scala.Unit

  type Boolean = scala.Boolean
  @inline def Boolean = scala.Boolean
  type Byte = scala.Byte
  @inline def Byte = scala.Byte
  type Char = scala.Char
  @inline def Char = scala.Char
  type Double = scala.Double
  @inline def Double = scala.Double
  type Float = scala.Float
  @inline def Float = scala.Float
  type Int = scala.Int
  @inline def Int = scala.Int
  type Long = scala.Long
  @inline def Long = scala.Long
  type Short = scala.Short
  @inline def Short = scala.Short

  @inline def Function = scala.Function
  type PartialFunction[-A, +B] = scala.PartialFunction[A, B]

  type Product = scala.Product

  type Specializable = scala.Specializable
  @inline def Specializable = scala.Specializable

  type StringContext = scala.StringContext
  @inline def StringContext = scala.StringContext

  type Symbol = scala.Symbol
  @inline def Symbol = scala.Symbol


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
