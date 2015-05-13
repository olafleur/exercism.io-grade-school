class School {
  var db = Map[Int, List[String]]()

  def sorted = Map()

  def grade(i: Int) = {
    var maliste = List[String]()

    if(db.get(i).isDefined) {
      maliste = db.get(i).get
    }

    maliste
  }

  def add(s: String, i: Int) = {
    db = db.updated(i, grade(i) ::: List(s))
  }

}
