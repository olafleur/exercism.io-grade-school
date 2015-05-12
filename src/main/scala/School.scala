class School {
  var db = Map[Int, List[String]]()

  def sorted = Map()

  def grade(i: Int) = Seq()

  def add(s: String, i: Int) = {
    db = db.updated(i, List(s))
  }

}
