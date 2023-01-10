import scala.util.Random

object QueueTest {
  //import Queue._
  def main(args: Array[String]):Unit = {
    //example()
    println("================")
    println("Exemple du sujet")
    println()

    val qa: Queue[Int] = Queue[Int](Nil, Nil);
    println(qa)
    val qb: Queue[Int] = qa.enqueue(1);
    println(qb)
    val qc: Queue[Int] = qb.enqueue(2);
    println(qc)
    val qd: Queue[Int] = qc.enqueue(3);
    println(qd)
    val (a, qe) = qd.dequeue();
    println((a, qe))
    val qf: Queue[Int] = qe.enqueue(4);
    println(qf)
    val qg: Queue[Int] = qf.enqueue(5);
    println(qg)
    val (b, qh) = qg.dequeue();
    println((b, qh))
    val (c, qi) = qh.dequeue();
    println((c, qi))

    val (d, qj) = qi.dequeue();
    println((d, qj))
    val (e, qk) = qj.dequeue();
    println((e, qk))
    val isEmpty: Boolean = qk.isEmpty;
    println(isEmpty)
    println("================")
    println()
    println("================")

    println("verifier que une nouvelle Queue es bien vide ")
    val newQueueisEmpty = Queue[Int](Nil, Nil)
    if(newQueueisEmpty.isEmpty){
      println( "La nouvelle Queue est bien vide !!! ===>  "+ newQueueisEmpty.isEmpty )
      println("Test réussi")
      println("================")
    }else {
      println("Test échoué !!!")
      println("================")
    }
    println()

    val nonEmptyQueueisNotEmpty= Queue[Int](Nil, Nil).enqueue(1)
    println("================")
    println("verifier que une Queue qui n'est pas vide  retourne bien nonEmpty  ")

    if(!nonEmptyQueueisNotEmpty.isEmpty) {
      println("La Queue:")
      println (nonEmptyQueueisNotEmpty)
      println("nonEmpty===>"+ !nonEmptyQueueisNotEmpty.isEmpty)

      println("Test réussi")
      println("================")
    }else{
      println("Test échoué !!!")
      println("================")

    }
    println("================")
    println("===========test de la methode length========")
    println("Vérifier qu'une nouvelle Queue est de taille zéro   ")
    val  newQueueDeTailleZero=Queue[Int](Nil, Nil)
    if(newQueueDeTailleZero.length == 0){
      println("La Queue:")
      println(newQueueDeTailleZero)
      println("la taille de la Queue = "+newQueueDeTailleZero.length)
      println("Test réussi")
      println("================")
    }else{
      println("Test échoué !!!")
      println("================")
    }

    println("================")
    println("Vérifier pour une Queue de taille supérieure à zéro")
    val newQueueDeTaille3 =Queue[Int] (Nil, Nil).enqueue(1).enqueue(2).enqueue(3)
    if(newQueueDeTaille3.length == 3) {
      println("La Queue:")
      println(newQueueDeTaille3)
      println("la taille de la Queue = " + newQueueDeTaille3.length)
      println("Test réussi")
    }else {
      println("Test échoué !!!")
      println("================")
    }

    println("===========test de la methode dequeue ========")
    println("Retire le dernier élément d'une Queue contenante un seul élément =1\net la vérifier avec la méthode IsEmpty qui doit retourner true et voir si l'élément retiré est le bon ")
      val  (elr,dequeuedDeTaille1IsEmpty) =Queue[Int] (Nil, Nil).enqueue(1).dequeue()

    if (newQueueisEmpty.isEmpty && elr==1) {

      println(elr,dequeuedDeTaille1IsEmpty)
      println("et vide??:" + dequeuedDeTaille1IsEmpty.isEmpty)
      println("Test réussi")
      println("================")
    } else {
      println("Test échoué !!!")
      println("================")
    }
    println("Retire le dernier élément d'une Queue contenante deux éléments et  voir si l'élément retiré est le bon ");
    val value = new Random().nextInt(50)
    val (dequeuedValue, queue) = Queue[Int](Nil, Nil).enqueue(value).enqueue(1).dequeue()
    println(dequeuedValue, queue)
    if(value == dequeuedValue) {
      println("l'élément retiré est le bon ? :   ==>" + (value == dequeuedValue))
      println("Test réussi")
      println("================")
    }else {
      println("Test échoué !!!")
      println("================")
    }
    println("Faire dequeued deux fois et voir si on retourne la bonne valeur sûr une Queue de trois éléments")
     val value2 = new Random().nextInt(50)
    val (dequeuedValue2, queue1) = Queue[Int](Nil, Nil).enqueue(1).enqueue(value2).enqueue(1).dequeue()._2.dequeue()

    if (value2 == dequeuedValue2) {
      println((dequeuedValue2, queue1))
      println("l'élément retiré est le bon ? :   ==>" + (value2 == dequeuedValue2))
      println("Test réussi")

      println("================")
    } else {
      println("Test échoué !!!")
      println("================")
    }

    System.out.println("================Test de la methode headOption=============== \n")
    System.out.println ("Vérifier que headOption  d'une Queue Nil return NON : ")
    val headofEmptyReturnsNone = Queue[Int](Nil, Nil)
    if (headofEmptyReturnsNone.headOption().isEmpty ) {
      println( "Queue : \n"+ headofEmptyReturnsNone)
      println(" headOption  d'une Queue Nil  return ==>" +headofEmptyReturnsNone.headOption())
      println("Test réussi")
      println("================")
    } else {
      println("Test échoué !!!")
      println("================")
    }

    System.out.println("Vérifier que headOption  d'une Queue non vide return la bonne valeur  : ")

    val valuehop = new Random().nextInt(50)

    val headhop = Queue[Int](Nil, Nil).enqueue(1).enqueue(valuehop).headOption()
    if (headhop.isDefined & headhop.get ==valuehop) {
      println("dernier élément entré: "+valuehop)
      println("headhop.isDefined ==> " + headhop.isDefined)
      System.out.println("la valeure retourner====> "+ headhop.get )
      println("Test réussi")
      println("================")
    } else {
      println("Test échoué !!!")
      println("================")
    }


    System.out.println("================Test de la methode rearOption =============== \n")

    System.out.println("====rearOption d'une Queue Nil Return None =========== \n")
    val rearofEmptyReturnsNone = Queue[Int](Nil, Nil)
    if (rearofEmptyReturnsNone.rearOption().isEmpty) {

      println("LaQueue.rearOption().isEmpty =>"+rearofEmptyReturnsNone.rearOption().isEmpty)
      println("rearOption d'une Queue Nil "+rearofEmptyReturnsNone+" Return: ==> " +rearofEmptyReturnsNone.rearOption())
      println("Test réussi")
      println("================")
    } else {
      println("Test échoué !!!")
      println("================")
    }



    // newQueueIsEmpty()
   // nonEmptyQueueIsNotEmpty()
    //newQueueHasLengthZero()
    //singletonHasLengthOne()
   // dequeuedSingletonIsEmpty()
    //dequeuedSingletonReturnsCorrectValue()
   // dequeueReturnsCorrectValue1()
    //dequeueReturnsCorrectValue2()
    //headOfEmptyReturnsNone()
   // headOfNonEmptyReturnsCorrectValue()
    rearOfEmptyReturnsNone()
    rearOfNonEmptyReturnsCorrectValue()
    emptyQueueToListIsNil()
    queueToListOutputsCorrectValue()
    queueMapOutputsCorrectValue()
    foldedEmptyQueueEqualsBaseAccumulator()
    foldedQueueEqualsCorrectValue()

    println("Tous les tests ont réussi")


   /* def example(): Unit ={
      println("================")
      println("Exemple du sujet")
      println()
      val qa: Queue[Int] = Queue[Int](Nil, Nil); println(qa)
      val qb: Queue[Int] = qa.enqueue(1); println(qb)
      val qc: Queue[Int] = qb.enqueue(2); println(qc)
      val qd: Queue[Int] = qc.enqueue(3); println(qd)
      val (a, qe) = qd.dequeue(); println((a, qe))
      val qf: Queue[Int] = qe.enqueue(4); println(qf)
      val qg: Queue[Int] = qf.enqueue(5); println(qg)
      val (b, qh) = qg.dequeue(); println((b, qh))
      val (c, qi) = qh.dequeue(); println((c, qi))
      val (d, qj) = qi.dequeue(); println((d, qj))
      val (e, qk) = qj.dequeue(); println((e, qk))
      val isEmpty: Boolean = qk.isEmpty; println(isEmpty)
      println("================")
      println()
    }
*/
    /**
     *
     * TESTS UNITAIRES
     *
     */

    def newQueueIsEmpty(): Unit ={
      val newQueue = Queue[Int](Nil, Nil)
      assert(newQueue.isEmpty)
    }

    def nonEmptyQueueIsNotEmpty(): Unit ={
      val queue = Queue[Int](Nil, Nil).enqueue(1)
      assert(!queue.isEmpty)
    }

    def newQueueHasLengthZero(): Unit ={
      val newQueue = Queue[Int](Nil, Nil)
      assert(newQueue.length == 0)
    }

    def singletonHasLengthOne(): Unit ={
      val queue = Queue[Int](Nil, Nil).enqueue(1)
      assert(queue.length == 1)
    }

    def dequeuedSingletonIsEmpty(): Unit ={
      val (elem, queue) = Queue[Int](Nil, Nil).enqueue(1).dequeue()
      assert(queue.isEmpty)
    }

    def dequeuedSingletonReturnsCorrectValue(): Unit ={
      val value = new Random().nextInt(Int.MaxValue)
      val (dequeuedValue, queue) = Queue[Int](Nil, Nil).enqueue(value).dequeue()
      assert(value == dequeuedValue)
    }

    def dequeueReturnsCorrectValue1(): Unit ={
      val value = new Random().nextInt(Int.MaxValue)
      val (dequeuedValue, queue) = Queue[Int](Nil, Nil).enqueue(value).enqueue(1).dequeue()
      assert(value == dequeuedValue)
    }

    def dequeueReturnsCorrectValue2(): Unit ={
      val value = new Random().nextInt(Int.MaxValue)
      val (dequeuedValue, queue) = Queue[Int](Nil, Nil).enqueue(1).enqueue(value).enqueue(1).dequeue()._2.dequeue()
      assert(value == dequeuedValue)
    }

    def headOfEmptyReturnsNone(): Unit ={
      val queue = Queue[Int](Nil, Nil)
      assert(queue.headOption().isEmpty)
    }

    def headOfNonEmptyReturnsCorrectValue(): Unit ={
      val value = new Random().nextInt(Int.MaxValue)
      val head = Queue[Int](Nil, Nil).enqueue(1).enqueue(value).headOption()
      assert(head.isDefined)
      assert(head.get == value)
    }
    def rearOfEmptyReturnsNone(): Unit ={
      val queue = Queue[Int](Nil, Nil)
      assert(queue.rearOption().isEmpty)
    }
    def rearOfNonEmptyReturnsCorrectValue(): Unit ={
      val value = new Random().nextInt(Int.MaxValue)
      val rear = Queue[Int](Nil, Nil).enqueue(value).enqueue(1).rearOption()
      assert(rear.isDefined)
      assert(rear.get == value)
    }
    def emptyQueueToListIsNil(): Unit ={
      val queue = Queue[Int](Nil, Nil)
      val list = queue.toList
      assert(areEquals(list, Nil))
    }
    def queueToListOutputsCorrectValue(): Unit ={
      val queue = Queue[Int](Nil, Nil).enqueue(1).enqueue(2).enqueue(3).enqueue(4)
      val list = queue.toList
      val queueAsList = List(4, 3, 2, 1)
      assert(areEquals(list, queueAsList))
    }
    def queueMapOutputsCorrectValue(): Unit ={
      val queue = Queue[Int](Nil, Nil).enqueue(1).enqueue(2).enqueue(3).enqueue(4)
      val mappedQueue = queue.map(_.toString())
      val correctOutput = Queue[String](Nil, Nil).enqueue("1").enqueue("2").enqueue("3").enqueue("4")
      assert(areQueueEquals(mappedQueue, correctOutput))
    }
    def foldedEmptyQueueEqualsBaseAccumulator(): Unit ={
      val accumulator = 13
      val queue = Queue[Int](Nil, Nil)
      val sum = queue.foldLeft(accumulator)(_ + _)
      assert(sum == accumulator)
    }
    def foldedQueueEqualsCorrectValue(): Unit ={
      val accumulator = "Values: "
      val queue = Queue[Int](Nil, Nil).enqueue(3).enqueue(7).enqueue(2)
      val value = queue.foldLeft(accumulator)(_ ++ _.toString() ++ ", ")
      val correctValue = "Values: 2, 7, 3, "
      assert(value.equals(correctValue))
    }
    /**
     *
     * HELPERS
     *
     */




    def  areEquals[T](a: List[T], b: List[T]): Boolean = {
      (a, b) match{
        case (x :: xs, y :: ys) =>
          if (x.equals(y)) {
            areEquals(xs, ys)
          }
          else{
            false
          }
        case (Nil, Nil) => true
        case _ => false
      }
    }


    def  areQueueEquals[T] (a: Queue[T], b: Queue[T]): Boolean = {
      areEquals(a.in, b.in) && areEquals(a.out, b.out)
    }

    /*
    def foo(as: List[Int]) = as.length
    def foo(as: List[String])(implicit ev: DummyImplicit) = 42
    def foo(as: List[Boolean])(implicit ev1: DummyImplicit, ev2: DummyImplicit) = -1
    */

  }
}


