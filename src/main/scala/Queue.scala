case class Queue[T](in: List[T], out: List[T]){
  /**
   * Ajout un élément `x` en tête.
   *
   * @param x l'élément à ajouter
   * @return la nouvelle queue
   */
  def enqueue(x: T): Queue[T] = Queue(x :: in, out)

  /**
   * Retire le dernier élément.
   *
   * @return un tuple (élément retiré, nouvelle queue)
   */
  def dequeue(): (T, Queue[T]) = out match{
    case x :: xs => (x, Queue(in, xs))
    case Nil => in.reverse match{
      case x :: xs => (x, Queue(Nil, xs))
      //la cas ou La queue est déjà vide
      case Nil => throw new Exception("La queue est déjà vide") // comportement non défini ?
    }

  }

  def dequeueTotal(): (Option[T], Queue[T]) = this match {
    case Queue(Nil, Nil) => (None, this)
    case Queue(i, Nil) => (Some(i.reverse.head), Queue(Nil, i.reverse.tail))
    case Queue(i, o) => (Some(o.head), Queue(i, o.tail))
  }
  /**
   *Accès au premier élément, s'il existe (dernier élément entré)
   *
   * @return
   */
  def headOption(): Option[T] = in match{
    case x :: xs => Some(x)
    case Nil => out match{
      case Nil => None
      case _ => Some(out.last)
    }

  }
  /**
   * Vrai si la liste est vide.
   *
   * @return `true` si et seulement si la liste est vide, sinon `false`
   */
  def isEmpty: Boolean = in match{
    case x :: xs => false
    case Nil => out match{
      case x :: xs => false
      case Nil => true
    }
    // def isEmpty: Boolean = in.isEmpty && out.isEmpty // isEmpty sans match
  }
  /**
   * Retourne la taille de la queue.
   *
   * @return la taille de la queue
   */
  def length: Int = in.size + out.size

  /**
   * Accès au dernier élément de la queue, s'il existe (premier élément entré).
   *
   * @return
   */
  def rearOption(): Option[T] = out match{
    case x :: xs => Some(x)
    case Nil => in match{
      case Nil => None
      case _ => Some(in.last)
    }
  }
  /**
   * Convertit la `Queue` en `List` simplement chaînée.
   *
   * @return
   */
  //def toList: List[T] = out ::: out.reverse
   def toList: List[T] = out ::: in.reverse

  /**
   * Méthode map sur la queue.
   *
   * @param f la fonction de mapping
   * @return la nouvelle queue
   */
  def map[U](f: (T) => U): Queue[U] = Queue(in.map(f), out.map(f))

  /**
   * Méthode foldLeft sur la queue.
   *
   * @param z
   * @param op
   * @return
   */
  def foldLeft[U](z: U)(op: (U, T) => U): U ={
    val foldedIn = in.foldLeft(z)(op)
    out.reverse.foldLeft(foldedIn)(op)
  }
  // def foldLeft[U](z: U)(op: (U, T) => U): U =
  //     val foldOut = out.foldLeft(z)(op)
  //     in.reverse.foldLeft(foldOut)(op)
}
