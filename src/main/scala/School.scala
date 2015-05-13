class School {
  var db = Map[Int, List[String]]()

  def sorted = Map()

  def grade(i: Int) = Seq()

  def add(s: String, i: Int) = {
    var maliste = List[String]()

    if(db.get(i).isDefined) {
      maliste = db.get(i).get
    }

    db = db.updated(i, maliste ::: List(s))
  }

}
