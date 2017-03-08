package server
import org.http4s._, org.http4s.dsl._
/**
  * Created by salim on 3/8/2017.
  */

object AdjustmentService {

  val adjustmentService = HttpService {
    case GET -> Root / "hello" / name =>
      Ok(s"Hello, $name.")
  }

}
