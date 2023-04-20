
object Main {

  def main(args: Array[String]):Unit = {

    println("L'exemple")

    println("**************************************************************************************")

    val qa  = Queue[Int](Nil, Nil);
    println("A = Queue[Int](Nil, Nil) : "+ qa)
    val qb = qa.enqueue(1);
    println("B = A.enqueue(1) : "+ qb)
    val qc = qb.enqueue(2);
    println("C = B.enqueue(2) : "+qc)
    val qd = qc.enqueue(3);
    println("D = C.enqueue(3) : "+qd)
    val (a, qe) = qd.dequeue();
    println("(a, E) = D.dequeue() : "+(a, qe))
    val qf = qe.enqueue(4);
    println("F = E.enqueue(4): "+qf)
    val qg = qf.enqueue(5);
    println( "G = F.enqueue(5)  :"+qg)
    val (b, qh) = qg.dequeue();
    println("(b, H) = G.dequeue() : "+(b, qh))
    val (c, qi) = qh.dequeue();
    println("(c, I) = H.dequeue() : "+(c, qi))

    val (d, qj) = qi.dequeue();
    println("(d, J) = I.dequeue() :"+(d, qj))
    val (e, qk) = qj.dequeue();
    println("(e, K) = J.dequeue() : "+(e, qk))
    val isEmpty= qk.isEmpty;
    println("K.isEmpty :"+isEmpty)
    //println(qk.dequeue())
    println("************************************************************************************")

    /*
    Pour les tests, je vérifie que le résultat obtenu correspond au résultat attendu, et si c'est le cas,
    alors le test est considéré comme réussi, sinon il est considéré comme échoué.
     */
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


    //Test de la methode length

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
    //la methode dequeue

    println("\n********************************************test de la methode dequeue ********************************************\n")
    println("dequeue sur Queue de In  Nil et de out Nil")
    val (elr0, dequeue0) = qk.dequeue()
    val dequeue_attendu0 = None
    if (elr0 == dequeue_attendu0) {
      println(qk)
      println("Queue.dequeue ==>" + (elr0, dequeue0))
      println("Test réussi")
      println("*********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }


    println("dequeue sur Queue de In Non Nil et de Out Nil")
    val (elr3,dequeue3)= qc.dequeue()
    val dequeue_attendu3=1
    //.get nous retourne l'element
    if (elr3.get == dequeue_attendu3) {
      println(qc)
      println("Queue.dequeue ==>" + (elr3,dequeue3) )
      println("Test réussi")
      println("***************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }
    println("dequeue sur Queue de In Nil et de out Non Nil")
    val (elr1, dequeue1) = qe.dequeue()
    val dequeue_attendu1 = 2
    if (elr1.get == dequeue_attendu1) {
      println(qe)

      println("Queue.dequeue ==>" + (elr1, dequeue1))

      println("Test réussi")
      println("***************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }


    println("dequeue sur Queue de In Non Nil et de Out Non Nil ")
    val (elr2, dequeue2) = qg.dequeue()
    val dequeue_attendu2 = 2
    if (elr2.get == dequeue_attendu2) {
      println(qg)

      println("Queue.dequeue ==>" + (elr2, dequeue2))

      println("Test réussi")
      println("*****************************************")
    } else {
      println("Test échoué !!!")
      println("**************************************")
    }



    //Test de la methode headOption

    System.out.println("\n********************************************Test de la methode headOption******************************************** \n")
    System.out.println ("Vérifier que headOption  d'une Queue Nil return NON : ")
    val headOption0 = qa
    /*
    isDefined cest pour vérifier si l'objet Option[T] retourné par headOption()
     contient un élément ou non.
     elle nos retourne true si l'option contient un élément
      (c'est-à-dire Some(x)) et false si elle est vide (c'est-à-dire None).
     */
    if ( headOption0.headOption()==None && !headOption0.headOption().isDefined) {
      println( "Queue : \n"+ headOption0)
      println(" headOption.Queue==>" +headOption0.headOption())
      println("headOption.Queue contient un élément ??: ==>" +headOption0.headOption().isDefined )
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }
    System.out.println("headOption  d'une Queue de In Non Nill et de out Nill return la bonne valeur  : ")
    val headOption1 = qc.headOption();
    val headOption_attendu2=Some(2)

    if (headOption1.isDefined & headOption_attendu2 ==headOption1 ) {
      println(qc)
      println("dernier élément entré: " + 2)
      println("headhop.isDefined ==> " + headOption1.isDefined)
      System.out.println("résultat obtenu====> " + headOption1)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }

    System.out.println("headOption  d'une Queue de In  Nill et de out Non Nill return la bonne valeur  : ")
    val headOption2 = qe.headOption();
    val headOption_attendu3 = Some(3)

    if (headOption2.isDefined & headOption_attendu3 == headOption2) {
      println(qe)
      println("dernier élément entré: " +  3)
      println("headhop.isDefined ==> " + headOption2.isDefined)
      System.out.println("résultat obtenu====> " + headOption2)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }

    System.out.println("headOption  d'une Queue de In  Non Nill et de  out Non Nill return la bonne valeur  : ")
    val headOption3 = qg.headOption();
    val headOption_attendu4 = Some(5)

    if (headOption3.isDefined & headOption_attendu4 == headOption3) {
      println(qg)
      println("dernier élément entré: " + 5)
      println("headhop.isDefined ==> " + headOption3.isDefined)
      System.out.println("résultat obtenu====> " + headOption3)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }



    System.out.println("\n********************************************Test de la methode rearOption =============== \n")

    System.out.println("rearOption d'une Queue De In Nil et de Out Nil Return None \n")
    val rearOption0 = qa
    //rearOption().isEmpty=> true si l'option est vide (c'est-à-dire None)
    if (rearOption0.rearOption().isEmpty) {
      println(qa)
      println("LaQueue.rearOption().isEmpty =>"+rearOption0.rearOption().isEmpty)
      println("rearOption().isEmpty=> true si l'option est vide (c'est-à-dire None)")
      println("rearOption d'une Queue Nil "+rearOption0+" Return: ==> " +rearOption0.rearOption())
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }

    System.out.println("rearOption  d'une Queue de In Non Nill et de Out Nil  return la bonne valeur  : ")
    val rearOption1 = qc.rearOption()
    val rearOption_attendu1=Some(1)
    if (rearOption1.isDefined & rearOption1 == rearOption_attendu1) {
      println(qc)
      println("résultat attendu "+Some(1))
      System.out.println( "LaQueue.rearOption()==> "+rearOption1)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("========================================================")
    }


    System.out.println("rearOption  d'une Queue de In Nill et de Out Non Nil  return la bonne valeur  : ")
    val rearOption2 = qe.rearOption()
    val rearOption_attendu2 = Some(2)
    if (rearOption2.isDefined & rearOption2 == rearOption_attendu2) {
      println(qe)
      println("résultat attendu " + Some(2))
      System.out.println("LaQueue.rearOption()==> " + rearOption2)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("========================================================")
    }
    System.out.println("rearOption  d'une Queue de In Non Nill et de Out Non Nil  return la bonne valeur  : ")
    val rearOption3 = qg.rearOption()
    val rearOption_attendu3 = Some(2)
    if (rearOption3.isDefined & rearOption3 == rearOption_attendu3) {
      println(qg)
      println("résultat attendu " + Some(2))
      System.out.println("LaQueue.rearOption()==> " + rearOption3)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("========================================================")
    }

    System.out.println("\n********************************************Test de la methode ToList ******************************************** \n")

    System.out.println("ToList sur un Queue de In Nil et Out Nil  ")
    val tolist0 = qa.toList
    if (tolist0 == List()) {
      println(qa)
      println("Résultats obtenus de Queue.ToList ===> "+tolist0)
      println("Test réussi")
      println("********************************************")
    } else {
      println("Test échoué !!!")
      println("================")
    }

    System.out.println("ToList sur un Queue in non vide out vide ")
    val qtolist1 = Queue[Int](Nil, Nil).enqueue(1).enqueue(2).enqueue(3).enqueue(4)
    val resultat_ToList1= qtolist1.toList
    if ( resultat_ToList1 == List(1,2,3,4)) {
      println(qtolist1)
      println("Résultats obtenus ===> "+resultat_ToList1 )
      println("Test réussi")
      println("********************************************\n")
    } else {
      println("Test échoué !!!")
      println("****************************************************************************************\n")
    }
    System.out.println("ToList sur un Queue in Nill  out Non Nil ")
    val qtolist2 = qe.toList
    if (qtolist2 == List( 2, 3)) {
      println(qe)
      println("Résultats obtenus ===> " + qtolist2)
      println("Test réussi")
      println("********************************************\n")
    } else {
      println("Test échoué !!!")
      println("****************************************************************************************\n")
    }
    System.out.println("ToList sur un Queue in Non  Nil out Non  Nil")
    val qtolist3 = qg.toList
    if (qtolist3 == List(2, 3,4,5)) {
      println(qg)
      println("Résultats obtenus ===> " + qtolist3)
      println("Test réussi")
      println("*************************************************************\n")
    } else {
      println("Test échoué !!!")
      println("***************************************************************\n")
    }

    System.out.println("\n********************************************Test de la methode Map******************************************** \n")

    System.out.println("Map sur Queue de In Nil et de Out Nil")

    val queuemap = qa
    val Map0 = queuemap.map(_*2)
    val Map_attendu0 = Queue[Int](Nil, Nil)
    if (Map0==Map_attendu0) {
      println(queuemap)
      println("Queue.map(_*2)=>"+Map0)
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

    val accumulator = "Values: "
    val queue = Queue[Int](Nil, Nil).enqueue(3).enqueue(7).enqueue(2)
    println("exemeple de foldLeft"+queue+" toString  est  un accumulator = "+accumulator)
    val value = queue.foldLeft(accumulator)(_ ++ _.toString() ++ ", ")
    println(value)


  }
}

