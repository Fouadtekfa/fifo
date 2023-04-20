import scala.util.Random

object QueueTest {
  import Queue._
  def main(args: Array[String]):Unit = {
    //example()

    println("Exemple du sujet")

    println("**************************************************************************************")

    val qa  = Queue[Int](Nil, Nil);
    println(qa)
    val qb = qa.enqueue(1);
    println(qb)
    val qc = qb.enqueue(2);
    println(qc)
    val qd = qc.enqueue(3);
    println(qd)
    val (a, qe) = qd.dequeue();
    println("qe====>"+qe  )
    println("qe.dequeue()====>"+qe.dequeue() )

    println((a, qe))
    val qf = qe.enqueue(4);
    println(qf)
    val qg = qf.enqueue(5);
    println(qg)
    val (b, qh) = qg.dequeue();
    println((b, qh))
    val (c, qi) = qh.dequeue();
    println((c, qi))

    val (d, qj) = qi.dequeue();
    println((d, qj))
    val (e, qk) = qj.dequeue();
    println((e, qk))
    val isEmpty= qk.isEmpty;
    println(isEmpty)
    println(qk.dequeue())
    println("************************************************************************************")



    //Test de la methode isEmpty
    System.out.println("\n********************************************Test de la methode isEmpty ******************************************** \n")
    println("verifier que une nouvelle Queue In Nil Out Nil es bien isEmpty")
    val newQueueisEmpty = Queue[Int](Nil, Nil)
    if(newQueueisEmpty.isEmpty){
      println(newQueueisEmpty)
      println( "LaQueue.isEmpty ===>  "+ newQueueisEmpty.isEmpty )
      println("Test réussi")
      println("********************************************")
    }else {
      println("Test échoué !!!")
      println("================")
    }

    val nonEmptyQueueisNotEmpty= Queue[Int](Nil, Nil).enqueue(1).enqueue(2).enqueue(3).enqueue(4)
    println("verifier que une Queue qui n'est pas vide de In Non Nill Out Nil retourne bien nonEmpty  ")
    if(!nonEmptyQueueisNotEmpty.isEmpty) {
      println("La Queue:")
      println (nonEmptyQueueisNotEmpty)
      println("!LaQueue.isEmpty===>"+ !nonEmptyQueueisNotEmpty.isEmpty)

      println("Test réussi")
      println("********************************************")
    }else{
      println("Test échoué !!!")
      println("================")
    }
    println("verifier que une Queue qui n'est pas vide de In  Nill Out non Nil retourne bien nonEmpty")
    val nonEmptyQueueisNotEmpty1 =qe ;
    if (!nonEmptyQueueisNotEmpty1.isEmpty) {
      println("La Queue:")
      println(nonEmptyQueueisNotEmpty1)
      println("!LaQueue.isEmpty===>" + !nonEmptyQueueisNotEmpty1.isEmpty)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }
    println("verifier que une Queue qui n'est pas vide de In  Non Nill Out Non Nil retourne bien nonEmpty")
    val nonEmptyQueueisNotEmpty2 = qh;
    if (!nonEmptyQueueisNotEmpty2.isEmpty) {
      println("La Queue:")
      println(nonEmptyQueueisNotEmpty2)
      println("!LaQueue.isEmpty===>" + !nonEmptyQueueisNotEmpty2.isEmpty)
      println("Test réussi")
      println("************************************************************************************************************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }


    println("\n********************************************Test de la methode length ********************************************\n")
    println("Vérifier qu'une  Queue de In Nil et de Out Nil est de taille zéro   ")

    val  newQueueDeTailleZero=Queue[Int](Nil, Nil)
    if(newQueueDeTailleZero.length == 0){
      println("La Queue:")
      println(newQueueDeTailleZero)
      println("LaQueue.length = "+newQueueDeTailleZero.length)
      println("Test réussi")
      println("********************************************\n")
    }else{
      println("Test échoué !!!")
      println("================")
    }

    println("Vérifier pour une Queue  de In Non Nil  et de Out Nil ")
    val newQueueDeTaille3 =Queue[Int] (Nil, Nil).enqueue(1).enqueue(2).enqueue(3)
    if(newQueueDeTaille3.length == 3) {
      println("La Queue:")
      println(newQueueDeTaille3)
      println("la taille de la Queue = " + newQueueDeTaille3.length)
      println("Test réussi")
      println("********************************************\n")
    }else {
      println("Test échoué !!!")
      println("================")
    }
    println("Vérifier pour une Queue  de In Nil  et de Out Non Nil ")
    val newQueueDeTaille4 = qe
    if (newQueueDeTaille4.length == 2) {
      println("La Queue:")
      println(newQueueDeTaille4)
      println("LaQueue.length =" + newQueueDeTaille4.length)
      println("Test réussi")
      println("****************************************************************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }
    println("Vérifier pour une Queue  de  In Non Nil et de Out Non Nil ")
    val queuelength5 = qh

    if (queuelength5.length == 3) {
      println("La Queue:")
      println(queuelength5)
      println("LaQueue.length =" + queuelength5.length)
      println("Test réussi")
      println("****************************************************************************************\n")
    } else {
      println("Test échoué !!!")
      println("================")
    }

    println("\n********************************************test de la methode dequeue ********************************************\n")
    println("Retire le dernier élément d'une Queue contenante un seul élément =1\net la vérifier avec la méthode IsEmpty qui doit retourner true et voir si l'élément retiré est le bon ")
      val  (elr,dequeuedDeTaille1IsEmpty) =Queue[Int] (Nil, Nil).enqueue(1).dequeue()

    if (newQueueisEmpty.isEmpty && elr==1) {

      println(elr,dequeuedDeTaille1IsEmpty)
      println("et vide??:" + dequeuedDeTaille1IsEmpty.isEmpty)
      println("Test réussi")
      println("********************************************")
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
      println("********************************************")
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

      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }

    System.out.println("\n********************************************Test de la methode headOption******************************************** \n")
    System.out.println ("Vérifier que headOption  d'une Queue Nil return NON : ")
    val headofEmptyReturnsNone = Queue[Int](Nil, Nil)
    if (headofEmptyReturnsNone.headOption().isEmpty ) {
      println( "Queue : \n"+ headofEmptyReturnsNone)
      println(" headOption  d'une Queue Nil  return ==>" +headofEmptyReturnsNone.headOption())
      println("Test réussi")
      println("********************************************")
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
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }


    System.out.println("\n********************************************Test de la methode rearOption =============== \n")

    System.out.println("rearOption d'une Queue Nil Return None \n")
    val rearofEmptyReturnsNone = Queue[Int](Nil, Nil)
    if (rearofEmptyReturnsNone.rearOption().isEmpty) {

      println("LaQueue.rearOption().isEmpty =>"+rearofEmptyReturnsNone.rearOption().isEmpty)
      println("rearOption d'une Queue Nil "+rearofEmptyReturnsNone+" Return: ==> " +rearofEmptyReturnsNone.rearOption())
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }
    System.out.println("Vérifier que rearOption  d'une Queue non vide return la bonne valeur  : ")
    val valuerear = new Random().nextInt(50)
    val rear = Queue[Int](Nil, Nil).enqueue(valuerear).enqueue(1).rearOption()

    if (rear.isDefined & rear.get == valuerear) {
      println("premier élément entré "+valuerear)
      System.out.println( "LaQueue.rearOption()==> "+rear)
      println("la valeure retourner ==>" +rear.get)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("========================================================")
    }
    System.out.println("\n********************************************Test de la methode ToList ******************************************** \n")

    System.out.println("ToList sur un Queue de In Nil et Out Nil  ")
    val queueniltolist = Queue[Int](Nil, Nil)
    val tolistNil = queueniltolist.toList
    if (tolistNil == List()) {
      println(queueniltolist)
      println("Résultats obtenus ===> "+tolistNil )
     // println(tolistNil)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }
    System.out.println("ToList sur un Queue in non vide out vide ")

    val queuetolist = Queue[Int](Nil, Nil).enqueue(1).enqueue(2).enqueue(3).enqueue(4)
    val queuetolist1= queuetolist.toList
    if ( queuetolist1 == List(1,2,3,4)) {
      println(queuetolist)
      println("Résultats obtenus ===> "+queuetolist1 )
      println("Test réussi")
      println("********************************************\n")
    } else {
      println("Test échoué !!!")
      println("****************************************************************************************\n")
    }
    System.out.println("\n********************************************Test de la methode Map******************************************** \n")

    System.out.println("Map sur Queue de In Nil et de Out Nil")

    val queuemap = Queue[Int](Nil, Nil)
    val mappedQueue = queuemap.map(_*2)
    val correctOutput = Queue[Int](Nil, Nil)
    if (mappedQueue==correctOutput) {
      //println("la  Queue vide in Nil out Nil  :\n"+ queuemap)
      println(queuemap)
      println("Queue.map(_*2)=>"+mappedQueue)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("===================================")
    }

    System.out.println("Test de la methode Map sur Queue In non Nil Out Nil ")
    val queuemap1 = Queue[Int](Nil, Nil).enqueue(1).enqueue(2).enqueue(3)
    val mappedQueue1 = queuemap1.map(_ * 2)
    val correctOutput1 = Queue[Int](List(6,4,2), Nil)
    if (mappedQueue1 == correctOutput1 ) {
      println(queuemap1)
      println("Résultat attendu =>"+correctOutput1)
      println("Résultat obtenu : ")
      println("Queue.map(_*2)=>"+mappedQueue1)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }
    System.out.println("Test de la methode Map sur Queue In  Nil Out non Nil \n")


    val queuemap2 = Queue[Int](Nil, Nil).enqueue(1).enqueue(2).enqueue(3)
    val (map,queuemap3)  =queuemap2.dequeue()
    val queuemap4 =queuemap3.map(_ *2)
    val correctOutput2=Queue[Int](Nil, List(4,6))

    if (queuemap4 == correctOutput2) {
      println(queuemap3)
      println("Résultat attendu =>" + correctOutput2)
      println("Résultat obtenu : ")
      println("Queue.map(_*2)=>" + queuemap4)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }
    System.out.println("Test de la methode Map sur Queue In non Nil Out non Nil \n")
    val queuemap5= queuemap3.enqueue(4).enqueue(5).enqueue(6)
    val queuemap6 = queuemap5.map(_ * 2)
    val correctOutput3 = Queue[Int](List(12, 10, 8), List(4, 6))
    if (queuemap6 == correctOutput3) {
      println(queuemap5)
      println("Résultat attendu =>" + correctOutput3)
      println("Résultat obtenu : ")
      println("Queue.map(_*2)=>" + queuemap6)
      println("Test réussi")
      println("**************************************************************************************** \n")
    } else {
      println("Test échoué !!!")
      println("=======================")
    }
      println("\n********************************************Test de la methode foldLeft******************************************** \n")
      println("Test de la methode foldLeft sur Queue vide   \n")
      val element_neutre=1
      val foldLeftQ1=Queue[Int](Nil, Nil)
      val foldLeftR1=foldLeftQ1.foldLeft(1)(_ * _)
    if (element_neutre == foldLeftR1) {
      println(foldLeftQ1)
      println("l'élément neutre = "+element_neutre)
      println("LA_Queue.foldLeft(1)(_ * _)= " +foldLeftR1)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }
    println("Test de la methode foldLeft sur Queue in Non Vide Out Vide   ")
    val foldLeftQ2 = Queue[Int](Nil, Nil).enqueue(1).enqueue(2).enqueue(3).enqueue(4)
    val foldLeftR2 = foldLeftQ2.foldLeft(1)(_ * _)
    if (element_neutre*24 == foldLeftR2) {
      println(foldLeftQ2)
      println("l'élément neutre = " + element_neutre)
      println("LA_Queue.foldLeft(1)(_ * _)= " + foldLeftR2)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }
    println("Test de la methode foldLeft sur Queue in Nil Out Non Nil ")
    val (foldLeftd ,foldLeftQ3) = Queue[Int](Nil, Nil).enqueue(1).enqueue(2).enqueue(3).enqueue(4).dequeue()
    val foldLeftR3 = foldLeftQ3.foldLeft(1)(_ * _)
    if (element_neutre * 24 == foldLeftR3) {
      println(foldLeftQ3)
      println("l'élément neutre = " + element_neutre)
      println("LA_Queue.foldLeft(1)(_ * _)= " + foldLeftR3)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      //sys.exit(0)
      println("================")
    }

    println("Test de la methode foldLeft sur Queue in Non Nil Out Non Nil")
    val  foldLeftQ4 =foldLeftQ3.enqueue(5).enqueue(6)
    val foldLeftR4 = foldLeftQ4.foldLeft(1)(_ * _)

    if (element_neutre * 720 == foldLeftR4) {
      println(foldLeftQ4)
      println("l'élément neutre = " + element_neutre)
      println("LA_Queue.foldLeft(1)(_ * _)= " + foldLeftR4)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }


    //val foldLeft2=qd.foldLeft(1)(_*_)
      //println(foldLeft2)

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
    //rearOfEmptyReturnsNone()
    //rearOfNonEmptyReturnsCorrectValue()
   // emptyQueueToListIsNil()
   // queueToListOutputsCorrectValue()
   // queueMapOutputsCorrectValue()
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


    /**
     * vérifier que deux listes sont égaux
     * @param a List A
     * @param b List B
     * @tparam T contenue de la liste
     * @return  vrai ou faux
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


    /**
     *  vérifier que deux Queue sont égaux
     * @param a Queue
     * @param b Queue
     * @tparam T contenue
     * @return vrai ou faux
     */
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


