class School {
  var db = Map[Int, List[String]]()

  def sorted = {
    var sorteddb = Map[Int, List[String]]()

    for (i <- 1 to 10)
    {
      if (db.get(i).isDefined)
      {
        sorteddb = sorteddb.updated(i, db.get(i).get.sorted)
      }
    }

    sorteddb
  }

  def grade(i: Int) = {
    if (db.get(i).isDefined) {
      db.get(i).get
    } else {
      List.empty[String]
    }
  }

  def add(s: String, i: Int) = {
    db = db.updated(i, grade(i) ::: List(s))
  }

}
