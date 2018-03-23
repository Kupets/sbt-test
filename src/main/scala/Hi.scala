object Hi {
  def main(args: Array[String]) :Unit = {
    val db = MongoFactory.database
    db.collectionNames().foreach(println)
    println(db.name)

    println("Hi, " + args (0) + "!")
  }
}