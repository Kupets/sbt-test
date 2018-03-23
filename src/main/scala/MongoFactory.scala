import com.mongodb.casbah.{MongoClient, MongoClientURI, MongoConnection}

/**
  * Date: 23.03.2018
  *
  * @author Kuptsov Nikolay (nkuptsov@gmail.com)
  */
object MongoFactory {
  private val SERVER = "sbt-test-mkhml.mongodb.net"
  private val PORT   = 27017
  private val DATABASE = "test"
  private val COLLECTION = "stocks"
  val uri = MongoClientURI("mongodb://sbt:sbt@sbt-test-shard-00-00-mkhml.mongodb.net:27017,sbt-test-shard-00-01-mkhml.mongodb.net:27017,sbt-test-shard-00-02-mkhml.mongodb.net:27017/test?ssl=true&replicaSet=sbt-test-shard-0&authSource=admin")
  val client = MongoClient(uri)
  val database = client.getDB("test")
}